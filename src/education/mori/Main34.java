package src.education.mori;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main34 {
	
	//渡した文字列をチェックし、英数字のみであればtrueを返すメソッド
	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成
		Scanner sc = new Scanner(System.in);
		// 入力を促すメッセージ
		System.out.print("入力してください > ");
		String str = sc.nextLine();
		sc.close();
		System.out.println(checkString(str));
	}

	private static boolean checkString(String str) {
		//if文を用いて、正規表現で英数字かどうかをチェックする。
		if(Pattern.matches("^[0-9a-zA-Z]+$", str)) {
        	return true;
        }
        else {
        	return false;
        }
    }
}