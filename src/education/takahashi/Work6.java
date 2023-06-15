package src.education.takahashi;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Work6 {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat japan = new SimpleDateFormat("yyyy年M月d日(E)");
		int index=1;
		while(index<=360){
			if(cl.get(Calendar.DATE)==25) {
				if((cl.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY)) {
					cl.add(Calendar.DAY_OF_MONTH, -1);
					System.out.println(index+"回目の給料日は"+japan.format(cl.getTime())+"です。");
					index++;
				}
				else if(cl.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
					cl.add(Calendar.DAY_OF_MONTH, -2);
					System.out.println(index+"回目の給料日は"+japan.format(cl.getTime())+"です。");
					index++;
				}
				else {
					System.out.println(index+"回目の給料日は"+japan.format(cl.getTime())+"です。");
					index++;
				}
				cl.add(Calendar.MONTH, 1);
			}
			else {
				cl.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
	}

}
