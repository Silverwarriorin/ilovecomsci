import java.util.*;

public class Ex5_3 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int a = e.nextInt();
		int dig = 1;
		
		if(a<0) {
			a  *= -1;
		}
		while((a/10) > 0) {
			a /= 10;
			dig++;
		}
		
		System.out.println("There are " + dig + " digits in this number");
	}
}