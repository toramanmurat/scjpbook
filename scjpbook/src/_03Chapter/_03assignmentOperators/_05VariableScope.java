package _03Chapter._03assignmentOperators;

public class _05VariableScope {
//	Static veriables en buyuk yasam alanina sahiptir. Class yuklendiginde/loaded yasamaya baslar. JVM ayakta kaldigi surece yasar
//	instance veriable obje olustugunda olusur.Objeye aittir.Heap'te yasar
//	Local veriable metodta tanimlanan degiskenlerdir.
//  block veriable, yalnýzca kod bloðu yürütüldüðü sürece yaþar.

//	Scope gore siralama 
//	static>instance>local

//  Static degiskenler class load edildiginde hazirdir.proje durana kadar JVM calistigi surece vardir.

//	instance degiskenler obje varsa vardýr.Obje temizlendiginde(Garbage Collection) bu degisken de ucar.
	
//	local degiskenler metod calisinca vardir.metot tamamlaninca ucar.(Stach'te yasar)
	
//	*** static bir metodtan instance degiskenlere erisim saglanamaz!!!! Obje olusturulmali.

	int j = 5;

	public static void main(String[] args) {
//		j++; j instance veriable. Error!!
	}
}

class Layout {
	static int s = 343; // static variable
	int x; // instance variable
	{
		x = 7;
		int x2 = 5;
	} // initialization block

	Layout() {
		x += 8;
		int x3 = 6;
	} // constructor

	void doStuff() { // method
		int y = 0; // local variable
		for (int z = 0; z < 4; z++) { // 'for' code block
			y += z + x;
		}
	}
}
