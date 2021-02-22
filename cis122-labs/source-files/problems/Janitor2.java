// CSE 142, Lab 9
// The Janitor is a special, unloved type of employee.
// This version uses the 'super' keyword.

public class Janitor extends Employee {
    public int getHours() {
        return 2 * super.getHours();           // works 80 hours / week
    }
    
    public double getSalary() {
        return super.getSalary() - 10000.0;    // $40,000.00 / year
    }
    
    public int getVacationDays() {
        return super.getVacationDays() / 2;    // 2 weeks' paid vacation
    }

    public void clean() {                      // new behavior
        System.out.println("Workin' for the man.");
    }
}
