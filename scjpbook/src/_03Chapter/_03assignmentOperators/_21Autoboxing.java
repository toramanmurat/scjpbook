package _03Chapter._03assignmentOperators;

public class _21Autoboxing {

//	AutoBoxing / Boxing
//	primitive--> referece type/Wrapper
	
//	AutoUnBoxing / unboxing
//	Wrapper--> primitive
	
	public static void main(String[] args) {
		Integer number=1000;
		Integer number2=1000;
		
		if(number != number2) {
			System.out.println("Different objects");
		}
		if(number.equals(number2)) {
			System.out.println("Meaningfully equal");
		}
		
//		== kontrolu reference type degiskenler icin bu 2 degisken ayni objeyimi gosteriyor sorgusunu yapar 
		
	}
}
