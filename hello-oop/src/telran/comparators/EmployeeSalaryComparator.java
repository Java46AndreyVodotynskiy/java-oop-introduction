package telran.comparators;

import java.util.Comparator;

import telran.people.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return Integer.compare(e1.computePay(), e2.computePay());
	}

}
