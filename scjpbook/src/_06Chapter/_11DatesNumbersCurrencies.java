package _06Chapter;

import java.util.Date;

public class _11DatesNumbersCurrencies {
//	Java.util.Date;
//	Cogu metodu deprecated oldu.Ancak Calender ve DateFormat class'larini kullanirken gerekebilir.

//	java.util.Calendar;
//	tarihleri ​​ve saatleri dönüştürmenize ve değiştirmenize yardımcı olur
	
//	java.text.DateFormat;
//	Format icin kullanilir."01/01/70" or "January 1, 1970,"
	
//	java.text.NumberFormat;
//	sayıları bicimlendirmek için kullanılır 
	
//	java.util.Locale
	public static void main(String[] args) {
		Date d1=new Date(1000000000000L);
		System.out.println("1st date "+ d1.toString());
		d1.setTime(d1.getTime()+3600000);
		System.out.println("new time "+ d1.toString());
		Date now=new Date();
		
		System.out.println(now);
		
	}
	
	
}
