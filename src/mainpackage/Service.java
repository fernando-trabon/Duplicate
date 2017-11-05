package mainpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Kraun
 *
 */
public class Service {

	/**
	 * 
	 */
	public Service() {
	}

	/**
	 * 
	 */
	void printMainMenu() {
		System.out.print("==============================================");
		System.out.println("\nВведіть номер операції, яку Ви хочете виконати");
		System.out.println("==============================================");
		System.out.println("Add new consumer -------------------------- 1 ");
		System.out.println("Find a consumer by taxNumber -------------- 2 ");
		System.out.println("Депозитний калькулятор -------------------- 3 ");
		System.out.println("Add a new deposit agreement --------------- 4 ");
		System.out.println("Print all deposits ------------------------ 5 ");
		System.out.println("Find deposit list by taxNumber ------------ 6 ");
		System.out.println("Print all clients ------------------------- 7 ");
		System.out.println("Save deposit agreement by name to file ---- 8 ");
		System.out.println("Exit -------------------------------------- 9 ");
		System.out.println("==============================================");
		System.out.print("Ваш вибір: ");
	}

	/**
	 * @param br
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	void printDepoCalcMenu(BufferedReader br) throws NumberFormatException, IOException {
		boolean isExit = false;
		int operationNumber;
		while (!isExit) {
			System.out.print("==============================================");
			System.out.println("\nВведіть номер операції, яку Ви хочете виконати");
			System.out.println("==============================================");
			System.out.println("Calculation term deposit ------------------ 1 ");
			System.out.println("Calculation accumulative deposit ---------- 2 ");
			System.out.println("Exit to main menu ------------------------- 0 ");
			System.out.println("==============================================");
			System.out.print("Ваш вибір: ");
			operationNumber = Integer.parseInt(br.readLine());
			switch (operationNumber) {
			case 1: {
				TermDeposit.termDepoCalc(br);
				break;
			}
			case 2: {
				System.out.println("You chose 2th punkt");
				break;
			}
			case 0: {
				isExit = true;
				break;
			}
			default: {
				isExit = true;
				break;
			}
			}

		}
	}

	/**
	 * @param depositList
	 */
	public void printAllDeposits(ArrayList<Deposit> depositList) {
		for (Deposit deposit : depositList) {
			if (deposit.getType() == 1) {
				System.out.println(deposit.printDepositInfo());
			} else {
				System.out.println(deposit.printDepositInfo());
			}

		}
	}

	/**
	 * @param fileName
	 * @param br
	 * @return
	 * @throws IOException
	 */
	ArrayList<Consumer> readConsumerListFromFile(String fileName, BufferedReader br) throws IOException {
		ArrayList<Consumer> consumerList = new ArrayList<>();
		String line = null;
		br = new BufferedReader(new FileReader(fileName));
		Consumer consumer;
		Passport passport;
		Address address;
		while (((line = br.readLine()) != null) && (line != "")) {
			String[] array = line.split("-");
			long taxNumber = Long.parseLong(array[0]);
			String surname = array[1];
			String name = array[2];
			String middlename = array[3];
			String passportSeries = array[4];
			int passportNumber = Integer.parseInt(array[5]);
			String dateOfIssue = array[6];
			String issuedBy = array[7];
			int postIndex = Integer.parseInt(array[8]);
			String region = array[9];
			String district = array[10];
			String city = array[11];
			String street = array[12];
			int houseNumber = Integer.parseInt(array[13]);
			int housingNumber = Integer.parseInt(array[14]);
			int apartmentNumber = Integer.parseInt(array[15]);
			String status = array[16];
			passport = new Passport(passportSeries, passportNumber, dateOfIssue, issuedBy);
			address = new Address(postIndex, region, district, city, street, houseNumber, housingNumber,
					apartmentNumber);
			consumer = new Consumer(taxNumber, surname, name, middlename, passport, address, status);
			consumerList.add(consumer);
		}
		return consumerList;
	}

	/**
	 * @param consumerList
	 * @param fileName
	 * @throws IOException
	 */
	public void writeConsumerListToFile(ArrayList<Consumer> consumerList, String fileName) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		for (Consumer consumer : consumerList) {
			bw.write(consumer.toString() + '\n');
		}
		bw.close();
	}

	/**
	 * @param taxNumber
	 * @param consumerList
	 */
	public void printInfoClientByTaxNumber(long taxNumber, ArrayList<Consumer> consumerList) {
		for (Consumer consumer : consumerList) {
			if (consumer.getTaxNumber() == taxNumber) {
				System.out.println(consumer.printInfoClient());
			}
		}
	}

	/**
	 * @param taxNumber
	 * @param depositList
	 */
	public void printInfoDepositByTaxNumber(long taxNumber, ArrayList<Deposit> depositList) {
		for (Deposit deposit : depositList) {
			if (deposit.getOwnerTaxNumber() == taxNumber) {
				System.out.println(deposit.printDepositInfo());
			}
		}
	}

	/**
	 * @param fileName
	 * @param br
	 * @return
	 * @throws IOException
	 */
	public ArrayList<Deposit> readDepositListFromFile(String fileName, BufferedReader br) throws IOException {
		ArrayList<Deposit> depositList = new ArrayList<>();
		Deposit deposit = null;
		String line = null;
		br = new BufferedReader(new FileReader(fileName));
		while ((line = br.readLine())!= null ) {
			String[] array = line.split("-");
			String numberDeposit = array[0];
			Long ownerTaxNumber = Long.parseLong(array[1]);
			int type = Integer.parseInt(array[2]);
			String dataOn = array[3];
			String dateOff = array[4];
			int duration = Integer.parseInt(array[5]);
			double finalPercent = Double.parseDouble(array[6]);
			String depositName = array[8];
			double sumDeposit = Double.parseDouble(array[7]);
			if (type == 1) {
				deposit = new TermDeposit(numberDeposit, ownerTaxNumber, type, dataOn, dateOff, duration, finalPercent,
						sumDeposit, depositName);
			}
			if (type == 2) {
				deposit = new AccumulativeDeposit(numberDeposit, ownerTaxNumber, type, dataOn, dateOff, duration,
						finalPercent, sumDeposit, depositName);
			}
			depositList.add(deposit);
		}
		return depositList;
	}

	/**
	 * @param depositList
	 * @param fileName
	 * @throws IOException
	 */
	void writeDepositListToFile(ArrayList<Deposit> depositList, String fileName) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		for (Deposit deposit : depositList) {
			bw.write(deposit.toString() + '\n');
		}
		bw.close();
	}

	/**
	 * @param br
	 * @return
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public long inputTaxNumberFromConcole(BufferedReader br) throws NumberFormatException, IOException {
		System.out.print("Input taxNumber: ");
		return Long.parseLong(br.readLine());
	}

	/**
	 * @param numberDeposit
	 * @param depositList
	 * @return
	 * @throws IOException
	 */
	public Deposit compareNumberDepositToFile(String numberDeposit, ArrayList<Deposit> depositList) throws IOException {
		Deposit monitor = null;
		for (Deposit current : depositList) {
			if (current.getNumberDeposit().equals(numberDeposit)) {
				monitor = current;
			} 
		}
		return monitor;
	}
}
