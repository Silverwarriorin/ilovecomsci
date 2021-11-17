import java.util.*;
import java.text.*;
import java.math.*;

public class Ex5_22 {
	public static void main(String[] args) {
		System.out.print("Enter two floating-point numbers: ");
		Scanner e = new Scanner(System.in);
		double a = e.nextDouble();
		double b = e.nextDouble();
		
		String patt = "#.##";
		DecimalFormat df = new DecimalFormat(patt);
	//	df.setRoundingMode(RoundingMode.UP);
		
		a = Double.parseDouble(df.format(a));
		b = Double.parseDouble(df.format(b));
		
		System.out.println(a + " " + b);
		
		if(a == b) {
			System.out.println("They are the same up to two decimal places.");
		}
		else {
			System.out.println("They are different up to two decimal places");
		}
	}
}