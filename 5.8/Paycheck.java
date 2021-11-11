public class Paycheck {
    private double hours, wage;
    private double pay;

    public Paycheck(double hours, double wage) {
        this.hours = hours;
        this.wage = wage;
    }

    public double computePay() {
        if (hours > 40) {
            pay = (40 * wage) + ((hours-40) * (wage*1.5));
        } else {
            pay = hours*wage;
        }

        return pay;
    }
}
