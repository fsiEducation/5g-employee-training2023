package src.education.mori;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main14 {

	//渡された2つの日付(Date)の大きい値を、(”YYYY/MM/DD”)フォーマットの文字列で返却するメソッド
	public static void main(String[] args) throws Exception{
		try {
			SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println(getCompareDate(dayFormat.parse("2023/12/24") , dayFormat.parse("2023/12/9")));
		}catch (ParseException e) {
			System.out.println("不適切な文字を検出しました。");
		}
	}

	private static String getCompareDate(Date date1, Date date2) {

		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy/MM/dd");
		if(date1.after(date2)){
			String day1 = dayFormat.format(date1);
			return day1;
        }
        else {
        	String day2 = dayFormat.format(date2);
			return day2;
        }
	}
}