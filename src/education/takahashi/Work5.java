package src.education.takahashi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Work5 {
	//演習2
	public static void main(String[] args) throws ParseException {
		salaryCalender();
	}
	
	public static void salaryCalender() {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat slashDateFormat = new SimpleDateFormat("yyyy/M/d");
		SimpleDateFormat japanDateFormat = new SimpleDateFormat("yyyy年M月d日");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat dayFormat = new SimpleDateFormat("E曜日");
		
		
		cl.set(2023,0,1); //2023/1/1
		cl.setLenient(false);
		
		int index=0;
		while(index<=365) {
			System.out.print(slashDateFormat.format(cl.getTime()));
			System.out.print("   "+japanDateFormat.format(cl.getTime()));
			System.out.print("   "+simpleDateFormat.format(cl.getTime()));
			System.out.print("   "+sumDate(simpleDateFormat.format(cl.getTime())));
			System.out.print("   "+dayFormat.format(cl.getTime()));
			if(cl.get(Calendar.DATE)==25) {
				int month = cl.get(Calendar.MONTH)+1;
				System.out.print("   "+month+"月"+cl.get(Calendar.DATE)+"日は給料日です");
			}
			System.out.println("");
			cl.add(Calendar.DAY_OF_MONTH, 1);
			index++;
		}
	}
	
	public static int sumDate(String str) {
		String[] strs = str.split("");
		int sum = 0;
		for(int i=0; i<strs.length;i++) {
			int x = Integer.parseInt(strs[i]);
			sum+=x;
		}
		
		return sum;
	}
	
	

}
