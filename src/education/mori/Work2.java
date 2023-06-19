package src.education.mori;

import java.util.Calendar;

public class Work2 {

	//2023年の日付をすべて出力するメソッド
	public static void main(String[] args) {

		//日付を365日分出力させる
		for(int i = 0 ; i < 365 ; i++) {
			//カレンダーのオブジェクトを作成する
			Calendar calendar = Calendar.getInstance();

			// 日付を指定する(2023/1/1)
			calendar.set(2023, 0, 1+i);

			System.out.print(carenderFormat(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH))+ "\t" );
			System.out.print(carenderFormat2(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH))+ "\t" );
			System.out.print(carenderFormat3(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH))+ "\t" );
			System.out.print(carenderAdd(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH))+ "\t" );
			System.out.print(DayOfWeek(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH))+ "\t" );
			System.out.println(Salary(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH)));
		}
	}

	private static String carenderFormat(int year, int month , int date) {
		// 入力された年月日をyyyy/MM/ddのフォーマットにして文字列を返す
		return String.format("%d/%d/%d",year,month,date);
	}

	private static String carenderFormat2(int year, int month , int date) {
		// 入力された年月日をyyyy年MM月dd日のフォーマットにして文字列を返す
		return String.format("%d年%d月%d日",year,month,date);
	}

	private static String carenderFormat3(int year, int month , int date) {
		// 入力された年月日をyyyyMMddのフォーマットにして文字列を返す
		return String.format("%d%02d%02d",year,month,date);
	}

	private static int carenderAdd(int year, int month , int date) {

		int sum = 0;
		while (year != 0 ) {
			//yearを10で割った時の余りをsumに加算する
			sum += year % 10;
			//yearを10で割って桁をずらす
			year /= 10;
			//monthを10で割った時の余りをsumに加算する
			sum += month % 10;
			//monthを10で割って桁をずらす
			month /= 10;
			//dataを10で割った時の余りをsumに加算する
			sum += date % 10;
			//dataを10で割って桁をずらす
			date /= 10;
		}
		return sum;
	}

	private static String DayOfWeek(int year, int month , int date) {
		//カレンダーのオブジェクトを作成する
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(year, month-1, date);
		//switch分を利用して曜日を出力する
		switch (calendar.get(Calendar.DAY_OF_WEEK)) { 
			//カレンダー上で日曜日であるならば、"日曜日"と出力する
	    	case Calendar.SUNDAY:
	    		return "日曜日";
	    	//カレンダー上で月曜日であるならば、"月曜日"と出力する
	    	case Calendar.MONDAY:
	    		return "月曜日";
	    	//カレンダー上で火曜日であるならば、"火曜日"と出力する
	    	case Calendar.TUESDAY:
	    		return "火曜日";
	    	//カレンダー上で水曜日であるならば、"水曜日"と出力する
	    	case Calendar.WEDNESDAY:
	    		return "水曜日";
	    	//カレンダー上で木曜日であるならば、"木曜日"と出力する
	    	case Calendar.THURSDAY:
	    		return "木曜日";
	    	//カレンダー上で金曜日であるならば、"金曜日"と出力する
	    	case Calendar.FRIDAY:
	    		return "金曜日";
	    	//カレンダー上で日曜日であるならば、"土曜日"と出力する
	    	case Calendar.SATURDAY:
	    		return "土曜日";
		}
		//それ以外であったら"null"を出力する
		return "曜日に誤りがあります";
	}

	private static String Salary(int year, int month , int date) {

		//日付が25日であったら給料日であることを出力する
		if(date == 25) {
			return String.format("%d月%d日は給料日です。",month,date);
		}
		//それ以外であったら空白を出力する
		else {
			return "";
		}
	}
}