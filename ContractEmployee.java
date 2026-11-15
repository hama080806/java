import java.time.LocalDate;

public class ContractEmployee extends Employee {
	private double contractRate;
	private byte numberOfMonths;

	public ContractEmployee(String first_Name, String last_Name, LocalDate date_of_Birth, Address address,
			String mobile_Number, String personal_Email, String work_Email) {
		super(first_Name, last_Name, date_of_Birth, address, mobile_Number, personal_Email, work_Email);
		setContractRate(contractRate);
		setNumberOfMonths(numberOfMonths);
		
	}

	public double getContractRate() {
		return contractRate;
	}

	public void setContractRate(double contractRate) {
		if (contractRate < 0){
			System.out.println("invalid ate, rate must be a positive number");
		}
		if(contractRate >=10000){
			this.contractRate = contractRate;
			System.out.println("rate has been set");
		}
		else{
			System.out.println("invalid, ate needs to be above 10,000");
		}
		
	}

	public byte getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(byte numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	@Override
	public String toString() {
		return "ContractEmployee [contractRate=" + contractRate + ", numberOfMonths=" + numberOfMonths + "]";
	}

	static double pay(double r,byte numMonth ){
		return r/numMonth;
	}
}
