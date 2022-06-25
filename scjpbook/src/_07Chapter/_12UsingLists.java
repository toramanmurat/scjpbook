package _07Chapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _12UsingLists {

	public static void main(String[] args) {
		List<Dog> d=new ArrayList<Dog>();
		Dog dog=new Dog("aiko");
		d.add(dog);
		d.add(new Dog("clover"));
		d.add(new Dog("magnolia"));
		
		//using iterator
		Iterator<Dog> i3=d.iterator();
		while (i3.hasNext()) {
			Dog d2=i3.next();
			System.out.println(d2.name);
			
		}
		
		System.out.println("size " + d.size());
		System.out.println("get1 " + d.get(1).name);
		System.out.println("aiko " + d.indexOf(dog));
		
		
		System.out.println("----------------");
		d.remove(2);
		Object[] oa = d.toArray();
		for(Object o : oa) {
		Dog d2 = (Dog)o;
		System.out.println("oa " + d2.name);
		}
	}
}

class Dog{
	public String name;
	Dog(String n) { name = n; }
}