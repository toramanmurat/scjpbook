package _06Chapter;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class _13DataFormat {
//	java.text.DateFormat
//	abstract sinif
//	iki metodu var;
//	1-getInstance()
//	2-getDateInstance()
	public static void main(String[] args) {
		Date d1 = new Date(1000000000000L);
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getInstance(); //9.09.2001 04:46
		dfa[1] = DateFormat.getDateInstance();//9 Eyl 2001
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);//9.09.2001
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);//9 Eyl 2001
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);//9 Eylül 2001
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);//9 Eylül 2001 Pazar
		for(DateFormat df : dfa)
		System.out.println(df.format(d1));
		
		
		System.out.println("--------------------------------------");
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
		String s=df.format(d1);
		System.out.println(s);
		
		try {
			//parse String-> Date donusumunu saglar.
			Date d2=df.parse(s);
			System.out.println("parsed= "+d2.toString());
		} catch (ParseException e) {
			System.out.println("parse exc");
		}
		
	}

}
