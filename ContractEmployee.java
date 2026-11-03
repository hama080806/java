public class ContractEmployee {
	private double contractRate;
	private byte numberOfMonths;

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
