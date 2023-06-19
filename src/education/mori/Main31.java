package src.education.mori;

import java.util.Scanner;

public class Main31 {
	//文字列が数字(マイナス含む)だった場合、trueを返却するメソッド
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner sc = new Scanner(System.in);
		// 入力を促すメッセージ
		System.out.print("入力してください > ");
		String str = sc.nextLine();
		sc.close();
		System.out.println(checkNumber(str));
	}

	private static boolean checkNumber(String str) {
        try {
        	//数値であったらtrueを呼び出す。
            Double.parseDouble(str);
            return true;
        } 
        //数値以外のものが入力されていた場合falseを返却
        catch (NumberFormatException e) {
            return false;
        }
    }
}