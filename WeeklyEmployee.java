import java.time.LocalDate;

public class WeeklyEmployee extends Employee {
	private byte noOfWeeks;
	private float wagePerWeek;

	public WeeklyEmployee(String first_Name, String last_Name, LocalDate date_of_Birth, Address address,
			String mobile_Number, String personal_Email, String work_Email) {
		super(first_Name, last_Name, date_of_Birth, address, mobile_Number, personal_Email, work_Email);
		setNoOfWeeks(noOfWeeks);
		setWagePerWeek(wagePerWeek);
	}

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
