
import java.time.*;
import java.util.*;

public class StaffMember {
	private String First_Name;
	private String Last_Name;
	private LocalDate Date_of_Birth;
	Address address = new Address();
	private String Mobile_Number;
	private String Personal_Email;
	private String Work_Email;

	public StaffMember(String first_Name, String last_Name, LocalDate date_of_Birth, Address address, String mobile_Number,
			String personal_Email, String work_Email) {
		super();
		setFirst_Name(first_Name);
		setLast_Name(last_Name);
		setDate_of_Birth(date_of_Birth);
		this.address = address;
		setMobile_Number(mobile_Number);
		setPersonal_Email(personal_Email);
		Work_Email = work_Email;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		if (first_Name == null || first_Name.isEmpty()) {
			System.out.println("no first name entered");
			return;
		}
		if (!(first_Name.charAt(0) >= 'A' && first_Name.charAt(0) <= 'Z')) {
			System.out.println("invalid, name didnt start with capital letter");
			return;
		}

		for (int i = 1; i < first_Name.length(); i++) {
			if ((first_Name.charAt(i) <= 'z' && first_Name.charAt(i) >= 'a')) {
				continue;

			} else {
				System.out.println("invalid name");
				return;

			}
		}
		First_Name = first_Name;

	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		if (last_Name == null || last_Name.isEmpty()) {
			System.out.println("no last name entered");
			return;
		}
		if (!(last_Name.charAt(0) >= 'A' && last_Name.charAt(0) <= 'Z')) {
			System.out.println("invalid, name didnt start with capital letter");
			return;
		}

		for (int i = 1; i < last_Name.length(); i++) {
			if ((last_Name.charAt(i) <= 'z' && last_Name.charAt(i) >= 'a')) {
				continue;

			} else {
				System.out.println("invalid name");
				return;

			}
		}
		Last_Name = last_Name;
	}

	public LocalDate getDate_of_Birth() {
		return Date_of_Birth;
	}

	public void setDate_of_Birth(LocalDate date_of_Birth) {
		if(DOB(date_of_Birth)) {
			Date_of_Birth = date_of_Birth;
		}
		else {
			System.out.println("invalid date of birth");
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMobile_Number() {

		return Mobile_Number;
	}

	public void setMobile_Number(String mobile_Number) {
		if (mobile_Number == null || mobile_Number.isEmpty() || mobile_Number.length() != 9) {
			System.out.println("invalid number");
			return;
		}

		for (int i = 0; i < mobile_Number.length(); i++) {

			if (mobile_Number.charAt(i) >= '0' && mobile_Number.charAt(i) <= '9') {

				continue;
			} else {
				System.out.println("invalid number");
				return;
			}

		}
		if (!((mobile_Number.charAt(0) == '0' && mobile_Number.charAt(1) == '5') && (mobile_Number.charAt(2) == '9' || mobile_Number.charAt(2)=='6'))) {
			System.out.print("invalid number");
			return;
		}
		else {
			System.out.println("valid number");
			Mobile_Number=mobile_Number;
		}
		

	}

	public String getPersonal_Email() {
		return Personal_Email;
	}

	public void setPersonal_Email(String personal_Email) {
		if(PersonalEmail(personal_Email)) {
		Personal_Email = personal_Email;
		}
		else {
			System.out.println("invalid email");
			return;
		}
	}

	public String getWork_Email() {
		return Work_Email;
	}

	public void setWork_Email(String work_Email) {
		workEmailAuto(First_Name, Last_Name, work_Email);
	}

	static boolean PersonalEmail(String email) {

		if (email == null || email.isEmpty()) {
			return false;
		}

		if (!((email.charAt(0) >= 'a' && email.charAt(0) <= 'z') || (email.charAt(0) >= 'A' && email.charAt(0) <= 'Z')) ) {
			return false;
		}

		int countAT = 0;

		for (int i = 1; i < email.length(); i++) {

			if (email.charAt(i) == '!' || email.charAt(i) == '$') {
				return false;
			}

			if (email.charAt(i) == '@') {
				countAT++;
			}
		}

		if (countAT != 1) {
			return false;
		}

		if (email.endsWith(".com") || email.endsWith(".edu") || email.endsWith(".org") || email.endsWith(".net")) {
			return true;
		} else {
			return false;
		}
	}

	static boolean DOB(LocalDate dob) {
		LocalDate today = LocalDate.now();
		if (dob == null) {
			return false;
		}
		int age = Period.between(dob, today).getYears();

		if (dob.isAfter(today)) {
			return false;
		}
		if (age >= 16 && age < 67) {
			return true;
			
		} else {
			return false;
		}
		
	}
 
	static String workEmailAuto(String first, String last, String company) {
		if (first == null || last == null || company == null || first.isEmpty() || last.isEmpty()
				|| company.isEmpty()) {
			return "invalid";
		}
		String firstNameInitial = first.toLowerCase();
		firstNameInitial = firstNameInitial.substring(0, 1);
		return firstNameInitial + last.toLowerCase() + "@" + company.toLowerCase() + ".edu";

	}
 
	static String generatePassword() {
		Random rand = new Random();
		String num = ("0123456789");
		String lowC = ("qwertyuiopasdfghjklzxcvbnm");
		String upperC = ("QWERTYUIOPASDFGHJKLZXCVBNM");
		String special = ("~!@#$%^&*()_+{}:<>?,./|;[]'");
		StringBuilder pass = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			pass.append(num.charAt(rand.nextInt(num.length())));

		}
		for (int i = 0; i < 4; i++) {
			pass.append(lowC.charAt(rand.nextInt(lowC.length())));
		}
		for (int i = 0; i < 4; i++) {
			pass.append(upperC.charAt(rand.nextInt(upperC.length())));
		}
		for (int i = 0; i < 4; i++) {
			pass.append(special.charAt(rand.nextInt(special.length())));
		}
		char[] newpass = new char[16];
		for (int i = 0; i < 16; i++) {
			newpass[i] = pass.charAt(i);
		}

		for (int i = 0; i < 16; i++) {
			char temp = newpass[i];
			int j = rand.nextInt(16);
			newpass[i] = newpass[j];
			newpass[j] = temp;

		}
		String password = new String(newpass);
		return  password;
	}

}
