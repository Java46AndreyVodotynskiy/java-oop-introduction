package telran.people;

public class SalesPerson extends Employee {
	private int sales;
	private int percentPay;
	private static int minPercent = 0;
	private static int maxPercent = 100;

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
		if(percentPay > maxPercent || percentPay < minPercent) {
			throw new IllegalArgumentException(String.format("%d - wrong percent pay, " + "should be in range [%d - %d}", percentPay,
					minPercent, maxPercent));
		}
		this.percentPay = percentPay;
	}

	@Override
	public int computePay() {
		
		return super.computePay() + sales * percentPay / 100;
	}
}

