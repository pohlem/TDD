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
		@Test
		public void test_num24text_dix_sept () {
			Assert.assertEquals("dix-sept", Convert.num2text("17"));
		}
		@Test
		public void test_num25text_dix_huit () {
			Assert.assertEquals("dix-huit", Convert.num2text("18"));
		}
		@Test
		public void test_num26text_dix_neuf () {
			Assert.assertEquals("dix-neuf", Convert.num2text("19"));
		}
		@Test
		public void test_num18text_vingt () {
			Assert.assertEquals("vingt", Convert.num2text("20"));
		}
		@Test
		public void test_num27text_vingt_et_un () {
			Assert.assertEquals("vingt-et-un", Convert.num2text("21"));
		}
		@Test
		public void test_num28text_vingt_deux () {
			Assert.assertEquals("vingt-deux", Convert.num2text("22"));
		}
		@Test
		public void test_num29text_vingt_trois () {
			Assert.assertEquals("vingt-trois", Convert.num2text("23"));
		}
		@Test
		public void test_num30text_vingt_quatre () {
			Assert.assertEquals("vingt-quatre", Convert.num2text("24"));
		}
		@Test
		public void test_num311ext_vingt_cinq () {
			Assert.assertEquals("vingt-cinq", Convert.num2text("25"));
		}
		@Test
		public void test_num32text_vingt_six () {
			Assert.assertEquals("vingt-six", Convert.num2text("26"));
		}
		@Test
		public void test_num33text_vingt_sept () {
			Assert.assertEquals("vingt-sept", Convert.num2text("27"));
		}
		@Test
		public void test_num34text_vingt_huit () {
			Assert.assertEquals("vingt-huit", Convert.num2text("28"));
		}
		@Test
		public void test_num35text_vingt_neuf () {
			Assert.assertEquals("vingt-neuf", Convert.num2text("29"));
		}
		@Test
		public void test_num19text_trente () {
			Assert.assertEquals("trente", Convert.num2text("30"));
		}
		@Test
		public void test_num36text_trente_et_un () {
			Assert.assertEquals("trente-et-un", Convert.num2text("31"));
		}
		@Test
		public void test_num37text_trente_deux () {
			Assert.assertEquals("trente-deux", Convert.num2text("32"));
		}
		@Test
		public void test_num38text_trente_trois () {
			Assert.assertEquals("trente-trois", Convert.num2text("33"));
		}
		@Test
		public void test_num39text_trente_quatre () {
			Assert.assertEquals("trente-quatre", Convert.num2text("34"));
		}
		@Test
		public void test_num40text_trente_cinq () {
			Assert.assertEquals("trente-cinq", Convert.num2text("35"));
		}
		@Test
		public void test_num41text_trente_six () {
			Assert.assertEquals("trente-six", Convert.num2text("36"));
		}
		@Test
		public void test_num42text_trente_sept () {
			Assert.assertEquals("trente-sept", Convert.num2text("37"));
		}
		@Test
		public void test_num43text_trente_huit () {
			Assert.assertEquals("trente-huit", Convert.num2text("38"));
		}
		@Test
		public void test_num44text_trente_neuf () {
			Assert.assertEquals("trente-neuf", Convert.num2text("39"));
		}
		@Test
		public void test_num20text_quarente () {
			Assert.assertEquals("quarente", Convert.num2text("40"));
		}
		@Test
		public void test_num24text_soixante_deux () {
			Assert.assertEquals("soixante-deux", Convert.num2text("62"));
		}
		@Test
		public void test_num25text_soixante_un () {
			Assert.assertEquals("soixante-et-un", Convert.num2text("61"));
		}
	}
