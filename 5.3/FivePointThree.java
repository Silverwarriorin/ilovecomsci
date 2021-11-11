import java.util.Scanner;
public class FivePointThree {
	public static void main(String[] args) {

		/*
			Takes any int and prints the length to terminal
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("int to check? ");
		int numbertocheck = sc.nextInt();

		if(numbertocheck < 0)
			numbertocheck = numbertocheck * -1;

		int length = (int) (Math.log10(numbertocheck) + 1);
		System.out.println("Length of int: " + length);
	}
}
