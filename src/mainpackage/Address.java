package mainpackage;

/**
 * @author Kraun
 *
 */
public class Address {
	private int postIndex;
	private String region;
	private String district;
	private String city;
	private String street;
	private int houseNumber;
	private int housingNumber;
	private int apartmentNumber;

	/**
	 * 
	 */
	public Address() {
	}

	/**
	 * @param postIndex
	 * @param region
	 * @param district
	 * @param city
	 * @param street
	 * @param houseNumber
	 * @param housingNumber
	 * @param apartmentNumber
	 */
	public Address(int postIndex, String region, String district, String city, String street, int houseNumber,
			int housingNumber, int apartmentNumber) {
		this.postIndex = postIndex;
		this.region = region;
		this.district = district;
		this.city = city;
		this.street = street;
		this.houseNumber = houseNumber;
		this.housingNumber = housingNumber;
		this.apartmentNumber = apartmentNumber;
	}

	/**
	 * @return the postIndex
	 */
	public int getPostIndex() {
		return postIndex;
	}

	/**
	 * @param postIndex the postIndex to set
	 */
	public void setPostIndex(int postIndex) {
		this.postIndex = postIndex;
	}

	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the houseNumber
	 */
	public int getHouseNumber() {
		return houseNumber;
	}

	/**
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * @return the housingNumber
	 */
	public int getHousingNumber() {
		return housingNumber;
	}

	/**
	 * @param housingNumber the housingNumber to set
	 */
	public void setHousingNumber(int housingNumber) {
		this.housingNumber = housingNumber;
	}

	/**
	 * @return the apartmentNumber
	 */
	public int getApartmentNumber() {
		return apartmentNumber;
	}

	/**
	 * @param apartmentNumber the apartmentNumber to set
	 */
	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return postIndex + "-" + region + "-" + district + "-" + city
				+ "-" + street + "-" + houseNumber + "-" + housingNumber
				+ "-" + apartmentNumber;
	}
	
}
