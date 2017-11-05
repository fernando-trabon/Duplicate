package mainpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Kraun
 *
 */
public class TermDeposit extends Deposit implements Loyalty {
	private static final double PERCENT = 12.5;
	private String depositName;

	/**
	 * @param br
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	static void termDepoCalc(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("----------------------------------------------");
		System.out.println("Input deposit sum: ");
		double sumTermDepo = Double.parseDouble(br.readLine());
		System.out.println("Input deposit term(3, 6, 9, 12 months): ");
		int termTermDepo = Integer.parseInt(br.readLine());
		GregorianCalendar gCalendar = new GregorianCalendar();
		int numderDayOfYear;
		int year = gCalendar.get(Calendar.YEAR);
		if (gCalendar.isLeapYear(year)) {
			numderDayOfYear = 366;
		} else {
			numderDayOfYear = 365;
		}
		double sumPercent = (sumTermDepo * PERCENT * termTermDepo * 30) / (numderDayOfYear * 100);
		System.out.print(
				"—ума нарахованих в≥дсотк≥в за " + termTermDepo + " м≥с€ц≥(в)\n при ставц≥ " + PERCENT + " % складе ");
		System.out.printf("%.2f", sumPercent);
		System.out.println("\n----------------------------------------------");
	}

	/**
	 * 
	 */
	public TermDeposit() {
		super();
	}

	/**
	 * @param numberDeposit
	 * @param ownerTaxNumber
	 * @param type
	 * @param dataOn
	 * @param dateOff
	 * @param duration
	 * @param finalPercent
	 * @param sumDeposit
	 */
	public TermDeposit(String numberDeposit, long ownerTaxNumber, int type, String dataOn, String dateOff, int duration,
			double finalPercent, double sumDeposit) {
		super(numberDeposit, ownerTaxNumber, type, dataOn, dateOff, duration, finalPercent, sumDeposit);
	}

	/**
	 * @param numberDeposit
	 * @param ownerTaxNumber
	 * @param type
	 * @param dataOn
	 * @param dateOff
	 * @param duration
	 * @param finalPercent
	 * @param sumDeposit
	 * @param depositName
	 */
	public TermDeposit(String numberDeposit, long ownerTaxNumber, int type, String dataOn, String dateOff, int duration,
			double finalPercent, double sumDeposit, String depositName) {
		super(numberDeposit, ownerTaxNumber, type, dataOn, dateOff, duration, finalPercent, sumDeposit);
		this.depositName = depositName;
	}

	/**
	 * @return the depositName
	 */
	public String getDepositName() {
		return depositName;
	}

	/**
	 * @param depositName
	 *            the depositName to set
	 */
	public void setDepositName(String depositName) {
		this.depositName = depositName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "-" + depositName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see mainpackage.Loyalty#setPensionBonus(double)
	 */
	@Override
	public double setPensionBonus(double percent) {
		return percent + PENSION_BONUS;
	}

	@Override
	public double setOldClientBonus(double percent) {
		return percent + OLD_CLIENT_BONUS;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see mainpackage.Deposit#fillNewDepoAgreement(long, int, boolean)
	 */
	@Override
	public Deposit fillNewDepoAgreement(long ownerTaxNumber, int termOfDeposit, int sign, double sumDeposit)
			throws NumberFormatException, IOException {
		GregorianCalendar gCalendar = new GregorianCalendar();
		setDataOn(gCalendar.get(Calendar.DATE) + "." + (gCalendar.get(Calendar.MONTH) + 1) + "."
				+ gCalendar.get(Calendar.YEAR));
		setDateOff(calculateDepoDateOff(termOfDeposit));
		setNumberDeposit(generateDepoNumber());
		setDuration(termOfDeposit);
		switch (sign) {
		case 0: {
			setFinalPercent(PERCENT);
			setDepositName(REGULAR_CLIENT_DEPOSIT_NAME);
			break;
		}
		case 1: {
			setFinalPercent(this.setPensionBonus(PERCENT));
			setDepositName(PENSION_DEPOSIT_NAME);
			break;
		}
		case 2: {
			setFinalPercent(this.setOldClientBonus(PERCENT));
			setDepositName(OLD_CLIENT_DEPOSIT_NAME);
			break;
		}
		default: {
			setFinalPercent(PERCENT);
			setDepositName(REGULAR_CLIENT_DEPOSIT_NAME);
			break;
		}
		}
		setType(1);
		setOwnerTaxNumber(ownerTaxNumber);
		setSumDeposit(sumDeposit);
		return this;

	}

	@Override
	public String printDepositInfo() {
		return "----------------------------------------------\n" + "Deposit number = " + getNumberDeposit()
				+ "\nOwner TaxNumber = " + String.valueOf(getOwnerTaxNumber()) + "\nDeposit type = "
				+ String.valueOf(getType()) + "\nDate On = " + getDataOn() + "\nDate Off = " + getDateOff()
				+ "\nDuration = " + String.valueOf(getDuration()) + "\nFinal Percent = " + getFinalPercent()
				+ "\nDeposit sum = " + String.valueOf(getSumDeposit()) + "\nDeposit Name = " + getDepositName()
				+ "\n----------------------------------------------\n";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see mainpackage.Deposit#saveDepositToFile(java.lang.String,
	 * java.io.BufferedReader)
	 */
	@Override
	public String openTemplateFromFile(String templateFile, BufferedReader br)
			throws FileNotFoundException, IOException {
		String line = null;
		String text = "";
		br = new BufferedReader(new FileReader(templateFile));
		while (((line = br.readLine()) != null) && (line != "")) {
			text = text + line;
		}
		System.out.println(text);
		Pattern p = Pattern.compile("%depositName%");
		Matcher m = p.matcher(text);
		text = m.replaceFirst(getDepositName());

		p = Pattern.compile("%numberDeposit%");
		m = p.matcher(text);
		text = m.replaceFirst(getNumberDeposit());

		p = Pattern.compile("%dataOn%");
		m = p.matcher(text);
		text = m.replaceFirst(getDataOn());

		p = Pattern.compile("%dataOff%");
		m = p.matcher(text);
		text = m.replaceFirst(getDateOff());

		p = Pattern.compile("%dataOff%");
		m = p.matcher(text);
		text = m.replaceFirst(getDateOff());

		p = Pattern.compile("%sum%");
		m = p.matcher(text);
		text = m.replaceFirst(getDateOff());

		return text;

	}

	@Override
	void writeDepoToFile(String inString, String fileName) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		bw.write(inString);
		bw.close();
	}

}
