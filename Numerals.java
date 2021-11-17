
public class Numerals {
	final static String[][] num = {
			{"1", "I"},
			{"2", "II"},
			{"3", "III"},
			{"4", "IV"},
			{"5", "V"},
			{"6", "VI"},
			{"7", "VII"},
			{"8", "VIII"},
			{"9", "IX"}, 
			{"10", "X"},
			{"20", "XX"},
			{"30", "XXX"},
			{"40", "XL"},
			{"50", "L"},
			{"60", "LX"},
			{"70", "LXX"},
			{"80", "LXXX"},
			{"90", "XC"},
			{"100", "C"},
			{"200", "CC"},
			{"300", "CCC"},
			{"400", "CD"},
			{"500", "D"}, 
			{"600", "DC"},
			{"700", "DCC"},
			{"800", "DCCC"},
			{"900", "CM"},
			{"1000", "M"},
			{"2000", "MM"},
			{"3000", "MMM"}
	};
	
	private String number;
	
	public Numerals(int a) {
		number = Integer.toString(a);
	}
	
	public String roam() {
	for(int b = 0; b<num.length; b++) {
		if(num[b][0].equals(number)) {
			return num[b][1];
		}
	}
	return "uhh";
	}
}