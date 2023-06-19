package src.education.mori;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main11 {
	//渡された文字列(YYYY/MM/DD)をDate型に変換して返却するメソッド
	public static void main(String[] args)throws Exception{

		System.out.println(getDate("2023/12/11"));

	}

	private static Date getDate(String str) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			 Date date = sdf.parse(str);
			return date;
		}catch (ParseException e) {
			System.out.println("不適切な文字を検出しました。");
            return null ; 
		}
	}
}