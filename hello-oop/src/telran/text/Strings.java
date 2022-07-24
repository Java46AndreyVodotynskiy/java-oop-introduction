package telran.text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Strings {
	public static String[] sortStringsAsDates(String[] dates) {
		Date[] datesFormatDate = getDatesFormatDate(dates);
		for(int i = 1; i < datesFormatDate.length; i++) {
			swap(datesFormatDate);
		}
		return dates = formatDateToString(datesFormatDate);
	}

	private static String[] formatDateToString(Date[] datesFormatDate) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String[] res = new String[datesFormatDate.length];
		for(int i = 0; i < datesFormatDate.length; i++) {
			res[i] = df.format(datesFormatDate[i]);
		}
		return res;
	}

	private static void swap(Date[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i - 1].compareTo(arr[i]) > 0) {
				Date tmp = arr[i - 1];
				arr[i - 1] = arr[i];
				arr[i] = tmp;
			}
		}
	}

	private static Date[] getDatesFormatDate(String[] dates) {
		Date[] res = new Date[dates.length];
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		for(int i = 0; i < dates.length; i++) {
			try {
				Date tmp = df.parse(dates[i]);
				res[i] = tmp;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return res;
	}
}
