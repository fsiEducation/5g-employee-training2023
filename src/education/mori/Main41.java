package src.education.mori;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main41 {
	/*小数点の値2つを引数とし、その小数部分を切り上げた
	整数値を掛けあわせた値を返却するメソッド*/
	public static void main(String[] args) {
		//数値以外が入力されたらはじく処理
		while(true) {
			//数値が入力されたら正常に動作する
			try {
				// Scannerクラスのインスタンスを作成
				Scanner sc = new Scanner(System.in);
				System.out.print("数値1 > ");
				double data1 = sc.nextDouble();
				System.out.print("数値2 > ");
				double data2 = sc.nextDouble();
				//小数点の値かどうかを判別する
				if (data1 != (int)data1 && data2 != (int)data2) {
					//小数点の値であれば、入力が完了する
					System.out.println(getTimesValue(data1,data2));
					sc.close();
					break ;
			    }
				else {
					//整数であれば、数値1の入力に戻る。
					System.out.println("整数は入力不可です");
				}
			}//数値以外が入力されたら数値1の入力に戻る
			catch(InputMismatchException e) {
				System.out.println("不適切な文字が入力されました");
			}
		}
	}

	private static long getTimesValue(double data1, double data2){
		//double型で渡された数値を切り上げてint型に変換
        int d1 = (int)Math.ceil(data1);
        int d2 = (int)Math.ceil(data2);
        //整数値を掛け合わせて値を返却
        return d1*d2;
	}
}
