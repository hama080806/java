public class Address {

	private String Street;
	private String City;
	private String Country;

	Address() {
		Street = null;
		City = null;
		Country = null;
	}

	Address(String street, String city, String country) {
		setStreet(street);
		setCity(city);
		setCountry(country);
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		if (isValid(street)) {
			Street = street;
			System.out.print("street has been set");
		} else {
			System.out.println("street has not been set");
		}

	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		if (isValid(city)) {
			City = city;
			System.out.print("city has been set");
		} else {
			System.out.println("city has not been set");
		}

	}

	public String getCountry() {

		return Country;
	}

	public void setCountry(String country) {

		if (isValid(country)) {
			Country = country;
			System.out.print("country has been set");
		} else {
			System.out.println("country has not been set");
		}
	}

	@Override
	public String toString() {
		return "Address [Street=" + Street + ", City=" + City + ", Country=" + Country + "]";
	}

	static boolean isValid(String string) {
		if (string == null || string.isEmpty()) {
			return false;
		}
		for (int i = 0; i < string.length(); i++) {
			if (!((string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
					|| (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'))
					|| ((string.charAt(i) >= '1') && (string.charAt(i) <= '9'))) {
				return false;
			}

		}
		return true;
	}

}