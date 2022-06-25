package _06Chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _17Quantifier {
// Kac defa geciyor bilgisi icin kullanilir.
//	
//	* -> 0 veya daha fazla
//	+ -> 1 veya daha fazla
//	? -> 0 veya 1 tane
//	{x,} -> x tane yada daha fazla
//	{X,Y} -> min X, max Y kadr

	public static void main(String[] args) {
		String regex = "\\b(\\d{3})\\d{7}\\b";

		// Compile the regular expression
		Pattern p = Pattern.compile(regex);

		String source = "12345678, 12345, and 9876543210";

		// Get the Matcher object
		Matcher m = p.matcher(source);

		// Start matching and display the found area codes
		while (m.find()) {
			String phone = m.group();
			String areaCode = m.group(1);
			System.out.println("Phone: " + phone + ", Area  Code:  " + areaCode);
		}

	}
}
