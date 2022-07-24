package telran.comparators;

import java.util.Comparator;

import telran.people.Employee;

public class PersonAgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee p1, Employee p2) {

		return Integer.compare(p2.getBirthYear(), p1.getBirthYear());
	}


}
