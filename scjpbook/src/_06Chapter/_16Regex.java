package _06Chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _16Regex {
//	\d digit
//	\s whitespace
//	\w harf,rakam _ (underscore)
//	\. her hangi bir karakter gelsin a.c
//	\D non-digit
//	\S non-whitespace
//	\W non-word

	public static void main(String[] args) {
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abaaaaaba");
		
		while(m.find()) {
			System.out.println(m.start()+" "); //0,6
		}
	}
}
