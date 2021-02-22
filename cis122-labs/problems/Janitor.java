// CSE 142, Lab 9
// The Janitor is a special, unloved type of employee.

public class Janitor extends Employee {
    public int getHours() {
        return 80;          // works 80 hours / week
    }
    
    public double getSalary() {
        return 30000.0;     // $40,000.00 / year
    }
    
    public int getVacationDays() {
        return 5;           // 1 week paid vacation
    }

    public void clean() {   // new behavior
        System.out.println("Workin' for the man.");
    }
}
