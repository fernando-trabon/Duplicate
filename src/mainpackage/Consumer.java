/**
 * 
 */
package mainpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Kraun
 *
 */
public class Consumer {
	private long taxNumber;
	private String surname;
	private String name;
	private String middlename;
	private Passport passport;
	private Address address;
	private String status;

	/**
	 * 
	 */
	public Consumer() {
	}

	/**
	 * @param taxNumber
	 * @param surname
	 * @param name
	 * @param middlename
	 * @param passport
	 * @param address
	 * @param status
	 */

	public Consumer(long taxNumber, String surname, String name, String middlename, mainpackage.Passport passport,
			mainpackage.Address address, String status) {
		this.taxNumber = taxNumber;
		this.surname = surname;
		this.name = name;
		this.middlename = middlename;
		this.passport = passport;
		this.address = address;
		this.status = status;
	}

	/**
	 * @param taxNumber
	 * @param consumerList
	 * @return
	 */
	static boolean findDuplicateTaxNumber(long taxNumber, ArrayList<Consumer> consumerList) {
		boolean indicator = false;
		for (Consumer consumer : consumerList) {
			if (consumer.getTaxNumber() == taxNumber) {
				indicator = true;
			}
		}
		return indicator;

	}
	
	
	/**
	 * @return the taxNumber
	 */
	public long getTaxNumber() {
		return taxNumber;
	}

	/**
	 * @param taxNumber
	 *            the taxNumber to set
	 */
	public void setTaxNumber(long taxNumber) {
		this.taxNumber = taxNumber;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 *            the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the middlename
	 */
	public String getMiddlename() {
		return middlename;
	}

	/**
	 * @param middlename
	 *            the middlename to set
	 */
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	/**
	 * @return the passport
	 */
	public Passport getPassport() {
		return passport;
	}

	/**
	 * @param passport
	 *            the passport to set
	 */
	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return taxNumber + "-" + surname + "-" + name + "-" + middlename + "-" + passport + "-" + address + "-"
				+ status;
	}

	/**
	 * @return
	 */
	public String printInfoClient() {
		return "----------------------------------------------\n" + "ІПН = " + String.valueOf(getTaxNumber())
				+ "\nSurname = " + getSurname() + "\nName = " + getName() + "\nMiddlename = " + getMiddlename()
				+ "\nPassport Seria = " + getPassport().getPassportSeries() + "\nPassport number = "
				+ getPassport().getPassportNumber() + "\nPassport date = " + getPassport().getDateOfIssue()
				+ "\nPassport issued by = " + getPassport().getIssuedBy() + "\nPost index = "
				+ getAddress().getPostIndex() + "\nRegion = " + getAddress().getRegion() + "\nDistrict = "
				+ getAddress().getDistrict() + "\nCity = " + getAddress().getCity() + "\nStreet = "
				+ getAddress().getStreet() + "\nHouse = " + getAddress().getHouseNumber() + "\nHousing number = "
				+ getAddress().getHousingNumber() + "\nAparnment number = " + getAddress().getApartmentNumber()
				+ "\nStatus = " + getStatus() + "\n----------------------------------------------\n";
	}

	/**
	 * @param br
	 * @param taxNumber
	 * @return
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	Consumer addDataToConsumer(BufferedReader br, long taxNumber) throws NumberFormatException, IOException {
		setTaxNumber(taxNumber);
		System.out.println("\nInput surname: ");
		setSurname(br.readLine());
		System.out.println("\nInput name: ");
		setName(br.readLine());
		System.out.println("\nInput middlename: ");
		setMiddlename(br.readLine());
		System.out.println("\nInput postIndex: ");
		int postIndex = Integer.parseInt(br.readLine());
		System.out.println("\nInput region: ");
		String region = br.readLine();
		System.out.println("\nInput district: ");
		String district = br.readLine();
		System.out.println("\nInput city: ");
		String city = br.readLine();
		System.out.println("\nInput street: ");
		String street = br.readLine();
		System.out.println("\nInput houseNumber: ");
		int houseNumber = Integer.parseInt(br.readLine());
		System.out.println("\nInput housingNumber: ");
		int housingNumber = Integer.parseInt(br.readLine());
		System.out.println("\nInput apartmentNumber: ");
		int apartmentNumber = Integer.parseInt(br.readLine());
		Address address = new Address(postIndex, region, district, city, street, houseNumber, housingNumber,
				apartmentNumber);
		System.out.println("\nInput passportSeries: ");
		String passportSeries = br.readLine();
		System.out.println("\nInput passportNumber: ");
		int passportNumber = Integer.parseInt(br.readLine());
		System.out.println("\nInput dateOfIssue: ");
		String dateOfIssue = br.readLine();
		System.out.println("\nInput issuedBy: ");
		String issuedBy = br.readLine();
		Passport passport = new Passport(passportSeries, passportNumber, dateOfIssue, issuedBy);
		setPassport(passport);
		setAddress(address);
		setStatus("активний");
		return this;
	}
}
