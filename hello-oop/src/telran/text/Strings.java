package telran.text;

import java.util.Arrays;

public class Strings {
	public static String[] sortStringsAsDates(String [] dates) {
		String [] res = Arrays.copyOf(dates, dates.length);
		Arrays.sort(res, new StringsDatesComparator());
		return res;
	}
}
