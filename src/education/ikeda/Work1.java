package src.education.ikeda;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Work1 {
	public static void main(String[] args) throws ParseException {
		// 関数の実行
		System.out.println(getDate("2023/12/20"));

		System.out.println(getToday());

		System.out.println(getDateDiff(
				DateFormat.getDateInstance().parse("2023/12/20"),
				DateFormat.getDateInstance().parse("2023/12/21")));

		System.out.println(getCompareDate(
				DateFormat.getDateInstance().parse("2023/12/21"),
				DateFormat.getDateInstance().parse("2023/12/21")));
	}

	public static Date getDate(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			throw new ParseException("Invalid date format", e.getErrorOffset());
		}
		return date;
	}

	public static String getToday() throws ParseException {
		LocalDate date = LocalDate.now();
		String ans = date.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		return ans;
	}

	public static long getDateDiff(Date date1, Date date2) throws ParseException {
		long datetime1 = date1.getTime();
		long datetime2 = date2.getTime();

		// 日付が10年以上離れている場合、IllegalArgumentExceptionをスローする
		if (Math.abs(datetime1 - datetime2) > 315576000000L) {
			throw new IllegalArgumentException("日付の差が10年以上離れています。");
		}

		long minuts = 1000;
		long diffDays = (datetime1 - datetime2) / minuts;
		return Math.abs(diffDays);
	}

	public static String getCompareDate(Date date1, Date date2) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String ans = "";

		if (date1.after(date2)) {
			ans = sdf.format(date1);
			return ans;
		} else {
			ans = sdf.format(date2);
			return ans;
		}
	}
}
