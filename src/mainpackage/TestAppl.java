/**
 * 
 */
package mainpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.text.rtf.RTFEditorKit;

/**
 * @author Kraun
 *
 */
/**
 * @author Kraun
 *
 */
public class TestAppl {

	public static void main(String[] args) {
		int numberOperation = 0;
		boolean isExit = true;
		Service service = new Service();
		String consumerFileName = "consumer.txt";
		String depositFileName = "deposit.txt";
		String templateFileName = "template.txt";
		String outFileName = "out.txt";
		ArrayList<Consumer> consumerList = null;
		ArrayList<Deposit> depositList = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			consumerList = service.readConsumerListFromFile(consumerFileName, br);
			depositList = service.readDepositListFromFile(depositFileName, br);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		while (isExit) {
			service.printMainMenu();
			try {
				numberOperation = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}

			switch (numberOperation) {
			case 1: {
				long taxNumber;
				try {
					if (Consumer.findDuplicateTaxNumber((taxNumber = service.inputTaxNumberFromConcole(br)),
							consumerList)) {
						System.out.println("\nYou already have a client with same taxNumber!\n");
					} else {
						Consumer consumer = new Consumer();
						try {
							consumerList.add(consumer.addDataToConsumer(br, taxNumber));
							service.writeConsumerListToFile(consumerList, consumerFileName);
						} catch (NumberFormatException | IOException e) {
							e.printStackTrace();
						}
					}
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
				break;
			}

			case 2: {
				try {
					service.printInfoClientByTaxNumber(service.inputTaxNumberFromConcole(br), consumerList);
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
				break;
			}
			case 3: {
				try {
					service.printDepoCalcMenu(br);
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
				break;
			}
			case 4: { ///// add new deposit agreement
				int type = 0;
				long ownerTaxNumber = 0;
				int termOfDeposit = 0;
				int sign = 0;
				double sumDeposit = 0;
				System.out.print(
						"==============================================\nInput deposit type:\nTerm deposit ----------"
								+ "--------------------- 1\nAccumulative deposit ----------------------- 2\n");
				try {
					type = Integer.parseInt(br.readLine());
					if (!Consumer.findDuplicateTaxNumber(ownerTaxNumber = service.inputTaxNumberFromConcole(br),
							consumerList)) {
						System.out.println("\nYou don't have a consumer. Create a client now!\n");
						continue;
					}
					;
					System.out.print("Input deposit term: ");
					termOfDeposit = Integer.parseInt(br.readLine());
					System.out.print("Input loyalty sigh: 0 - no loyalty; 1 - pension; 2 - old client:");
					sign = Integer.parseInt(br.readLine());
					System.out.print("Input summ deposit: ");
					sumDeposit = Double.parseDouble(br.readLine());
				} catch (NumberFormatException | IOException e1) {
					e1.printStackTrace();
				}
				Deposit deposit = null;
				if (type == 1) {
					deposit = new TermDeposit();
				} else if (type == 2) {
					deposit = new AccumulativeDeposit();
				}
				try {
					depositList.add(deposit.fillNewDepoAgreement(ownerTaxNumber, termOfDeposit, sign, sumDeposit));
					service.writeDepositListToFile(depositList, depositFileName);
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
				break;
			}
			case 5: {
				service.printAllDeposits(depositList);
				break;
			}
			case 6: {
				try {
					service.printInfoDepositByTaxNumber(service.inputTaxNumberFromConcole(br), depositList);
				} catch (NumberFormatException | IOException e) {
					e.printStackTrace();
				}
				break;
			}
			case 7: { // Spisok vsix clientiv
				for (Consumer consumer : consumerList) {
					System.out.println(consumer.printInfoClient());
				}
				break;
			}
			case 8: { /// find by numberDepo and print agreement
				System.out.println("Input numberDeposit: ");
				try {
					String numberDeposit = br.readLine();
					Deposit deposit = service.compareNumberDepositToFile(numberDeposit, depositList);
					System.out.println(deposit);
					String temp = (deposit.openTemplateFromFile(templateFileName, br));
					deposit.writeDepoToFile(temp, outFileName);
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
			case 9: {
				isExit = false;
				break;
			}
			default: {
				isExit = false;
			}
			}

		}
		System.out.println("End program!");
	}
}
