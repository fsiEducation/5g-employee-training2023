package src.education.takahashi;

import java.util.Random;

public class Work4 {

	public static void main(String[] args) {
		
		//4-1
		//System.out.println(getTimesValue(2.5,2.5));
			
		//4-2
		//System.out.println(getRandomValue());
			
		//4-3
		//System.out.println(getDividedValue(952,1));
	
		//4-4
		System.out.println(getTimesValue2(5.3,6.45));
	}
	
	//4-1
	public static long getTimesValue(double data1, double data2) {
		return (long) (Math.ceil(data1)*Math.ceil(data2));
	}
	
	//4-2
	public static int getRandomValue() {
		Random rnd = new Random();
		return rnd.nextInt(1000);
	}
	
	//4-3
	public static int getDividedValue (long data1, long data2) {
		if(data2==0) {
			throw new IllegalArgumentException("0で割ることはできません");
		}
		return Math.round(data1/data2);
	}
	
	//4-4
	public static String getTimesValue2(double data1, double data2) {
		int ans = (int)(Math.ceil(data1)*Math.ceil(data2));
		
		return Integer.toHexString(ans);
		
	}

}
