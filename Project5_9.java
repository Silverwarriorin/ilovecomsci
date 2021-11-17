import java.util.*;

public class Project5_9 {
		public static void main(String[] args) {
			int th;
			int hun;
			int ten;
			int one;
			
			String rome = "";
			
			Scanner e = new Scanner(System.in);
			System.out.print("Enter an integer less than 4000: ");
			int a = e.nextInt();
			if(a >= 4000) {
				System.out.println("Enter a smaller number!");
			} else if(a < 4000) {
			String aa = Integer.toString(a);
			StringBuilder sb = new StringBuilder();
			sb.append(aa);
			sb.reverse();
			aa = sb.toString();
			String[] ugh = aa.split("");
			
			if(ugh.length == 4 ) {
				th = Integer.parseInt(ugh[3]) * 1000;
				hun = Integer.parseInt(ugh[2]) * 100;
				ten = Integer.parseInt(ugh[1]) * 10;
				one = Integer.parseInt(ugh[0]);
				
				Numerals tho = new Numerals(th);
				Numerals h = new Numerals(hun);
				Numerals t = new Numerals(ten);
				Numerals o = new Numerals(one);
				
				rome += tho.roam() + h.roam() + t.roam() + o.roam();
				
			System.out.println(th + " " + hun + " " + ten + " " + one);

			} else if(ugh.length == 3) {
				hun = Integer.parseInt(ugh[2]) * 100;
				ten = Integer.parseInt(ugh[1]) * 10;
				one = Integer.parseInt(ugh[0]);
				
				Numerals h = new Numerals(hun);
				Numerals t = new Numerals(ten);
				Numerals o = new Numerals(one);
				
				rome += h.roam() + t.roam() + o.roam();
				
			System.out.println(hun + " " + ten + " " + one);
			} else if(ugh.length == 2) {
				ten = Integer.parseInt(ugh[1]) * 10;
				one = Integer.parseInt(ugh[0]);
				
				Numerals t = new Numerals(ten);
				Numerals o = new Numerals(one);
				rome += t.roam() + o.roam();
							
			System.out.println(ten + " " + one);
			} else if(ugh.length == 1) {
				one = Integer.parseInt(ugh[0]);
				
				Numerals o = new Numerals(one);
				rome += o.roam();
			System.out.println(one);
			} 
			
			System.out.println(rome);
			}
		}
}