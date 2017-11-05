package mainpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Kraun
 *
 */
public class Deposit {
	private static final int NUMBER_MONTH_YEAR = 12;
	private String numberDeposit;
	private long ownerTaxNumber;
	private int type;
	private String dataOn;
	private String dateOff;
	private int duration;
	private double finalPercent;
	private double sumDeposit;

	/**
	 * 
	 */
	public Deposit() {
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
	public Deposit(String numberDeposit, long ownerTaxNumber, int type, String dataOn, String dateOff, int duration,
			double finalPercent, double sumDeposit) {
		super();
		this.numberDeposit = numberDeposit;
		this.ownerTaxNumber = ownerTaxNumber;
		this.type = type;
		this.dataOn = dataOn;
		this.dateOff = dateOff;
		this.duration = duration;
		this.finalPercent = finalPercent;
		this.sumDeposit = sumDeposit;
	}

	/**
	 * @param termOfDeposit
	 * @return
	 */
	public static String calculateDepoDateOff(int termOfDeposit) {
		GregorianCalendar gCalendar = new GregorianCalendar();
		int[] numberDayYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int depositDateOn = gCalendar.get(Calendar.DATE);
		int depositMonthOn = gCalendar.get(Calendar.MONTH) + 1;
		int depositYearOn = gCalendar.get(Calendar.YEAR);
		int depositYearOff = depositYearOn;
		int depositMonthOff = depositMonthOn + termOfDeposit;
		int depositDateOff = 0;
		String depoDateOff = null;
		if (gCalendar.isLeapYear(depositYearOn + 1) == true) {
			numberDayYear[1] = 29;
		}
		if (depositMonthOff > NUMBER_MONTH_YEAR) {
			depositYearOff = ++depositYearOn;
			depositMonthOff = depositMonthOff - NUMBER_MONTH_YEAR;
		}
		depositDateOff = --depositDateOn;
		if (depositDateOff == 0) {
			depositMonthOff--;
			depositDateOff = numberDayYear[--depositMonthOff];
		}
		if ((depositMonthOff == 2) && (depositDateOff > numberDayYear[1])) {
			depositDateOff = numberDayYear[1];
		}
		depoDateOff = depositDateOff + "." + depositMonthOff + "." + depositYearOff;
		return depoDateOff;
	}
	
	/**
	 * @return the numberDeposit
	 */
	public String getNumberDeposit() {
		return numberDeposit;
	}

	/**
	 * @param numberDeposit
	 *            the numberDeposit to set
	 */
	public void setNumberDeposit(String numberDeposit) {
		this.numberDeposit = numberDeposit;
	}

	/**
	 * @return the ownerTaxNumber
	 */
	public long getOwnerTaxNumber() {
		return ownerTaxNumber;
	}

	/**
	 * @param ownerTaxNumber
	 *            the ownerTaxNumber to set
	 */
	public void setOwnerTaxNumber(long ownerTaxNumber) {
		this.ownerTaxNumber = ownerTaxNumber;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the dataOn
	 */
	public String getDataOn() {
		return dataOn;
	}

	/**
	 * @param dataOn
	 *            the dataOn to set
	 */
	public void setDataOn(String dataOn) {
		this.dataOn = dataOn;
	}

	/**
	 * @return the dateOff
	 */
	public String getDateOff() {
		return dateOff;
	}

	/**
	 * @param dateOff
	 *            the dateOff to set
	 */
	public void setDateOff(String dateOff) {
		this.dateOff = dateOff;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration
	 *            the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @return the finalPercent
	 */
	public double getFinalPercent() {
		return finalPercent;
	}

	/**
	 * @param finalPercent
	 *            the finalPercent to set
	 */
	public void setFinalPercent(double finalPercent) {
		this.finalPercent = finalPercent;
	}

	/**
	 * @return the sumDeposit
	 */
	public double getSumDeposit() {
		return sumDeposit;
	}

	/**
	 * @param sumDeposit
	 *            the sumDeposit to set
	 */
	public void setSumDeposit(double sumDeposit) {
		this.sumDeposit = sumDeposit;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return numberDeposit + "-" + ownerTaxNumber + "-" + type + "-" + dataOn + "-" + dateOff + "-" + duration + "-"
				+ finalPercent + "-" + sumDeposit;
	}

	

	/**
	 * @return
	 */
	public String generateDepoNumber() {
		GregorianCalendar gCalendar = new GregorianCalendar();
		return gCalendar.get(Calendar.SECOND) + "/" + gCalendar.get(Calendar.MINUTE) + "/"
				+ gCalendar.get(Calendar.HOUR) + "/" + gCalendar.get(Calendar.DATE) + "/"
				+ gCalendar.get(Calendar.MONTH) + "/" + gCalendar.get(Calendar.YEAR);
	}

	/**
	 * @param ownerTaxNumber
	 * @param termOfDeposit
	 * @param sign
	 * @param sumDeposit
	 * @return
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public Deposit fillNewDepoAgreement(long ownerTaxNumber, int termOfDeposit, int sign, double sumDeposit)
			throws NumberFormatException, IOException {
		return null;
	}

	/**
	 * @return
	 */
	public String printDepositInfo() {
		return null;
	}

	/**
	 * @param inString
	 * @param fileName
	 * @throws IOException
	 */
	void writeDepoToFile(String inString, String fileName) throws IOException {
	}

	/**
	 * @param templateFile
	 * @param br
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String openTemplateFromFile(String templateFile, BufferedReader br)
			throws FileNotFoundException, IOException {
		String line = null;
		String inputString = null;
		br = new BufferedReader(new FileReader(templateFile));
		while (((line = br.readLine()) != null) && (line != "")) {
			inputString = inputString + line;
		}
		System.out.println(inputString);
		String pattern = "%depositName%";
		String text = inputString;
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		m.replaceFirst("+++");
		return null;
	}

}
