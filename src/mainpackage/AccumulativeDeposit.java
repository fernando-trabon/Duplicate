package mainpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
/**
 * @author Kraun
 *
 */
/**
 * @author Kraun
 *
 */
public class AccumulativeDeposit extends Deposit implements Loyalty {
	private static final double PERCENT = 10.5;
	private String depositName;

	/**
	 * 
	 */
	public AccumulativeDeposit() {
		super();
	}

	/**
	 * @param name
	 */
	public AccumulativeDeposit(String depositName) {
		super();
		this.depositName = depositName;
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
	public AccumulativeDeposit(String numberDeposit, long ownerTaxNumber, int type, String dataOn, String dateOff,
			int duration, double finalPercent, double sumDeposit, String depositName) {
		super(numberDeposit, ownerTaxNumber, type, dataOn, dateOff, duration, finalPercent, sumDeposit);
		this.depositName = depositName;
	}

	public AccumulativeDeposit(String numberDeposit, long ownerTaxNumber, int type, String dataOn, String dateOff,
			int duration, double finalPercent, double sumDeposit) {
		super(numberDeposit, ownerTaxNumber, type, dataOn, dateOff, duration, finalPercent, sumDeposit);
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
	 * @see mainpackage.Deposit#fillNewDepoAgreement(long, int, int, double)
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
			setDepositName(REGULAR_CLIENT_ACCUM_DEPOSIT_NAME);
			break;
		}
		case 1: {
			setFinalPercent(this.setPensionBonus(PERCENT));
			setDepositName(PENSION_ACCUM_DEPOSIT_NAME);
			break;
		}
		case 2: {
			setFinalPercent(this.setOldClientBonus(PERCENT));
			setDepositName(OLD_CLIENT_ACCUM_DEPOSIT_NAME);
			break;
		}
		default: {
			setFinalPercent(PERCENT);
			setDepositName(REGULAR_CLIENT_ACCUM_DEPOSIT_NAME);
			break;
		}
		}
		setType(2);
		setOwnerTaxNumber(ownerTaxNumber);
		setSumDeposit(sumDeposit);
		return this;
	}

	@Override
	public double setPensionBonus(double percent) {
		return percent + PENSION_BONUS / 2;
	}

	@Override
	public double setOldClientBonus(double percent) {
		return percent + OLD_CLIENT_BONUS;
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

	@Override
	public String openTemplateFromFile(String templateFile, BufferedReader br) throws IOException {
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
		br.close();
		return text;
	}

	@Override
	void writeDepoToFile(String inString, String fileName) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
		bw.write(inString);
		bw.close();
	}
}
