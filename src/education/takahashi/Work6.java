package src.education.takahashi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Work6 {

	public static void main(String[] args) {
		salaryDay();
	}
	
	public static void salaryDay() {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat japanDateFormat = new SimpleDateFormat("yyyy年M月d日(E)");
		
		if(cl.get(Calendar.DATE)<=25) {
			cl.set(Calendar.DATE,25);
		}
		else {
			cl.add(Calendar.MONTH, 1);
			cl.set(Calendar.DATE,25);
		}
		
		int index=1;
		while(index<=360){
			if(cl.get(Calendar.DATE)==25) {
				if((cl.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)) {
					cl.add(Calendar.DAY_OF_MONTH, -1);
					System.out.println(index+"回目の給料日は"+japanDateFormat.format(cl.getTime())+"です。");
					cl.add(Calendar.DAY_OF_MONTH, 1);
					index++;
				}
				else if(cl.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
					cl.add(Calendar.DAY_OF_MONTH, -2);
					System.out.println(index+"回目の給料日は"+japanDateFormat.format(cl.getTime())+"です。");
					cl.add(Calendar.DAY_OF_MONTH, 2);
					index++;
				}
				else {
					System.out.println(index+"回目の給料日は"+japanDateFormat.format(cl.getTime())+"です。");
					index++;
				}
				cl.add(Calendar.MONTH, 1);
			}
		}
	}

}
