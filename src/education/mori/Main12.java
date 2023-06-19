package src.education.mori;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main12 {

	//現在の日付を(”YYYY/MM/DD”)フォーマットにして返却
	public static void main(String[] args) throws Exception{

		System.out.println("ただ今の日付は"+getToday() + "です。");
	}

	private static String getToday()throws Exception{
		Date day = new Date();
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy/MM/dd");
		String today = dayFormat.format(day);
		return today;
	}
}