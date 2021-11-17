import java.util.*;

public class Ex5_21 {
	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		System.out.print("Enter three words: ");
		String a = e.next();
		String a1=e.next();
		String a2=e.next();

		String b = "";
		
		if(a1.compareTo(a2)<0 && a1.compareTo(a)<0) {
			b+= a1 + " ";
			if(a.compareTo(a2)<0) {
				b+= a + " " + a2;
			} else {
				b+= a2 + " " + a;
			}
		} else if(a2.compareTo(a1) < 0 && a2.compareTo(a)<0) {
			b+=a2+" ";
			if(a.compareTo(a1) < 0) {
				b+=a+ " " + a1;
			} else {
				b+= a1 + " " + a;
			}
		} else if (a.compareTo(a1)<0 && a.compareTo(a2)<0) {
			b+= a+" ";
			if(a1.compareTo(a2) < 0) {
				b+= a1	 + " " + a2;
			} else {
				b += a2 + " " + a1;
			}
		}
		
		System.out.println(b);
	}
}