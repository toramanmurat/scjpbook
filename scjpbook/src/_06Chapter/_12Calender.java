package _06Chapter;

import java.util.Calendar;
import java.util.Date;

public class _12Calender {
	// java.util.Calender abstract siniftir.
//	java.util.GregorianCalendar

	public static void main(String[] args) {
//		Calendar c=new Calendar(); illegal // Abstract siniflardan nesne olusturamayiz.
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date " + d1.toString());
		Calendar cal = Calendar.getInstance();
		cal.setTime(d1);
		
		if (Calendar.SUNDAY == cal.getFirstDayOfWeek()) // #2
			System.out.println("Sunday is the first day of the week");
		System.out.println("trillionth milli day of week is " + cal.get(Calendar.DAY_OF_WEEK)); // #3
		cal.add(Calendar.MONTH, 1); // #4
		Date d2 = cal.getTime(); // #5
		System.out.println("new date " + d2.toString());
		
		Date d3=new Date();
		cal.setTime(d3);
		Date d5=cal.getTime();
		System.out.println(" Date "+d5);
		if(Calendar.MONDAY==cal.getFirstDayOfWeek()) {
			System.out.println("Monday is the first dat of the week");
		}
		System.out.println(Calendar.DAY_OF_WEEK); //7
		// Aylar 0'dan baslar.
		System.out.println(Calendar.DAY_OF_MONTH); //5 
		cal.add(Calendar.MONTH, 2);
		Date d6=cal.getTime();
		System.out.println("New Date "+d6.toString());
		
		//9 ekledik ancak tarih degismedi.
		cal.roll(Calendar.MONTH, 9);
		Date d7=cal.getTime();
		System.out.println(" new dateee "+d7.toString());
		
		
		
		

	}

}
