package telran.tests;

import java.util.function.Predicate;

import telran.people.Employee;

public class SalaryRangePredicate implements Predicate<Employee> {
	private int minSalary;
	private int maxSalary;

	@Override
	public boolean test(Employee t) {
		int salary = t.computePay();
		return salary >= minSalary && salary <= maxSalary;
	}

	public SalaryRangePredicate(int minSalary, int maxSalary) {
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	
}
