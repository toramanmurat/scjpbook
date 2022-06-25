package _07Chapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _07ListMetod {

	public static void main(String[] args) {
		List myList=new ArrayList();
		myList.add("RowTest");
		myList.add(20);
		myList.add(10.5);
//		Bir row formattaki List'e herhangi bir tipte eleman ekleyebiliriz.
//		Burada oldugu gibi bir E degeri verilmezse buna row type adý verilir. Bu durumda E object tipinde olur.
		System.out.println(myList);
		
		List<String> test = new ArrayList<String>();
		String s="hi";
		test.add("string");
		test.add(s);
		test.add(s+s);
//		test.add(10); derleme hatasi verecektir. String tipinde degerler ekleyebiliriz.
		
		System.out.println(test.size());
		System.out.println(test.contains(42)); // contains icerisinde ki eleman var mi ? False
		System.out.println(test.contains("murat")); // false
		System.out.println(test.contains("hi"));//True
		System.out.println(test.isEmpty()); // bos mu?
		System.out.println(test.get(2)); // 2. indexte ki eleman
		System.out.println(test.indexOf(s)); // s index'ini getirir
		
		List number=new ArrayList();
		number.addAll(myList); // bir collectiona bir collection'a ekleyebiliriz.
		number.add(0, 20);//0 index'e 200 ekler.
		
		number.removeAll(myList); // mylisti number list'ten remove eder.
		
		ArrayList<String> stuff = new ArrayList<String>(); // 
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		Collections.sort(stuff); // siralama islemi
		System.out.println("sorted " + stuff);
		
		
		
		
		
	}
}
