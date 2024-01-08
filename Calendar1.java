/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int special_sunday = 0;
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
		advance();
	 	// while (false) {
	 	// 	//// Write the body of the while 		
	 	// 	advance();
	 	// 	debugDaysCounter++;
	 	// 	//// If you want to stop the loop after n days, replace the condition of the
	 	// 	//// if statement with the condition (debugDaysCounter == n)
	 	// 	if (false) { 
	 	// 		break;
	 	// 	}
        // }
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		// year loop
		for (int i = 1900; i < 2000; i++) {
			// month loop
			for (int x = 1; x <= 12; x++) {
				// days loop
				for (int j = 1; j <= nDaysInMonth(x, i); j++) {
					dayOfMonth = j;
					if (dayOfWeek == 1) {
						// Sunday
						System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
						if (dayOfMonth == 1) {special_sunday++;}
					}
					else {
						System.out.println(dayOfMonth + "/" + month + "/" + year);
					}
					dayOfWeek++;
					if (dayOfWeek % 8 == 0) {dayOfWeek = 1;}
					
				}
			if (month == 12) {month = 1;} 
			else {month++;}
			}
			year++;
		}
		System.out.println("During the 20th century, " + special_sunday + " Sundays fell on the first day of the month");
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {return true;}
		return false;
	}
	 
	private static int nDaysInMonth(int month, int year) {
		if (month == 4 || month == 6 || month == 9 || month == 11) {return 30;}
		else if (month == 2 ) {
			if (isLeapYear(year)) {return 29;}
			else {return 28;}}
		else {return 31;}
	}
}