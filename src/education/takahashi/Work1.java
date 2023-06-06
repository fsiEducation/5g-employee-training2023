package src.education.takahashi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 

public class Work1 {
	public static void main(String[] args) throws ParseException  {
		
		//1-1
		//System.out.println(getDate("2000/02/04"));
		
		//1-2
		//System.out.println(getToday());
		
		//1-3
		/*
		Date date1 = getDate("2023/06/06");
		Date date2 = getDate("2023/06/05");
		System.out.println(getDateDiff(date1,date2));
		*/
		
		//1-4
		//System.out.println(getCompareDate(date1,date2));
		
		
	}
	
	//1-1
	public static Date getDate(String str) throws ParseException  {
		Date date = new SimpleDateFormat("yyyy/MM/dd").parse(str);
		return date;
	}
	
	//1-2
	public static String getToday() {
		Date date = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        String str1 = sdf1.format(date);
		return str1;
	}
	
	//1-3
	public static long getDateDiff(Date date1, Date date2) {
		if(date1.compareTo(date2)>=0) {
			long diff = date1.getTime()-date2.getTime();
			return diff/1000;
		}
		else {
			long diff = date2.getTime()-date1.getTime();
			
			return diff/1000;
		}
	}
	
	//1-4
	public static String getCompareDate(Date date1, Date date2) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		if(date1.compareTo(date2)>=0) {
			return sdf1.format(date1);
		}
		else {
			return sdf1.format(date2);
		}
	}
	
}
