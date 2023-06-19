package src.education.mori;

import java.util.Random;

public class Main42 {
	/*ランダムの0～999の値を返却するメソッド*/
	public static void main(String[] args) {
		System.out.println(getRandomValue());
	}

	private static int getRandomValue(){
		//Randomクラスのインスタンスを生成
		Random rand = new Random();
		//nextIntメソッドで0～999の乱数を生成
		return rand.nextInt(1000);
	}
}