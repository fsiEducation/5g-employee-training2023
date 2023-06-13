package src.education.takahashi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Work3 {

	public static void main(String[] args) {
		//3-1
		System.out.println(checkNumber(""));

		//3-2
		//System.out.println(checkLength(""));

		//3-3
		/*
		String year = "2020";
		String month = "12";
		String day = "29";
		System.out.println(checkYMD(year, month, day));
		*/
		//3-4
		//System.out.println(checkString(""));
	}

	//3-1 //修正
	public static boolean checkNumber(String str) {
		return str.matches("^-?[0-9]+$");
	}


	//3-2
	public static boolean checkLength(String str) {
		return str.length() <= 8;
	}

	//3-3
	public static boolean checkYMD(String year, String month, String day) {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat slash = new SimpleDateFormat("yyyy/MM/dd");

		int yearNum = Integer.parseInt(year);
		int monthNum = Integer.parseInt(month) - 1;
		int dayNum = Integer.parseInt(day);

		try {
			cl.set(yearNum, monthNum, dayNum);
			cl.setLenient(false);
			slash.format(cl.getTime());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	//3-4
	public static boolean checkString(String str) {
		return str.matches("^[\\w\\-]+$");
	}

}
