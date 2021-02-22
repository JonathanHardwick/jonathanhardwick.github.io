/*
CSE 142 Lab 7

This program prompts the user to enter several numbers,
stores the numbers into an array,
then prints the numbers in forwards and backwards order.

Expected example output:

How many numbers will you enter? 4
Type a number: 12
Type a number: 8
Type a number: -2
Type a number: 39

Your numbers in forward order:
12
8
-2
39

Your numbers in backward order:
39
-2
8
12
*/

public class PromptNumbers {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers will you enter? ");
		int count = console.nextInt();
		
		
		for (int i = ???; i < ???; i++) {
			// your code goes here; store the numbers
			System.out.print("Type a number: ");
			
		}
		
		System.out.println();
		System.out.println("Your numbers in forward order:");
		
		for (int i = ???; i < ???; i++) {
			// your code goes here; print the numbers in forward order
		
		}

		System.out.println();
		System.out.println("Your numbers in backward order:");
		
		// your code goes here; print the numbers in backward order
		
	}
}