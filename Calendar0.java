/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		if (isLeapYear(year)) {System.out.println(year + " is a leap year");}
		else {System.out.println(year + " is a common year");}
		// nDaysInMonthTest(year);

		for (int i = 1; i <= 12; i++) {
			System.out.println("Month " + i + " has " + nDaysInMonth(i, year) + " days");
		}

	}
		 
	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		// Replace this comment with your code
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {return true;}
		return false;
	}
	 

	public static int nDaysInMonth(int month, int year) {
		if (month == 4 || month == 6 || month == 9 || month == 11) {return 30;}
		else if (month == 2 ) {
			if (isLeapYear(year)) {return 29;}
			else {return 28;}}
		else {return 31;}
	}
}
