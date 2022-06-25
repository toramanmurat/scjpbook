package _02Chapter._02.constructor;

public class ConstructorChaning {
	public static void main(String[] args) {
		Midilli midilli=new Midilli();
		
//		ilk olarak Middilli sinifinda ki yer alan constructor calisir.
//		Midilli class'inda super() ifadesi Horse  sinifindaki constructora gider.
//		Horse class'inda ki super() ifadesi Animal sinifindaki constructora gider.
//		Animal class'inda ki super() java.lang.object gider
//		CTRL+Sol Click nereye gittigini görebiliriz
		
		
	}

}

class Animal{
	int x;
	String y; 
	Animal(){
//		ilk super() ifadesi acik bir sekilde yazilirsa ilk ifade olmalidir.
		super();
		System.out.println("Animal Constructor");
	}
	
	
	
}

class Horse extends Animal{
	
	Horse(){
		
		super();
		System.out.println("Dog Constructor");
	}
}

class Midilli extends Horse{
	
	Midilli(){
		super();
		System.out.println("Midilli Constructor");
	}
	
}