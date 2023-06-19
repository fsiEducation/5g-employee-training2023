package src.education.mori;

import java.text.DateFormat;
import java.util.Scanner;

public class Main33 {
	
	/*渡した年月日の文字列(年、月、日は別の引数)が年月日として正しいかをチェックし、
	正しい場合はtrueを返すメソッド*/
	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成
		Scanner sc = new Scanner(System.in);
		// 入力を促すメッセージ
		System.out.print("年 > ");
		String year = sc.nextLine();
		System.out.print("月 > ");
		String mon = sc.nextLine();
		System.out.print("日 > ");
		String day = sc.nextLine();
		//Scannerクラスのインスタンスを終了
		sc.close();
		System.out.println(checkYMD(year,mon,day));
	}

	private static boolean checkYMD(String year, String month, String day){
		//入力されたデータをyyyy/MM/ddの形にする
		String strDate = year + "/" + month + "/" + day;
		//フォーマットの定義
	    DateFormat format = DateFormat.getDateInstance();
	    // 日付を厳密に解析をする。
	    format.setLenient(false);
	    try {
	    	//strDateを用いて日付の文字列をDate型へ変換
	        format.parse(strDate);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
}