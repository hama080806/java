public class WeeklyEmployee {
	private byte noOfWeeks;
	private float wagePerWeek;

	public byte getNoOfWeeks() {
		return noOfWeeks;
	}

	public void setNoOfWeeks(byte noOfWeeks) {
		if (noOfWeeks >= 1 && noOfWeeks <= 4) {
			this.noOfWeeks = noOfWeeks;
			System.out.println("done.");
		} else {
			System.out.println("number of weeks has not been set, it has o be between 1 an 4");
		}

	}

	public float getWagePerWeek() {
		return wagePerWeek;
	}

	public void setWagePerWeek(float wage) {
		if (wage >= 300 && wage <= 700) {
			this.wagePerWeek = wage;
			System.out.println("wage has been set");
		} else {
			System.out.println("invalid,wage mus b between 300 n 700");
		}
	}

	@Override
	public String toString() {
		return "WeeklyEmployee [noOfWeeks=" + noOfWeeks + ", wagePerWeek=" + wagePerWeek + "]";
	}

	static double pay(byte week, float wage) {
		return week * wage;
	}
}
