package src.education.takahashi;

import java.util.Arrays;

public class Work2 {

	public static void main(String[] args) {
		//2-1
		/*
		String[] strs = {"a","b","d","g","h","i"};
		System.out.println(getCsvString(strs));
		*/
				
		//2-2
		/*
		String str = "a,b,c,d,e,f,g";
		String[] strs = getValues(str);
		String tmp = "";
		for(int i=0; i<strs.length;i++) {
			tmp= tmp + strs[i];
		}
		System.out.println(tmp);
		*/
		
		//2-3
		String number = "123456";
		System.out.println(format(number));
		
		//2-4
		/*
		String n = "";
		System.out.println(getSortValues(n));
		*/
		
	}
	
	//2-1
	public static String getCsvString(String[] strs) {
		String str="";
		for(int i=0; i<strs.length-1; i++) {
			str=str+strs[i]+",";
		}
		return str+strs[strs.length-1];
	}
	
	//2-2
	public static String[] getValues(String csv) {
		return csv.split(","); 
	}
	
	//2-3
	public static String format(String str) {
		String[] strs = str.split("");
		String tmp="";
		int len = strs.length;
		if(len<3) {
			for(int i=0; i<len; i++) {
				tmp+=strs[i];
			}
			return tmp;
		}
		else {
			if(len%3==0) {
				for(int i=0; i<len-1; i++) {
					if((i+1)%3==0) {
						tmp= tmp + strs[i]+",";
					}
					else {
						tmp= tmp + strs[i];
					}
				}
				tmp= tmp + strs[len-1];
			}
			else if(len%3==1) {
				tmp = strs[0]+"," ;
				for(int i=1; i<len-1; i++) {
					if(i%3==0) {
						tmp= tmp + strs[i]+",";
					}
					else {
						tmp= tmp + strs[i];
					}
				}
				tmp= tmp + strs[len-1];
			}
			else {
				tmp = strs[0]+strs[1]+"," ;
				for(int i=2; i<len-1; i++) {
					if((i-1)%3==0) {
						tmp= tmp + strs[i]+",";
					}
					else {
						tmp= tmp + strs[i];
					}
				}
				tmp= tmp + strs[len-1];
			}
			return tmp;
		}
	}
	
	//2-4
	public static String getSortValues(String str) {
		String[] numbers = str.split(",");
		int[] nums = new int[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			nums[i]= Integer.parseInt(numbers[i]);
		}
		
		Arrays.sort(nums);

		for (int f = 0, l = nums.length - 1; f < l; f++, l--){
		  int temp = nums[f];
		  nums[f]  = nums[l];
		  nums[l] = temp;
		}
		
        String ans = "";
		for(int i=0; i<nums.length; i++) {
			ans = ans + String.valueOf(nums[i]);
		}
		return ans;
	}

}
