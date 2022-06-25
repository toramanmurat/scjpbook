package _06Chapter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class _15NumberFormat {
// java.text.NumberFormat
	public static void main(String[] args) {
		float f1 = 123.4567f;
		Locale locFR = new Locale("fr"); // France
		NumberFormat[] nfa = new NumberFormat[4];

		nfa[0] = NumberFormat.getInstance();
		nfa[1] = NumberFormat.getInstance(locFR);
		nfa[2] = NumberFormat.getCurrencyInstance();
		nfa[3] = NumberFormat.getCurrencyInstance(locFR);

		for (NumberFormat nf : nfa)
			System.out.println(nf.format(f1));

		System.out.println("-------------------------------");

		NumberFormat nf = NumberFormat.getInstance();
		System.out.print(nf.getMaximumFractionDigits() + " "); // virgulden sonra 3 hane destekler.
		System.out.println(nf.format(f1) + " ");

		nf.setMaximumFractionDigits(5);// virgulden sonra 5 hane
		System.out.println(nf.format(f1) + " ");

		try {
			System.out.println(nf.parse("1234.567"));
			nf.setParseIntegerOnly(true);
			System.out.println(nf.parse("1234.567"));
		} catch (ParseException pe) {
			System.out.println("parse exc");
		}
		
		Locale locTR = new Locale("tr", "TR");
		NumberFormat nf2=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat nf3=NumberFormat.getCurrencyInstance(locTR);
		NumberFormat nf4=NumberFormat.getCurrencyInstance(Locale.GERMAN);
		
		String formatString=nf2.format(f1);
		String formatString2=nf3.format(f1);
		String formatString3=nf4.format(f1);
		System.out.println(formatString);
		System.out.println(formatString2);
		System.out.println(formatString3);
		
		
		
		
		
	}
}
