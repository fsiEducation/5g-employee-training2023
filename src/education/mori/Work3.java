package src.education.mori;

import java.util.Calendar;

public class Work3 {

	//実行日以降の給料日360回の日付を求める
	public static void main(String[] args) {
		//for分を用いてひと月ずつ360回出力させる
		for(int i = 1 ; i <= 360 ; i++) {
			//カレンダーのオブジェクトを作成する
			Calendar calendar = Calendar.getInstance();

			// 日付を指定する(2023/6/25)
			calendar.set(2023, 4+i, 25);

			// 1日後を取得
			System.out.println(carenderFormat(i,calendar.get(Calendar.YEAR),
					calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.DAY_OF_MONTH)));
		}
	}

	private static String carenderFormat(int i, int year, int month , int date) {
		// 入力された年月日をyyyy/MM/ddのフォーマットにして文字列を返す
		//カレンダーのオブジェクトを作成する
		Calendar calendar = Calendar.getInstance();

		calendar.set(year, month-1, date);
		//switch分を利用して曜日を出力する
		switch (calendar.get(Calendar.DAY_OF_WEEK)) { 
			//カレンダー上で日曜日であるならば、dateから2引いて"金"として出力する
	    	case Calendar.SUNDAY:
	    		return String.format("%d回目の給料日は%d年%d月%d日(金)です。",i,year,month,date-2);
			//カレンダー上で月曜日であるならば、"月"として出力する
	    	case Calendar.MONDAY:
	    		return String.format("%d回目の給料日は%d年%d月%d日(月)です。",i,year,month,date);
			//カレンダー上で火曜日であるならば、"火"として出力する
			case Calendar.TUESDAY:
	    		return String.format("%d回目の給料日は%d年%d月%d日(火)です。",i,year,month,date);
	    	//カレンダー上で水曜日であるならば、"水"として出力する
			case Calendar.WEDNESDAY:
				return String.format("%d回目の給料日は%d年%d月%d日(水)です。",i,year,month,date);
			//カレンダー上で木曜日であるならば、"木"として出力する
			case Calendar.THURSDAY:
				return String.format("%d回目の給料日は%d年%d月%d日(木)です。",i,year,month,date);
			//カレンダー上で金曜日であるならば、"金"として出力する
			case Calendar.FRIDAY:
				return String.format("%d回目の給料日は%d年%d月%d日(金)です。",i,year,month,date);
			//カレンダー上で日曜日であるならば、dateから1引いて"金"として出力する
			case Calendar.SATURDAY:
				return String.format("%d回目の給料日は%d年%d月%d日(金)です。",i,year,month,date-1);
		}
		//それ以外であったら"null"を出力する
		return null;
	}
}