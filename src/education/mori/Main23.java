package src.education.mori;

public class Main23 {
	//渡した数値を3桁毎のカンマ区切りの文字列に変換して返すメソッド
	public static void main(String[] args) {

		System.out.println(format("1000000000"));
	}

	private static String format(String str) {
		try {
			//入力された文字列をint型に変換
			int num = Integer.parseInt(str);
			//String.format("%,d",変数）を使って3桁毎のカンマ区切りの文字列に変換
			return String.format("%,d", num);
		}catch (NumberFormatException e) {
			return "不適切な文字を検出しました。";
		}
	}
}