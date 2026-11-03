public class HourlyEmployee {
	private short hours;
	private float rate;

	public short getHours() {
		return hours;
	}

	public void setHours(short hours) {
		if (hours >= 1 && hours <= 288) {
			if(extra(hours))
			this.hours = hours;
			System.out.println("hours has been set");
		} else {
			System.out.println("invalid hours, hours must be between 1 and 288");
		}
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		if (rate >= 8 && rate <= 30) {
			this.rate = rate;
			System.out.println("rate has been set");
		} else {
			System.out.println("invalid rate, must b between 8 and 30");
		}
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hours=" + hours + ", rate=" + rate + "]";
	}

	static boolean extra(short hours) {
		if (hours > 120) {
			return true;
		} else {
			return false;
		}
	}
	
	static double pay(short h,float r){
		double salary;
		salary = r*120;
		double newh = h-120;
		if (extra(h)){
			salary += (1.5*newh);
		}
		return salary;
	}
}
