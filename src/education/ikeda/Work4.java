package src.education.ikeda;

import java.util.Random;

public class Work4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(getTimesValue(9.8, 4.8));
		System.out.println(getRandomValue());
		System.out.println(getDividedValue(10, 3));
		System.out.println(getTimesValues(2.5, 3.2));
	}
	
	public static long getTimesValue(double data1, double data2) throws IllegalArgumentException, ArithmeticException {
//		double型を引数にとるためNanを考慮する
		if(Double.isNaN(data1) || Double.isNaN(data2)){ 
			throw new IllegalArgumentException("引数にNaNが含まれています。"); 
			}
//		オーバーフローを考慮
		if (data1 * data2 > Integer.MAX_VALUE) { 
			throw new ArithmeticException("オーバーフローしました。"); 
			}
		long ans = (int) ((int)Math.ceil(data1)*(int)Math.ceil(data2));
		return ans;
	}
	
	public static int getRandomValue() {
		Random rand = new Random();
	    int num = rand.nextInt(1000);
	    return num;
	}
	
	public static int getDividedValue (long data1, long data2 ) throws IllegalArgumentException, ArithmeticException{
		if (data2 == 0) { 
			throw new IllegalArgumentException("除数に0が指定されました。"); 
			} 
		int result; 
		try { 
			result = Math.toIntExact(Math.round((double) data1 / data2)); 
			} catch (ArithmeticException e) { 
				throw new ArithmeticException("割り算でエラーが発生しました。"); 
				} 
		return result; 
		}

	
	public static String getTimesValues(double data1, double data2) throws ArithmeticException {
//		double型を引数にとるためNanを考慮する
		if(Double.isNaN(data1) || Double.isNaN(data2)){ 
			throw new IllegalArgumentException("引数にNaNが含まれています。"); 
			}
		
		double ceilData1 = Math.ceil(data1); 
		double ceilData2 = Math.ceil(data2); 
		
		if (ceilData1 * ceilData2 > Integer.MAX_VALUE) { 
			throw new ArithmeticException("オーバーフローしました。"); 
			} 
		int ans = (int)ceilData1 * (int)ceilData2; 
		return Integer.toHexString(ans);
	}

}
