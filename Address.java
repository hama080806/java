public class Address {

	private String Street;
	private String City;
	private String Country;

	Address(){
		Street=null;
		City=null;
		Country=null;
	}

	Address(String street,String city,String country){
		setStreet(street);
		setCity(city);
		setCountry(country);
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
}
