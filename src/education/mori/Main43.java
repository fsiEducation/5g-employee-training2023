package src.education.mori;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main43 {
	/*渡した2つの数字で割り算を行い、端数は四捨五入して値を返すメソッド*/
	public static void main(String[] args) {
		//数値以外が入力されたらはじく処理
		while(true) {
			//整数が入力されたら正常に動作する
			try {
				// Scannerクラスのインスタンスを作成
				Scanner sc = new Scanner(System.in);
				System.out.print("数値1 > ");
				long data1 = sc.nextLong();
				System.out.print("数値2 > ");
				long data2 = sc.nextLong();
				System.out.println(getDividedValue(data1,data2));
				sc.close();
				break ;
			}//整数以外が入力されたら数値1の入力に戻る
			catch(InputMismatchException e) {
				System.out.println("不適切な文字が入力されました");
				//break;
			}
		}
	}

	private static int getDividedValue(long data1, long data2){
		//long型で渡された数値をdouble型に変換
        double d1 = data1;
        double d2 = data2;
        double d3 = 0;
        d3 = d1/d2;
        //求まった答えを四捨五入する。
        long Ans = Math.round(d3);
        //long型の答えをint型に変更する。
        int ans = (int) Ans;
        return ans;
	}
}
