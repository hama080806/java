import java.time.LocalDate;

public class CommissionEmployee extends Employee {
	private double totalSales;
	private double price;

	public CommissionEmployee(String first_Name, String last_Name, LocalDate date_of_Birth, Address address,
			String mobile_Number, String personal_Email, String work_Email) {
		super(first_Name, last_Name, date_of_Birth, address, mobile_Number, personal_Email, work_Email);
		setTotalSales(totalSales);
		setPrice(price);
		
	}
	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		if (totalSales < 0){
			System.out.println("invalid, must be positive");
		}
		else{
		this.totalSales = totalSales;
		System.out.println("total sales has been set");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0){
			System.out.println("invalid, must be positive");
		}
		else{
			this.price = price;
		System.out.println("price has been set");
		}
		
	}

	@Override
	public String toString() {
		return "CommissionEmployee [totalSales=" + totalSales + ", price=" + price + "]";
	}
static double pay(double total, double price){
	double all=0;
	if (total < 15000){
		all= total*0.015;
	}
	 if (total <= 15000 && total >=20000){
		 all=total*0.003;
	}
	if(total > 20000){
		 all=total*0.005;
	}
	return all;
}
}
