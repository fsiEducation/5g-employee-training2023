package src.education.ikeda;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class Work1Test extends Work1 {

//	getDateのテスト
	@Test 
	public void testGetDate() throws ParseException {
		Date expected = new SimpleDateFormat("yyyy/MM/dd").parse("2021/01/01"); 
		Date actual = Work1.getDate("2021/01/01"); 
//		正常系
		assertEquals(expected, actual); 
		
		assertThrows(ParseException.class, () -> {
            Work1.getDate("2022-12-31"); // 想定するフォーマットではない
        });
		}
	
//	getToday関数正常系のテスト
//	引数がないので正常系のみ
	@Test 
	public void testGetToday() throws ParseException { 
		String expected = new SimpleDateFormat("yyyy/MM/dd").format(new Date()); 
		String actual = Work1.getToday(); assertEquals(expected, actual); 
		}
	
//	getDateDiffのテスト
	@Test 
	public void testGetDateDiff() throws ParseException { 
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse("2022/01/01"); 
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse("2022/01/02"); 
		long expected = 86400; 
//		正常系
		long actual = Work1.getDateDiff(date1, date2); 
		assertEquals(expected, actual); 
		
//		異常系
		Date date3 = new SimpleDateFormat("yyyy/MM/dd").parse("2010/01/01"); 
		assertThrows(IllegalArgumentException.class, () -> {
            Work1.getDateDiff(date1, date3); // 日付が10年異常離れている
        });
		}
	
//	getCompareDateの正常系のテスト
	@Test 
	public void testGetCompareDate() throws ParseException { 
		Date date1 = new SimpleDateFormat("yyyy/MM/dd").parse("2021/01/01"); 
		Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse("2022/01/01"); 
		String expected = "2022/01/01"; 
		
//		(前の日付, 後の日付)
		String actual1 = Work1.getCompareDate(date1, date2); 
		
//		(後の日付, 前の日付)
		String actual2 = Work1.getCompareDate(date2, date1);
		
//		同じ日付
		String actual3 = Work1.getCompareDate(date2, date2);
		
		assertEquals(expected, actual1); 
		assertEquals(expected, actual2); 
		assertEquals(expected, actual3);
		}

}
