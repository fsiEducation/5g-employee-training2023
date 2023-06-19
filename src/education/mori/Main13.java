package src.education.mori;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main13 {

	//渡された2つの日付(Date)の大きい値から小さい値を引き、秒で返却するメソッド
	public static void main(String[] args) throws Exception{
		try {
			SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println(getDateDiff(dayFormat.parse("2023/12/14") , dayFormat.parse("2023/12/15")));
		}catch (ParseException e) {
			System.out.println("不適切な文字を検出しました。");
		}
	}

	private static long getDateDiff(Date date1, Date date2)throws Exception{

		long day1 = date1.getTime();
	    long day2 = date2.getTime();
	    if(date1.after(date2)){
	    	return (day1-day2)/1000;
	    }else {
	    	return (day2-day1)/1000;
	    }
	}
}