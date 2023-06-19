package src.education.mori;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main24 {
	//渡したカンマ区切りの文字列をカンマで分割して降順で返却するメソッド
    public static void main(String[] args) {

    	// Scannerクラスのインスタンスを作成
    	Scanner sc = new Scanner(System.in);
    	// 入力を促すメッセージ
    	System.out.println("カンマ区切りで入力してください ");
    	String str = sc.nextLine();
    	sc.close();
    	System.out.println(checkLength(str));
    }

    private static String checkLength(String str){
    	//入力された文字列をカンマで区切り、配列にする。
    	String[] arr = str.split(",");
    	//Stringの要素をもつlistのオブジェクトを宣言する
    	List<String> stringList = new ArrayList<String>();
    	//intの要素をもつlistのオブジェクトを宣言する
    	List<Integer> intList = new ArrayList<Integer>();
    	//文字列をintListとstringListに分類する
    	for (int i = 0; i < arr.length; i++) {
    		try {
    			intList.add(Integer.valueOf(arr[i]));
    		} catch (NumberFormatException e) {
    			stringList.add(arr[i]);
    		}
    	}
    	//intのリストを降順にソートする
    	Collections.sort(intList, Collections.reverseOrder());
    	//stringのリストを降順にソートする
    	Collections.sort(stringList, Collections.reverseOrder());
    	//最後に出力するためのlistのオブジェクトを宣言する
    	List<String> resultList = new ArrayList<String>();
    	//stringListをresultListにすべて追加する
    	resultList.addAll(stringList);
    	//その後、intListを文字列に変換して、resultListに追加する
    	for (Integer val : intList) {
    		resultList.add(val.toString());
    	}
    	//カンマ区切りで配列が連結するようにする
    	String result = String.join(",", resultList);
    	return String.format("降順で返却します%n%s",result);
    }
}