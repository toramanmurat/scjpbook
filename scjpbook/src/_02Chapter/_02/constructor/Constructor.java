package _02Chapter._02.constructor;

public class Constructor {

	//Javada butun siniflarda constructor olmak zorundadir!
	//bu kurala abstract classlar da dahildir! yani abstract classlar icin de constructor olmalidir!
	//interfaceler icin bu durum soz konusu degildir!
	
	// eger bir sinif/class icin biz constructor tanimlamazsak , java bizim icin bir tane constructor tanimlar!
	// arka planda default cosntructor tanimlanir.
	// bu constructor da no-arg / parametre almayan constructordir.
	
//	Foo f=new Foo(); default constructor tanimli olmadigi icin hata verir
	
//	legal
	Foo f=new Foo(50,"Foo");
}


class Foo{
	int size;
	String name;
//  ALT+SHÝFT+S --> generate Constructor
	public Foo(int size, String name) {
		super();
		this.size = size;
		this.name = name;
	}
	
}