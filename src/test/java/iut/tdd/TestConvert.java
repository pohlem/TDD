package iut.tdd;

import junit.framework.Assert;

import org.junit.Test;

public class TestConvert {
	@Test
	public void test_num1text_zero() {
		Assert.assertEquals("zéro", Convert.num2text("0"));
	}

	@Test
	public void test_num2text_un() {
		Assert.assertEquals("un", Convert.num2text("1"));
	}

	public void test_num3text_deux() {
		Assert.assertEquals("deux", Convert.num2text("2"));
	}

	@Test
	public void test_num4text_trois() {
		Assert.assertEquals("trois", Convert.num2text("3"));
	}
	@Test
	public void test_num5text_quatre () {
		Assert.assertEquals("quatre", Convert.num2text("4"));
	}
	@Test
	public void test_num6text_cinq () {
		Assert.assertEquals("cinq", Convert.num2text("5"));
	}
	
	@Test
	public void test_num7text_six () {
		Assert.assertEquals("six", Convert.num2text("6"));
	}
	
		@Test
		public void test_num8text_sept () {
			Assert.assertEquals("sept", Convert.num2text("7"));
		}
		
		@Test
		public void test_num9text_huit () {
			Assert.assertEquals("huit", Convert.num2text("8"));
		}
		@Test
		public void test_num10text_neuf () {
			Assert.assertEquals("neuf", Convert.num2text("9"));
		}
		@Test
		public void test_num11text_dix () {
			Assert.assertEquals("dix", Convert.num2text("10"));
		}
		@Test
		public void test_num12text_onze () {
			Assert.assertEquals("onze", Convert.num2text("11"));
		}
		@Test
		public void test_num13text_douze () {
			Assert.assertEquals("douze", Convert.num2text("12"));
		}
		@Test
		public void test_num14text_treize () {
			Assert.assertEquals("treize", Convert.num2text("13"));
		}
		@Test
		public void test_num15text_quatorze () {
			Assert.assertEquals("quatorze", Convert.num2text("14"));
		}
		@Test
		public void test_num16text_quinze () {
			Assert.assertEquals("quinze", Convert.num2text("15"));
		}
		@Test
		public void test_num17text_seize () {
			Assert.assertEquals("seize", Convert.num2text("16"));
		}
		@Test
		public void test_num18text_vingt () {
			Assert.assertEquals("vingt", Convert.num2text("20"));
		}
		@Test
		public void test_num19text_trente () {
			Assert.assertEquals("trente", Convert.num2text("30"));
		}
		@Test
		public void test_num20text_quarente () {
			Assert.assertEquals("quarente", Convert.num2text("40"));
		}
		@Test
		public void test_num21text_cinquente () {
			Assert.assertEquals("cinquente", Convert.num2text("50"));
		}
		@Test
		public void test_num22text_soixante () {
			Assert.assertEquals("soixante", Convert.num2text("60"));
		}
		@Test
		public void test_num23text_cent () {
			Assert.assertEquals("cent", Convert.num2text("100"));
		}
	}
