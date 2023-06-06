package src.education.ikeda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Work4Test {

	@Test public void testGetTimesValue() { 
		// 異常系Nan
		assertThrows(IllegalArgumentException.class, () -> {
			Work4.getTimesValue(Double.NaN, 2.0); 
			}); 
		assertThrows(IllegalArgumentException.class, () -> { 
			Work4.getTimesValue(2.0, Double.NaN); 
			}); 
		assertThrows(IllegalArgumentException.class, () -> { 
			Work4.getTimesValue(Double.NaN, Double.NaN); 
			});
		
//		異常系オーバーフロー
		try {
		    Work4.getTimesValues(Double.MAX_VALUE, Double.MAX_VALUE);
		    fail("ArithmeticExceptionが発生しませんでした。");
		} catch (ArithmeticException e) {
		    assertEquals("オーバーフローしました。", e.getMessage());
		}
		try {
		    Work4.getTimesValues(1.23e+308, 1.23e+308);
		    fail("ArithmeticExceptionが発生しませんでした。");
		} catch (ArithmeticException e) {
		    assertEquals("オーバーフローしました。", e.getMessage());
		}

		// 正常系
		assertEquals(6, Work4.getTimesValue(1.5, 2.5));
		assertEquals(24, Work4.getTimesValue(3.14, 5.3));
		assertEquals(15, Work4.getTimesValue(2.7, 4.5));
		
		}
	
	@Test public void testGetRandomValue() {
		// 指定された範囲に含まれる数値か
		for(int i=0; i<100000; i++) { 
			int value = Work4.getRandomValue(); 
			assertTrue(value >= 0 && value <= 999); 
			}
		}
	
	@Test public void testGetDividedValue() { 
		// 正常系のテスト 
		assertEquals(5, Work4.getDividedValue(10, 2)); 
		assertEquals(-3, Work4.getDividedValue(-6, 2)); 
		assertEquals(0, Work4.getDividedValue(0, 1));

		// 異常系のテスト
		try {
			Work4.getDividedValue(10, 0);
		    fail("IllegalArgumentExceptionが発生しませんでした。");
		    } catch (IllegalArgumentException e) {
		    assertEquals("除数に0が指定されました。", e.getMessage());
		    }
		try {
			Work4.getDividedValue(Long.MAX_VALUE, 1);
		    fail("ArithmeticExceptionが発生しませんでした。");
		    } catch (ArithmeticException e) {
		    assertEquals("割り算でエラーが発生しました。", e.getMessage());
		    }
		}
	
	@Test public void testGetTimesValues() { 
		// 正常系のテスト 
		assertEquals("c", Work4.getTimesValues(2.5, 3.2)); 
		assertEquals("64", Work4.getTimesValues(19.9, 4.1)); 
		assertEquals("0", Work4.getTimesValues(0, 1));

//		 例外発生ケースのテスト
		// 異常系Nan
		assertThrows(IllegalArgumentException.class, () -> {
			Work4.getTimesValue(Double.NaN, 2.0); 
			}); 
		assertThrows(IllegalArgumentException.class, () -> { 
			Work4.getTimesValue(2.0, Double.NaN); 
			}); 
		assertThrows(IllegalArgumentException.class, () -> { 
			Work4.getTimesValue(Double.NaN, Double.NaN); 
			});
		
//		異常系オーバーフロー
		try {
		    Work4.getTimesValues(Double.MAX_VALUE, Double.MAX_VALUE);
		    fail("ArithmeticExceptionが発生しませんでした。");
		} catch (ArithmeticException e) {
		    assertEquals("オーバーフローしました。", e.getMessage());
		}
		try {
		    Work4.getTimesValues(1.23e+308, 1.23e+308);
		    fail("ArithmeticExceptionが発生しませんでした。");
		} catch (ArithmeticException e) {
		    assertEquals("オーバーフローしました。", e.getMessage());
		}
		}
	
	

}
