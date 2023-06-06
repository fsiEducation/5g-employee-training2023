package src.education.ikeda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Work2Test {

	 @Test
	    void testGetCsvString() {
	        // 正常系テスト
	        String[] strs1 = {"a", "b", "c"};
	        String expected1 = "a,b,c";
	        assertEquals(expected1, Work2.getCsvString(strs1));

	        // nullを渡した場合の異常系
	        String[] strs2 = null;
	        assertThrows(IllegalArgumentException.class, () -> {
	            Work2.getCsvString(strs2);
	        });

	        // 空の配列を渡した場合の異常系
	        String[] strs3 = {};
	        assertThrows(IllegalArgumentException.class, () -> {
	            Work2.getCsvString(strs3);
	        });
	    }
	 
	 @Test
	    void testGetValues() {
	        // 正常系テスト
	        String str1 = "abc,def,ghi";
	        String[] expected1 = {"abc", "def", "ghi"};
	        assertArrayEquals(expected1, Work2.getValues(str1));

	        // 空文字列を渡した場合の異常系
	        String str2 = "";
	        assertThrows(IllegalArgumentException.class, () -> {
	            Work2.getValues(str2);
	        });

	        // nullを渡した場合の異常系
	        String str3 = null;
	        assertThrows(IllegalArgumentException.class, () -> {
	            Work2.getValues(str3);
	        });
	    }
	 
	 @Test
	    void testFormat() {
	        // 正常系テスト
	        assertEquals("1,234", Work2.format("1234"));
	        assertEquals("-1,234,567", Work2.format("-1234567"));

	        // nullを渡した場合の異常系
	        assertThrows(IllegalArgumentException.class, () -> {
	        	Work2.format(null);
	        });

	        // 数字以外の文字列を渡した場合の異常系
	        assertThrows(IllegalArgumentException.class, () -> {
	        	Work2.format("abc＠");
	        });

	        // int型で収まらない数字を渡した場合の異常系
	        assertThrows(IllegalArgumentException.class, () -> {
	        	Work2.format("2147483648");
	        });
	        assertThrows(IllegalArgumentException.class, () -> {
	        	Work2.format("-2147483649");
	        });

	        // int型で収まる数字を渡した場合の正常系
	        assertEquals("2,147,483,647", Work2.format("2147483647"));
	        assertEquals("-2,147,483,648", Work2.format("-2147483648"));
	    }
	 
	 @Test
	 	void testGetSortValues() { 
		 //正常系 
		 assertEquals("5,4,3,2,1", Work2.getSortValues("1,2,3,4,5")); 
		 
		
//		 引数にnullを渡した場合の異常系
		 assertThrows(IllegalArgumentException.class, () -> {
			 Work2.getSortValues(null);
			 });
		 
//		 引数に空文字を渡した場合の異常系
		 assertThrows(IllegalArgumentException.class, () -> {
			 Work2.getSortValues("");
			 });
//		 引数に数字以外が含まれている文字列を渡した場合の異常系
		 assertThrows(NumberFormatException.class, () -> {
			 Work2.getSortValues("1,a,3");
			 });
		
	 }


}
