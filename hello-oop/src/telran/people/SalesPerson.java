package telran.people;

public class SalesPerson extends Employee {
	private int sales;
	private int percentPay;

	public SalesPerson(long id, int birthYear, String email, int basicSalary,
			int sales, int percentPay) {
		super(id, birthYear, email, basicSalary);
		setSales(sales);
		setPercentPay(percentPay);
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public void setPercentPay(int percentPay) {
		this.percentPay = percentPay;
	}

	@Override
	public int computePay() {
		int bonus = sales / 100 * percentPay; //[YG] if sales less than 100 you will get 0 even if ercentPay = 100. 
		return super.computePay() + bonus;
	}
	
}
