package src.education.mori;

import java.util.Scanner;

public class Main32 {
	
	//渡した文字列をチェックし、文字長が8文字以内であればtrueを返すメソッド
	public static void main(String[] args) {

		// Scannerクラスのインスタンスを作成
		Scanner sc = new Scanner(System.in);
		// 入力を促すメッセージ
		System.out.print("入力してください > ");
		String str = sc.nextLine();
		sc.close();
		System.out.println(checkLength(str));
		}

	private static boolean checkLength(String str){

		//strの文字の長さをnumに挿入
        int num = str.length() ;
        //strの文字の長さを8文字以下か判別
        if(num <= 8) {
        	return true;
        }
        else {
        	return false;
        }
    }
}
