import java.time.LocalDate;

public class Volunteer extends StaffMember {

	private String associationName;

	public Volunteer(String first_Name, String last_Name, LocalDate date_of_Birth, Address address,
			String mobile_Number, String personal_Email, String work_Email) {
		super(first_Name, last_Name, date_of_Birth, address, mobile_Number, personal_Email, work_Email);
		setAssociationName(associationName);
	}
	double Pay() {
		return 0;
	}

	public String getAssociationName() {
		return associationName;
	}

	public void setAssociationName(String associationName) {
		this.associationName = associationName;
	}

	@Override
	public String toString() {
		return "Volunteer [associationName=" + associationName + "]";
	}
	
	

}
