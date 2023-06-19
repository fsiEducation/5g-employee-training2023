package src.education.mori;

import java.util.Arrays;

public class Main22 {
	//渡したカンマ区切りの文字列をカンマで分割して文字列の配列として返却するメソッド
	public static void main(String[] args) {
		//Arrays.toStringを用いて、配列を出力するようにする。
		System.out.println(Arrays.toString(getValues("A,B,C")));
    }

	private static String[] getValues(String csv) {
		//splitを用いて、","区切りで文字列を分割して配列にする
		String[] Alp = csv.split(",");
		return Alp;
	}
}