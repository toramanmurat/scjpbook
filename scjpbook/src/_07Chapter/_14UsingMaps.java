package _07Chapter;

import java.util.HashMap;
import java.util.Map;

public class _14UsingMaps {

	public static void main(String[] args) {
		//hava.util.HashMap
		//unordered bir yapiya sahiptir.Elemanlar eklenildigi sirada tutulmaz.
		
		Map<Object, Object> m=new HashMap<Object, Object>();
		m.put("k1", new Dog2("aiko")); // add some key/value pairs
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");
		Dog2 d1 = new Dog2("clover");
		m.put(d1, "Dog key");
		m.put(new Cat(), "Cat key");
		System.out.println(m.get("k1")); // #1
		String k2 = "k2";
		System.out.println(m.get(k2)); // #2
		Pets p = Pets.CAT;
		System.out.println(m.get(p)); // #3
		System.out.println(m.get(d1)); // #4
		System.out.println(m.get(new Cat())); // #5
		System.out.println(m.size());
	}
}

class Dog2{
	public Dog2(String n) { name = n; }
	public String name;
	public boolean equals(Object o) {
	if((o instanceof Dog2) &&
	(((Dog2)o).name == name)) {
	return true;
	} else {
	return false;
	}
	}
	public int hashCode() {return name.length(); }
}
class Cat { }
enum Pets {DOG, CAT, HORSE }