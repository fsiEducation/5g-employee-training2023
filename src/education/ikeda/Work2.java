package src.education.ikeda;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Work2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] animals = { "dog", "cat" };
		System.out.println(getCsvString(animals));
		System.out.println(Arrays.toString(getValues("a,b,c,d,e,f,g")));
		System.out.println(format("100000"));
		System.out.println(getSortValues("10,9,4,1,2,567"));

	}

	public static String getCsvString(String[] strs) throws IllegalArgumentException {
		if (strs == null || strs.length == 0) {
			throw new IllegalArgumentException("配列がnullまたは空です");
		}
		return String.join(",", strs);
	}

	public static String[] getValues(String csv) {
		if (csv == null || csv.isEmpty()) {
			throw new IllegalArgumentException("CSV文字列がnullまたは空です");
		}
		String[] ans = csv.split(",");
		return ans;
	}

	public static String format(String str) throws IllegalArgumentException {
		if (str == null) {
			throw new IllegalArgumentException("引数がnullです");
		}
		if (!str.matches("^-?\\d+$")) {
			throw new IllegalArgumentException("数字でない文字列が渡されました");
		}
		try {
			int ans = Integer.parseInt(str);
			if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) {
				throw new IllegalArgumentException("int型で収まらない数値が渡されました");
			}
			return String.format("%,d", ans);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("int型としてパースできない数値が渡されました");
		}

	}

	public static String getSortValues(String str) throws IllegalArgumentException {
		if (str == null || str.equals("")) {
			throw new IllegalArgumentException("引数がnullまたは空です");
		}

		String[] numStrs = str.split(",");

		int[] nums = new int[numStrs.length];
		int[] ans = new int[numStrs.length];
		for (int i = 0; i < numStrs.length; i++) {
			try {
				nums[i] = Integer.parseInt(numStrs[i]);
			} catch (NumberFormatException e) {
				throw new NumberFormatException("数字以外の文字列が含まれています");
			}
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			ans[numStrs.length - i - 1] = nums[i];
		}
		String s = Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining(","));
		return s;
	}

}
