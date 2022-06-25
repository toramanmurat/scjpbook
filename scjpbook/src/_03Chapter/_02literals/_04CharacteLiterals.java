package _03Chapter._02literals;

public class _04CharacteLiterals {
//16 bit unsigned veri tipidir
//tek '' tirnak kullanilir.
//[0-65535] arasi deger alir
	public static void main(String[] args) {
		char a = 'a';
		char b = '@';
		char c = (char)70000;
//		char e = -29; legal degil
//		char f = 70000 legal degil
		
		System.out.println(a+" "+b+" "+c+" ");
	}
}
