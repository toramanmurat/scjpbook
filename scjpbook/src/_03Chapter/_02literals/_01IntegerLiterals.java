package _03Chapter._02literals;

public class _01IntegerLiterals {
	public static void main(String[] args) {
		Hexadecimal hd=new Hexadecimal();
		System.out.println("z="+hd.z+" "+"a="+hd.a+" "+"b="+hd.b);
	}

}

// Javada Integer Literallerin 4 farklý gosterimi vardir,
// Decimal,Octal,Hexadecimal,binary

class DecimalLiterals {
//Kullandigimiz 10 luk taban
//[0-9] araliginda 	
	int lenght=343;
	int number=1000;
	int age=29;
}

class OctalLiterals{
//[0-7] araliginda deger alir
//0 ile baslayan bir sayi varsa bu octal literaldir.
	int six=06;
	int seven=07;
	int eight=010;
	int nine=011;
}

class Hexadecimal{
//	[0-F] araliginda deger alir.
//	10-A, 11-B,..15_F
//	0x veya 0X ile basliyorsa hexadecimal literaldir.
	int number=0xA;
	int x=0X00001;
	int y=0x7fffff;
	int z=0xDeadCafe; // -559035650
	int a=0XCAFE;
	int b=0xcafe;
//   OXCAFE 0xcafe legaldir ve ayni degere sahiptir.

}

class Binary{
//[0-1] araliginda deger alir
//0B ile basliyorsa binary literaldir
	int number=0b01101;
	
}