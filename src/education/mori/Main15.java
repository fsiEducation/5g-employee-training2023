package src.education.mori;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main15 {
	//渡された文字列(YYYY/MM/DD)をDate型に変換して返却するメソッド
	public static void main(String[] args) throws IllegalArgumentException, ParseException {

		System.out.println(getDate("2023/f12/13"));
		
	}
	private static Date getDate(String str) throws IllegalArgumentException, ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat();
		Date date =null;
		date = sdf.parse(str);
		if(date == null) {
			throw new IllegalArgumentException("No");
		}
		return date;
	}

}

