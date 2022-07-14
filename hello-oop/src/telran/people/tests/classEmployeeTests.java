package telran.people.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.people.*;

class classEmployeeTests {

	@Test
	void computePayTest() {
		Employee employee = new Employee(0, 0, null, 10000);
		assertEquals(10000, employee.computePay());
		WageEmployee wageEmployee = new WageEmployee(0, 0, null, 0, 50, 182);
		assertEquals(9100, wageEmployee.computePay());
		SalesPerson salesPerson = new SalesPerson(0, 0, null, 11000, 150000, 2);
		assertEquals(14000, salesPerson.computePay());
	}

}
