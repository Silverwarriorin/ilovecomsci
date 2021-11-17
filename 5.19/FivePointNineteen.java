import java.util.Scanner;

public class FivePointNineteen {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the card notation? ");
		String card = sc.nextLine();
		String[] strarr = card.split("");

		//Lots of switch statements lol
		if(strarr.length > 2) {
			strarr[1] = strarr[2];

		}
		switch (strarr[0]) {

			case "A":
				System.out.print("Ace of ");
				break;
			case "2":
				System.out.print("2 of ");
				break;
			case "3":
				System.out.print("3 of ");
				break;
			case "4":
				System.out.print("4 of ");
				break;
			case "5":
				System.out.print("5 of ");
				break;
			case "6":
				System.out.print("6 of ");
				break;
			case "7":
				System.out.print("7 of ");
				break;
			case "8":
				System.out.print("8 of ");
				break;
			case "9":
				System.out.print("9 of ");
				break;
			case "1":
				System.out.print("10 of ");
				break;
			case "J":
				System.out.print("Jack of ");
				break;
			case "Q":
				System.out.print("Queen of ");
				break;
			case "K":
				System.out.print("King of ");
				break;
			default:
				System.out.print("Unknown Card of: ");
		}

		switch (strarr[1]) {
			case "H":
				System.out.print("Hearts");
				break;
			case "D":
				System.out.print("Diamonds");
				break;
			case "S":
				System.out.print("Spades");
				break;
			case "C":
				System.out.print("Clubs");
				break;

			default:
				System.out.print("Unknown Suite");
		}
	}
}
