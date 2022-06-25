package _01Chapter._06.variable;

public class Person {

	private int age; // instance variable
	// access modifier olarak private , protected , public olabilir!

	// degiskenimiz abstract OLAMAZ!

	private static int number; // instance variable degildir! // static degisken!
	
	void method() {

		String name="user"; //local variable
		//local degiskenler access modifier ALAMAZ!
		//private, protected , public vs olamaz!
		
		final String finalName="admin";
		// finalName="compile error"; // final degiskenin degeri 1 kez assign edilir.
		
		// local degiskenler stackte yasar
		// instance degiskenler ise heap te yasarlar.
		
		
		String str; // varsayilan degeri null degil! unitialized dir.
		int number = 0;
		//local degiskenelre otomatik olarak deger ATANMAZ
		// "number"in degeri 0 degildir. uninitialized durumdadir.
		
		System.out.println(number);
		//System.out.println(str);
	}

}
