import java.util.Scanner;


public class FivePointEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        String name = sc.next();

        System.out.println("Enter employee salary: ");
        double hourly = sc.nextDouble();

        System.out.println("How many hours did " + name + " work? (Input fractional hours as a decimal)");
        double hours = sc.nextDouble();

        Paycheck check = new Paycheck(hours, hourly);
        double pay = check.computePay();

        System.out.println(name + " is owed $" + pay);
    }
}
