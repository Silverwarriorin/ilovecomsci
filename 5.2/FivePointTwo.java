import java.util.Scanner;

public class FivePointTwo {
    enum Status {
        Single,
        Married
    }

    static class Person {
        Status status;
        double taxable_income;

        public Person(Status status, double taxable_income) {
            this.status = status;
            this.taxable_income = taxable_income;
        }

        public double computeTaxes() {
            if (status == Status.Single) {

                if (taxable_income > 0 && taxable_income <= 8000) {
                    return taxable_income * .1;
                } else if (taxable_income > 8000 && taxable_income <= 32000) {
                    return .15 * (taxable_income-8000) + 800;
                } else {
                    return .25 * (taxable_income-32000) + 4400;
                }
            } else {

                if (taxable_income > 0 && taxable_income <= 16000) {
                    return taxable_income * .1;
                } else if (taxable_income > 16000 && taxable_income <= 64000) {
                    return .15 * (16000-taxable_income) + 1600;
                } else {
                    return .25 * (64000-taxable_income) + 8800;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] in = new String[2];
        System.out.println("Enter Status (Single/Married)");
        in[0] = sc.next();
        System.out.println("Enter taxable income: ");
        in[1] = sc.next();

        Person p;
        switch (in[0]) {
            case "Single" -> p = new Person(Status.Single, Double.parseDouble(in[1]));
            case "Married" -> p = new Person(Status.Married, Double.parseDouble(in[1]));
            default -> throw new IllegalArgumentException("Illegal Status: " + in[0]);
        }

        System.out.printf("Total taxes owed: $%.2f", p.computeTaxes());




    }

}


