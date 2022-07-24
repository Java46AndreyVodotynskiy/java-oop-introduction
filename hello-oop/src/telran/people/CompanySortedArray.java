package telran.people;

import java.util.Arrays;

public class CompanySortedArray extends CompanyArray {
	

	@Override
	public boolean addEmployee(Employee empl) {
		int index = getEmployeeIndex(empl.getId());
		if(index >= 0) {
			return false;
		}
		index = -(index+1);
		employees = Arrays.copyOf(employees, employees.length + 1);
		System.arraycopy(employees, index, employees, index +1, employees.length - 1 - index);
		employees[index] = empl;
	
		//finds index for adding with keeping array sorted
		//calls getEmployeeIndex

	return true;
	}
	
//	@Override
//	public Employee removeEmployee(long id) {
//		//TODO
//		return null;
//	}

	@Override 
	protected int getEmployeeIndex(long id) {
		Person pattern = new Person(id, 0, "empl3e@gmail.com");
		return Arrays.binarySearch(employees, pattern);
	}
	
	@Override
	public Employee[] getAllEmployees() {
		return Arrays.copyOf(employees, employees.length);
	}
}

