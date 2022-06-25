package _06Chapter;

import java.util.StringTokenizer;

public class _18Tokenizing {
	// buyuk parcalari kucuk parcalara ayirma

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("my name is Murat ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		StringTokenizer st2 = new StringTokenizer("my,name,is,Murat");
		// printing next token
		System.out.println("Next token is : " + st2.nextToken(","));

		StringTokenizer st3 = new StringTokenizer("Hello everyone I am a Java developer", " ");
		while (st3.hasMoreElements()) {
			System.out.println(st3.nextToken());
		}

		/* StringTokenizer object */
		StringTokenizer st4 = new StringTokenizer("Hello Everyone Have a nice day", " ");
		/* Prints the number of tokens present in the String */
		System.out.println("Total number of Tokens: " + st4.countTokens());
	}
}
