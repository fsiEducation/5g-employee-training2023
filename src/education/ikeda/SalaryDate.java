package src.education.ikeda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class SalaryDate {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate date = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		DateTimeFormatter formatterWeek = DateTimeFormatter.ofPattern("E", Locale.JAPANESE);
		int count = 0;
		for (;;) {
			int salary = date.getDayOfMonth();
			String formattedDate = date.format(formatter);
			String formattedWeek = date.format(formatterWeek);
			if(salary == 25) {
				count++;
				if(formattedWeek.equals("土")) {
					LocalDate date1 = date.minusDays(1);
					String formattedDate1 = date1.format(formatter);
					String formattedWeek1 = date1.format(formatterWeek);
					System.out.printf("%d回目の給料日は%s(%s)です。", count, formattedDate1, formattedWeek1);
					System.out.println();
				} else if(formattedWeek.equals("日")) {
					LocalDate date1 = date.minusDays(2);
					String formattedDate1 = date1.format(formatter);
					String formattedWeek1 = date1.format(formatterWeek);
					System.out.printf("%d回目の給料日は%s(%s)です。", count, formattedDate1, formattedWeek1);
					System.out.println();
				} else {
					System.out.printf("%d回目の給料日は%s(%s)です。", count, formattedDate, formattedWeek);
					System.out.println();
				}
			}
			date = date.plusDays(1);
			if(count==360)break;
			
		}
	}

}
