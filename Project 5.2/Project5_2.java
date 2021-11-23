import java.util.*;

public class Project5_2 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.print("What is your marital status? (single/married) ");
		String stat = e.next();
		System.out.print("what's your taxable income? ");
		int income = e.nextInt();
		
		System.out.println(stat);
		
		if(stat.equals("single")) {
			if(income <= 8000) {
				double tax = .10;
				tax = tax*income;
				System.out.println("Your tax this year is: " + tax);
			} else if(income > 8000 && income <=32000) {
				income -= 8000;
				double tax = .15;
				tax = tax * income;
				tax += 800;
				System.out.println("Your tax this year is: " + tax);
			} else if(income > 32000) {
				double tax = .15;
				income -= 32000;
				tax = (tax*income) + 4400;
				System.out.println("Your tax this year is: " + tax);
			}
		} else if(stat.equals("married")) {
			if(income <= 16000) {
				double tax = .10;
				tax = tax*income;
				System.out.println("Your tax this year is: " + tax);
			} else if(income > 16000 && income <=64000) {
				income -= 16000;
				double tax = .15;
				tax = tax * income;
				tax += 1600;
				System.out.println("Your tax this year is: " + tax);
			} else if(income > 64000) {
				double tax = .15;
				income -= 64000;
				tax = (tax*income) + 8800;
				System.out.println("Your tax this year is: " + tax);
			}
		} else {
			System.out.println("please enter a valid marital status");
		}
	}
}
