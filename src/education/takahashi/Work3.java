package src.education.takahashi;

import java.text.DateFormat;

public class Work3 {

	public static void main(String[] args) {
		//3-1
		//System.out.println(checkNumber("112a5"));
		
		//3-2
		//System.out.println(checkLength("12345678"));
		
		//3-3
		//System.out.println(checkYMD("2020","2","30"));
		
		//3-4
		System.out.println(checkString("12asdf"));
	}
	
	//3-1
	public static boolean checkNumber(String str) {
	     boolean isNum= true;
	     if((str.charAt(0))== '-') {
	    	 for (int i = 1; i < str.length(); i++) {
			     if (!Character.isDigit(str.charAt(i))) {
			         isNum = false;
			      }
			 }
	     }
	     else {
	    	for (int i = 0; i < str.length(); i++) {
		       if (!Character.isDigit(str.charAt(i))) {
		           isNum = false;
		       }
		     }
	     }
	     
	     return isNum;
	}
	
	//3-2
	public static boolean checkLength(String str) {
		String[] strs = str.split("");
		return strs.length<=8;
	}
	
	//3-3
	public static boolean checkYMD(String year, String month, String day) {
		if(month.length()==1) {
			month="0"+month;
		}
		if(day.length()==1) {
			day="0"+day;
		}
		
		String strDate = year+"/"+month+"/"+day;
		if (strDate == null || strDate.length() != 10) {
	        System.out.println(strDate+"は不正な文字列です");
	        return false;
	    }
	    DateFormat format = DateFormat.getDateInstance();
	    format.setLenient(false);
	    try {
	        format.parse(strDate);
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	//3-4
	public static boolean checkString(String str) {
		return str.matches("^[-?a-zA-Z0-9]*$");
	}

}
