package mainpackage;

public class Passport {
	private String passportSeries;
	private int passportNumber;
	private String dateOfIssue;
	private String issuedBy;

	/**
	 * 
	 */
	public Passport() {
	}

	/**
	 * @param passportSeries
	 * @param passportNumber
	 * @param dateOfIssue
	 * @param issuedBy
	 */
	public Passport(String passportSeries, int passportNumber, String dateOfIssue, String issuedBy) {
		this.passportSeries = passportSeries;
		this.passportNumber = passportNumber;
		this.dateOfIssue = dateOfIssue;
		this.issuedBy = issuedBy;
	}

	/**
	 * @return the passportSeries
	 */
	public String getPassportSeries() {
		return passportSeries;
	}

	/**
	 * @param passportSeries the passportSeries to set
	 */
	public void setPassportSeries(String passportSeries) {
		this.passportSeries = passportSeries;
	}

	/**
	 * @return the passportNumber
	 */
	public int getPassportNumber() {
		return passportNumber;
	}

	/**
	 * @param passportNumber the passportNumber to set
	 */
	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

	/**
	 * @return the dateOfIssue
	 */
	public String getDateOfIssue() {
		return dateOfIssue;
	}

	/**
	 * @param dateOfIssue the dateOfIssue to set
	 */
	public void setDateOfIssue(String dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	/**
	 * @return the issuedBy
	 */
	public String getIssuedBy() {
		return issuedBy;
	}

	/**
	 * @param issuedBy the issuedBy to set
	 */
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return passportSeries + "-" + passportNumber + "-"
				+ dateOfIssue + "-" + issuedBy;
	}
	
}
