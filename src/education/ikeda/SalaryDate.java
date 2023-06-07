package src.education.ikeda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SalaryDate {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate date = LocalDate.now();
		LocalDate date1;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		DateTimeFormatter formatterWeek = DateTimeFormatter.ofPattern("E", Locale.JAPANESE);
		String formattedDate;
		String formattedWeek;
		String formattedDate1;
		String formattedWeek1;

		int count = 0;
		for (;;) {
			int salary = date.getDayOfMonth();
			formattedDate = date.format(formatter);
			formattedWeek = date.format(formatterWeek);
			if (salary == 25) {
				count++;
				if (formattedWeek.equals("土")) {
					date1 = date.minusDays(1);
					formattedDate1 = date1.format(formatter);
					formattedWeek1 = date1.format(formatterWeek);
					System.out.printf("%d回目の給料日は%s(%s)です。", count, formattedDate1, formattedWeek1);
					System.out.println();
				} else if (formattedWeek.equals("日")) {
					date1 = date.minusDays(2);
					formattedDate1 = date1.format(formatter);
					formattedWeek1 = date1.format(formatterWeek);
					System.out.printf("%d回目の給料日は%s(%s)です。", count, formattedDate1, formattedWeek1);
					System.out.println();
				} else {
					System.out.printf("%d回目の給料日は%s(%s)です。", count, formattedDate, formattedWeek);
					System.out.println();
				}
			}
			date = date.plusDays(1);
			if (count == 360)
				break;

		}
	}

}
