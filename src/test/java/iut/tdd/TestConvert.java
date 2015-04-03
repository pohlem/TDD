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
	@Test
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
		public void test_num45text_quarente_et_un () {
			Assert.assertEquals("quarente-et-un", Convert.num2text("41"));
		}
		@Test
		public void test_num46text_quarente_deux () {
			Assert.assertEquals("quarente-deux", Convert.num2text("42"));
		}
		@Test
		public void test_num47text_quarente_trois () {
			Assert.assertEquals("quarente-trois", Convert.num2text("43"));
		}
		@Test
		public void test_num48text_quarente_quatre () {
			Assert.assertEquals("quarente-quatre", Convert.num2text("44"));
		}
		@Test
		public void test_num49text_quarente_cinq () {
			Assert.assertEquals("quarente-cinq", Convert.num2text("45"));
		}
		@Test
		public void test_num50text_quarente_six () {
			Assert.assertEquals("quarente-six", Convert.num2text("46"));
		}
		@Test
		public void test_num51text_quarente_sept () {
			Assert.assertEquals("quarente-sept", Convert.num2text("47"));
		}
		@Test
		public void test_num52text_quarente_huit () {
			Assert.assertEquals("quarente-huit", Convert.num2text("48"));
		}
		@Test
		public void test_num53text_quarente_neuf () {
			Assert.assertEquals("quarente-neuf", Convert.num2text("49"));
		}
		@Test
		public void test_num21text_cinquente () {
			Assert.assertEquals("cinquente", Convert.num2text("50"));
		}
		@Test
		public void test_num54text_cinquente_et_un () {
			Assert.assertEquals("cinquente-et-un", Convert.num2text("51"));
		}
		@Test
		public void test_num55text_cinquente_deux () {
			Assert.assertEquals("cinquente-deux", Convert.num2text("52"));
		}
		@Test
		public void test_num56text_cinquente_trois () {
			Assert.assertEquals("cinquente-trois", Convert.num2text("53"));
		}
		@Test
		public void test_num57text_cinquente_quatre () {
			Assert.assertEquals("cinquente-quatre", Convert.num2text("54"));
		}
		@Test
		public void test_num56text_cinquente_cinq () {
			Assert.assertEquals("cinquente-cinq", Convert.num2text("55"));
		}
		@Test
		public void test_num57text_cinquente_six () {
			Assert.assertEquals("cinquente-six", Convert.num2text("56"));
		}
		@Test
		public void test_num58text_cinquente_sept () {
			Assert.assertEquals("cinquente-sept", Convert.num2text("57"));
		}
		@Test
		public void test_num59text_cinquente_huit () {
			Assert.assertEquals("cinquente-huit", Convert.num2text("58"));
		}
		@Test
		public void test_num60text_cinquente_neuf () {
			Assert.assertEquals("cinquente-neuf", Convert.num2text("59"));
		}
		@Test
		public void test_num22text_soixante () {
			Assert.assertEquals("soixante", Convert.num2text("60"));
		}
		@Test
		public void test_num25text_soixante_et_un () {
			Assert.assertEquals("soixante-et-un", Convert.num2text("61"));
		}
		@Test
		public void test_num24text_soixante_deux () {
			Assert.assertEquals("soixante-deux", Convert.num2text("62"));
		}
		@Test
		public void test_num61text_soixante_trois () {
			Assert.assertEquals("soixante-trois", Convert.num2text("63"));
		}
		@Test
		public void test_num62text_soixante_quatre () {
			Assert.assertEquals("soixante-quatre", Convert.num2text("64"));
		}
		@Test
		public void test_num63text_soixante_cinq () {
			Assert.assertEquals("soixante-cinq", Convert.num2text("65"));
		}
		@Test
		public void test_num64text_soixante_six () {
			Assert.assertEquals("soixante-six", Convert.num2text("66"));
		}
		@Test
		public void test_num65text_soixante_sept () {
			Assert.assertEquals("soixante-sept", Convert.num2text("67"));
		}
		@Test
		public void test_num66text_soixante_huit () {
			Assert.assertEquals("soixante-huit", Convert.num2text("68"));
		}
		@Test
		public void test_num69text_soixante_neuf () {
			Assert.assertEquals("soixante-neuf", Convert.num2text("69"));
		}
		@Test
		public void test_num70text_soixante_dix () {
			Assert.assertEquals("soixante-dix", Convert.num2text("70"));
		}
		@Test
		public void test_num71text_soixante_onze () {
			Assert.assertEquals("soixante-onze", Convert.num2text("71"));
		}
		@Test
		public void test_num72text_soixante_douze () {
			Assert.assertEquals("soixante-douze", Convert.num2text("72"));
		}
		@Test
		public void test_num73text_soixante_treize () {
			Assert.assertEquals("soixante-treize", Convert.num2text("73"));
		}
		@Test
		public void test_num74text_soixante_quatorze () {
			Assert.assertEquals("soixante-quatorze", Convert.num2text("74"));
		}
		@Test
		public void test_num75text_soixante_quinze () {
			Assert.assertEquals("soixante-quinze", Convert.num2text("75"));
		}
		@Test
		public void test_num76text_soixante_seize () {
			Assert.assertEquals("soixante-seize", Convert.num2text("76"));
		}
		@Test
		public void test_num77text_soixante_dix_sept () {
			Assert.assertEquals("soixante-dix-sept", Convert.num2text("77"));
		}
		@Test
		public void test_num78text_soixante_dix_huit () {
			Assert.assertEquals("soixante-dix-huit", Convert.num2text("78"));
		}
		@Test
		public void test_num79text_soixante_dix_neuf () {
			Assert.assertEquals("soixante-dix-neuf", Convert.num2text("79"));
		}
		@Test
		public void test_num80text_quatre_vingt() {
			Assert.assertEquals("quatre-vingt", Convert.num2text("80"));
		}
		@Test
		public void test_num81text_quatre_vingt_et_un() {
			Assert.assertEquals("quatre-vingt-et-un", Convert.num2text("81"));
		}
		@Test
		public void test_num82text_quatre_vingt_deux() {
			Assert.assertEquals("quatre-vingt-deux", Convert.num2text("82"));
		}
		@Test
		public void test_num83text_quatre_vingt_trois() {
			Assert.assertEquals("quatre-vingt-trois", Convert.num2text("83"));
		}
		@Test
		public void test_num84text_quatre_vingt_quatre() {
			Assert.assertEquals("quatre-vingt-quatre", Convert.num2text("84"));
		}
		@Test
		public void test_num85text_quatre_vingt_cinq() {
			Assert.assertEquals("quatre-vingt-cinq", Convert.num2text("85"));
		}
		@Test
		public void test_num86text_quatre_vingt_six() {
			Assert.assertEquals("quatre-vingt-six", Convert.num2text("86"));
		}
		@Test
		public void test_num87text_quatre_vingt_sept() {
			Assert.assertEquals("quatre-vingt-sept", Convert.num2text("87"));
		}
		@Test
		public void test_num88text_quatre_vingt_huit() {
			Assert.assertEquals("quatre-vingt-huit", Convert.num2text("88"));
		}
		@Test
		public void test_num89text_quatre_vingt_neuf() {
			Assert.assertEquals("quatre-vingt-neuf", Convert.num2text("89"));
		}
		@Test
		public void test_num90text_quatre_vingt_dix() {
			Assert.assertEquals("quatre-vingt-dix", Convert.num2text("90"));
		}
		@Test
		public void test_num91text_quatre_vingt_onze() {
			Assert.assertEquals("quatre-vingt-onze", Convert.num2text("91"));
		}
		@Test
		public void test_num92text_quatre_vingt_douze() {
			Assert.assertEquals("quatre-vingt-douze", Convert.num2text("92"));
		}
		@Test
		public void test_num93text_quatre_vingt_treize() {
			Assert.assertEquals("quatre-vingt-treize", Convert.num2text("93"));
		}
		@Test
		public void test_num94text_quatre_vingt_quatorze() {
			Assert.assertEquals("quatre-vingt-quatorze", Convert.num2text("94"));
		}
		@Test
		public void test_num95text_quatre_vingt_quinze() {
			Assert.assertEquals("quatre-vingt-quinze", Convert.num2text("95"));
		}
		@Test
		public void test_num96text_quatre_vingt_seize() {
			Assert.assertEquals("quatre-vingt-seize", Convert.num2text("96"));
		}
		@Test
		public void test_num97text_quatre_vingt_dix_sept() {
			Assert.assertEquals("quatre-vingt-dix-sept", Convert.num2text("97"));
		}
		@Test
		public void test_num98text_quatre_vingt_dix_huit() {
			Assert.assertEquals("quatre-vingt-dix-huit", Convert.num2text("98"));
		}
		@Test
		public void test_num97text_quatre_vingt_dix_neuf() {
			Assert.assertEquals("quatre-vingt-dix-neuf", Convert.num2text("99"));
		}
		@Test
		public void test_num23text_cent () {
			Assert.assertEquals("cent", Convert.num2text("100"));
		}
	}
