// CSE 142 (190) Labs
// This program demonstrates a subtle bug in Microsoft's Zune media player.
// Try to find the bug and fix the code.

import java.util.*;

public class ZuneBug {
	public static void main(String[] args) {
		System.out.println("MS Zune is computing today's year and day ...");
		
		int days = getTotalDaysSince1980();
		int year = 1980;
		while (days > 365) {
			// subtract out years
			if (isLeapYear(year)) {
				if (days > 366) {    // leap year (366 days)
					days = days - 366;
					year++;
				}
			} else {
				days = days - 365;   // normal year (365 days)
				year++;
			}
		}
		
		System.out.println("year = " + year + ", days = " + days);
	}
	
	
	
	// You can change these constants to simulate different "today" dates.
	// The bug shows up on Jan 1 of a year just after a leap year, such as 2009.
	// Such dates will cause the program to go into an infinite loop.
	public static final int TODAY_YEAR = 2009;
	public static final int TODAY_MONTH = 1;
	public static final int TODAY_DAY = 1;
	
	
	
	// You don't need to read/modify the code below; it is just helper methods.
	
	// Returns total # of days that have passed since Jan 1 1980.
	// uses the given constants to decide what "today" is.
	public static int getTotalDaysSince1980() {
		Calendar jan1  = new GregorianCalendar(1980, 0, 1);
		Calendar today = new GregorianCalendar(TODAY_YEAR, TODAY_MONTH - 1, TODAY_DAY);
		int days = 0;
		while (!jan1.equals(today)) {
			jan1.add(Calendar.DAY_OF_MONTH, 1);
			days++;
		}
		return days;
	}
	
	// true if the given year is a leap year, otherwise false
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
