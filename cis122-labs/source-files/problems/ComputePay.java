public class ComputePay {
	public static void main(String[] args) {
		// Calculate my pay at work, based on how many hours I worked each day
		System.out.println("My total hours worked:");
		System.out.println(4 + 5 + 8 + 4);

		System.out.println("My hourly salary:");
		System.out.println("$" + 8.75);

		System.out.println("My total pay:");
		System.out.println((4 + 5 + 8 + 4) * 8.75);

		System.out.println("My taxes owed:");
		System.out.println((4 + 5 + 8 + 4) * 8.75 * 0.20);   // 20% tax rate
	}
}