package src.education.ikeda;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class Work3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(checkNumber("-0.2"));
		System.out.println(checkNumber("1234ngbv"));
		
		System.out.println(checkLength("qawsed"));
		System.out.println(checkLength("qawsedqawserdtfgyuhjiko"));
		
		System.out.println(checkYMD("2020", "02", "26"));
		System.out.println(checkYMD("202356", "1222", "202"));
		
		System.out.println(checkString("23-4dxfcgvhb"));
		System.out.println(checkString("234dxfcgvhb@;;"));
	}
	
	public static  boolean checkNumber(String str) throws IllegalArgumentException {
		if (str == null || str.equals("")) { 
			throw new IllegalArgumentException("引数がnullまたは空です"); 
			}
		Pattern pattern = Pattern.compile("^([0-9]\\d*|0)(\\.\\d+)?$|^(-[0-9]\\d*|0)(\\.\\d+)?$");
        return pattern.matcher(str).matches();
        }
	
	public static boolean checkLength(String str) throws IllegalArgumentException {
		if(str == null) { 
			throw new IllegalArgumentException("引数がnullです"); 
			}
		if(str.length()<=8) {
			return true;
			} else {
			return false;
			}
		}
	
	public static boolean checkYMD(String year, String month, String day) {
		String ymd = year+month+day;
		try{
		    // 日付チェック
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		    sdf.setLenient(false);
		    sdf.parse(ymd);
		 
		    return true;
		 
		  }catch(Exception ex){
		    return false;
		  }
	}
	
	public static boolean checkString(String str) throws IllegalArgumentException {
		if(str == null) { 
			throw new IllegalArgumentException("引数が null です。"); 
			}
		return str.matches("^[-?a-zA-Z0-9]*$");
	}

}
