package src.education.mori;

public class Main21 {

	//渡した文字列の配列をカンマ区切りの文字として返却するメソッド
	public static void main(String[] args) {
		//配列の変数listに挿入
		String[] list = {"AAA", "BBB", "CCC"};
		System.out.println(getCsvString(list));	
	}

	private static String getCsvString(String[] strs) {
		//joinメソッドで結合処理
		String result = String.join(",", strs);
		return result;
	}
}