package telran.people;

public interface ICompany {
	boolean addEmployee(Employee empl);
	Employee removeEmployee(long id);
	Employee getEmployee(long id);
	long computeSalaryBuget();
	Employee[] getAllEmployees();
	Employee[] sortEmployeesByAge();
	Employee[] sortEmployeesBySalary();
}

