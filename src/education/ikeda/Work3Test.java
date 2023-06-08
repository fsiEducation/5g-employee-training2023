package src.education.ikeda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Work3Test {

	@Test
	void testCheckNumber() {
		//正常系 
		assertTrue(Work3.checkNumber("1234"));
		assertTrue(Work3.checkNumber("-1234"));
		assertTrue(Work3.checkNumber("1234.567"));
		assertTrue(Work3.checkNumber("-1234.567"));
		assertTrue(Work3.checkNumber("0.567"));
		assertTrue(Work3.checkNumber("-0.567"));
		assertTrue(Work3.checkNumber("0"));
		assertFalse(Work3.checkNumber("1234a"));
		assertFalse(Work3.checkNumber("1.2.3"));
		//		異常系
		assertThrows(IllegalArgumentException.class, () -> {
			Work3.checkNumber("");
		});
		assertThrows(IllegalArgumentException.class, () -> {
			Work3.checkNumber(null);
		});
	}

	@Test
	void testCheckLength() {
		// 正常系8以下
		assertTrue(Work3.checkLength("abcd1234"));
		assertTrue(Work3.checkLength("あいうえお1"));
		assertTrue(Work3.checkLength("12345678"));
		// 正常系8以上
		assertFalse(Work3.checkLength("abcdefg1234"));
		assertFalse(Work3.checkLength("あいうえおかきくけこ1"));
		assertFalse(Work3.checkLength("123456789"));
		// 異常系
		assertThrows(IllegalArgumentException.class, () -> {
			Work3.checkLength(null);
		});
	}

	@Test
	public void testCheckYMD() {
		//		 正常系無効な年
		assertFalse(Work3.checkYMD("abcd", "12", "23"));
		assertFalse(Work3.checkYMD("203", "12", "23"));

		//		正常系無効な月
		assertFalse(Work3.checkYMD("2021", "00", "23"));
		assertFalse(Work3.checkYMD("2021", "13", "23"));

		//		 正常系無効な日
		assertFalse(Work3.checkYMD("2021", "12", "00"));
		assertFalse(Work3.checkYMD("2021", "12", "32"));

		//		正常系スクランブル
		assertFalse(Work3.checkYMD("abcd", "00", "00"));
		assertFalse(Work3.checkYMD("203", "13", "00"));
		assertFalse(Work3.checkYMD("2100", "12", "32"));
		assertFalse(Work3.checkYMD("abcd", "13", "32"));

		//		 正常系有効
		assertTrue(Work3.checkYMD("2021", "12", "23"));
	}

	@Test
	public void testCheckString() {
		// 異常系null 
		assertThrows(IllegalArgumentException.class, () -> {
			Work3.checkString(null);
		});

		// 正常系無効な文字を含む
		assertFalse(Work3.checkString("あいうえお"));
		assertFalse(Work3.checkString("Hello, world!"));
		assertFalse(Work3.checkString("hello@world"));
		assertFalse(Work3.checkString("hello~world"));

		// 正常系
		assertTrue(Work3.checkString(""));
		assertTrue(Work3.checkString("abcd1234"));
		assertTrue(Work3.checkString("-abcd1234"));
		assertTrue(Work3.checkString("?abcd1234"));
		assertTrue(Work3.checkString("-?abcd1234"));
	}

}
