package src.education.ikeda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTable {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);


        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter formatterWeek = DateTimeFormatter.ofPattern("E曜日", Locale.JAPANESE);
        DateTimeFormatter formatterSalary = DateTimeFormatter.ofPattern("MM月dd日");

        for (LocalDate date = startDate; date.isBefore(endDate.plusDays(1)); date = date.plusDays(1)) {
            String formattedDate1 = date.format(formatter1);
            String formattedDate2 = date.format(formatter2);
            String formattedDate3 = date.format(formatter3);
            String formattedWeek = date.format(formatterWeek);
            int salary = date.getDayOfMonth();
            int sum = 0;
            for(int i=0; i<formattedDate3.length(); i++){
                char c = formattedDate3.charAt(i);
                int digit = Character.getNumericValue(c);
                sum += digit;
                
            }
            if(salary==25) {
            	String formattedSalary = date.format(formatterSalary);
            	System.out.printf("%s　　%s　　%s　　%d　　%s　　%sは給料日です。",
                		formattedDate1, formattedDate2, formattedDate3, sum, formattedWeek, formattedSalary);
                System.out.println();
            } else {
            	System.out.printf("%s　　%s　　%s　　%d　　%s",
                		formattedDate1, formattedDate2, formattedDate3, sum, formattedWeek);
                System.out.println();
            }
        }
    }
}
