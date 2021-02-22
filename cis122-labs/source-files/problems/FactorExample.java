// CSE 142, Lab 4
// Improve this program by factoring redundant code from the method below.

public class FactorExample {
    public static void main(String[] args) {
        // write some test calls here
        
    }

    public static void factoring(double gpa) {
        int credits = -1;
        if (gpa == 4.0) {
            credits = 5;
            System.out.println("I'm valedictorian for this class! Woo hoo!");
            System.out.println("I made the dean's list for this class!");
        } else if (gpa >= 3.5) {
            credits = 5;
            System.out.println("I made the dean's list for this class!");
        } else {
            credits = 5;
        }

        if (gpa < 1.5) {
            System.out.println("Uh-oh..I probably should have studied a little more.");
        }
        if (gpa <= 0.7) {
            System.out.println("Uh-oh..I probably should have studied a little more.");
            credits = 0;
        }
        System.out.println("I received " + credits + " credits for this class.");
    }
}

