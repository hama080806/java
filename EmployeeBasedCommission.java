import java.time.LocalDate;

public class EmployeeBasedCommission extends CommissionEmployee {
	private double baseSalary;

	public EmployeeBasedCommission(String first_Name, String last_Name, LocalDate date_of_Birth, Address address,
			String mobile_Number, String personal_Email, String work_Email) {
		super(first_Name, last_Name, date_of_Birth, address, mobile_Number, personal_Email, work_Email);
		setBaseSalary(baseSalary);
		
		
	}
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "EmployeeBasedCommission [baseSalary=" + baseSalary + "]";
	}
static double pay(double sal){
	return 0;
}
}
