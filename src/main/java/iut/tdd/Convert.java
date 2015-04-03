package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	public static String num2text(String input) {
		Map<String,String> list = new HashMap<String,String>();
		list.put("0", "zéro");
		list.put("1", "un");
		list.put("2", "deux");
		list.put("3", "trois");
		list.put("4", "quatre");
		list.put("5", "cinq");
		list.put("6", "six");
		list.put("7", "sept");
		list.put("8", "huit");
		list.put("9", "neuf");
		list.put("10", "dix");
		list.put("11", "onze");
		list.put("12", "douze");
		list.put("13", "treize");
		list.put("14", "quatorze");
		list.put("15", "quinze");
		list.put("16", "seize");
		list.put("20", "vingt");
		list.put("30", "trente");
		list.put("40", "quarente");
		list.put("50", "cinquente");
		list.put("60", "soixante");
		list.put("100", "cent");
		if(list.containsKey(input)){
			return list.get(input);
		}
		return null;
	}
	public static String text2num(String input) {
		return null;
	}
}