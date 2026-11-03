public class CommissionEmployee {
	private double totalSales;
	private double price;

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
