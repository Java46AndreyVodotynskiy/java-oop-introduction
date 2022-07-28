package telran.tests;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;

import telran.text.Strings;

class sortStringsAsDatesTest {

		
	@Test
	void test() {
		String[] dates = {"10/08/2021", "30/12/2020", "04/09/2021", "05/08/2020"};
		String[] expected = {"30/12/2020", "05/08/2021", "10/08/2021", "04/09/2021"};
		assertArrayEquals(expected, Strings.sortStringsAsDates(dates));
	}
	

}
