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
		if(input.startsWith("1") && input.length()==2 && !list.containsValue(input) && !input.endsWith("1")){
			return list.get("10")+"-"+list.get(input.charAt(1)+"");
		}
		if(input.startsWith("2") && input.length()==2 && !list.containsValue(input) && !input.endsWith("1")){
			return list.get("20")+"-"+list.get(input.charAt(1)+"");
		}
		if(input.startsWith("3") && input.length()==2 && !list.containsValue(input) && !input.endsWith("1")){
			return list.get("30")+"-"+list.get(input.charAt(1)+"");
		}
		if(input.startsWith("4") && input.length()==2 && !list.containsValue(input) && !input.endsWith("1")){
			return list.get("40")+"-"+list.get(input.charAt(1)+"");
		}
		if(input.startsWith("5") && input.length()==2 && !list.containsValue(input) && !input.endsWith("1")){
			return list.get("50")+"-"+list.get(input.charAt(1)+"");
		}
		if(input.startsWith("6") && input.length()==2 && !list.containsValue(input) && !input.endsWith("1")){
			return list.get("60")+"-"+list.get(input.charAt(1)+"");
		}
		if(input.startsWith("7") && input.length()==2 && !list.containsValue(input)){
			return list.get("60")+"-"+Convert.num2text("1"+input.charAt(1));
		}
		if(input.startsWith("8") && input.length()==2 && !list.containsValue(input)){
			return list.get("4")+"-"+Convert.num2text("2"+input.charAt(1));
		}
		if(input.startsWith("9") && input.length()==2 && !list.containsValue(input)){
			return list.get("4")+"-"+Convert.num2text("20")+"-"+Convert.num2text("1"+input.charAt(1));
		}
		if(input.endsWith("1") && input.length()==2 && !list.containsValue(input)){
			return list.get(input.charAt(0)+"0")+"-et-un";
		}
		
		return null;
	}
	public static String text2num(String input) {
		return null;
	}
}