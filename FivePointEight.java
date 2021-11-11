
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class FivePointEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter four numbers separated by spaces: ");
        String[] in = sc.nextLine().split(" ");
        
        for (int i = 1; i < 4; i++) {
            if (!in[i].equals(in[i-1]))
            {
                System.out.println("not two pairs");
                exit(1);
            }
        }

        System.out.println("two pairs");
    }
}
