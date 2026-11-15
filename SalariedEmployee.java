import java.time.LocalDate;

public class SalariedEmployee extends Employee {
	private double annualSalary;

	public SalariedEmployee(String first_Name, String last_Name, LocalDate date_of_Birth, Address address,
			String mobile_Number, String personal_Email, String work_Email) {
		super(first_Name, last_Name, date_of_Birth, address, mobile_Number, personal_Email, work_Email);
		setAnnualSalary(annualSalary);
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		if (annualSalary >= 21600 && annualSalary <= 120000){
			this.annualSalary = annualSalary;
			System.out.println("salary has been set");
		}
		else{
			System.out.println("invalid, salary must be between  21,600 and 120,000 NIS per year");
		}
		
	}

	@Override
	public String toString() {
		return "SalariedEmployee [annualSalary=" + annualSalary + "]";
	}

	static double pay(double annual){
		return annual/12;
	}
}
