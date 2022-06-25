package _01Chapter._03.declareclasses.exam.stuff;

import _01Chapter._03.declareclasses.cert.Beverage;
// farkli paketler oldugu icin import etmemiz lazim.


public class Tea extends Beverage2 {
	//subClass ve  superClass(Beverage) ile ayri pakettler.
	//superClass Default oldugundan dolayi erisim saglanamadi. Public olmasi gerektir.
	public static void main(String[] args) {
		// Beverage2 ayni pakette oldugundan defult metod olsada erisim saglanacaktir.
		Beverage2 beverage2=new Beverage2();
		System.out.println(beverage2.a);
	}
}
