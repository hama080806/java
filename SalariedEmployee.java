public class SalariedEmployee {
	private double annualSalary;

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
