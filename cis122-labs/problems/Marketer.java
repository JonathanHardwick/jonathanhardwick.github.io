// CSE 142 Labs
// A class to represent marketers.

public class Marketer {
    public void advertise() {
        System.out.println("Act now while supplies last!");
    }

    public double getSalary() {
        return super.getSalary() + 10000.0;      // $50,000.00 / year
    }
}
