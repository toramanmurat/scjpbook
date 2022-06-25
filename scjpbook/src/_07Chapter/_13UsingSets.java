package _07Chapter;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _13UsingSets {
	public static void main(String[] args) {
		// duplicate elemana izin vermez!
		// java.util.HashSet
		// java.util.LinkedHashSet
		// java.util.TreeSet

		// HashSet unordered bir yapiya sahiptir. Elemanlar eklenildigi sirada tutulmaz.
		// LinkedHashSet ordered bir yapiya sahiptir. Elemanlar eklenildigi sirada
		// tutulur.
		// TreeSet elemanlar sorhed sekilde tutulur.

		boolean[] ba = new boolean[5];
		Set sHashSet = new HashSet();
		ba[0] = sHashSet.add("a");
		ba[1] = sHashSet.add(new Integer(42));
		ba[2] = sHashSet.add("b");
		ba[3] = sHashSet.add("a"); // duplicate
		ba[4] = sHashSet.add(new Object());

		for (int x = 0; x < ba.length; x++)
			System.out.print(ba[x] + " ");
		System.out.println("\n");
		for (Object o : sHashSet)
			System.out.print(o + " ");
		
//		Set sTreeSet=new TreeSet();
//		ba[0] = sTreeSet.add("a");
//		ba[1] = sTreeSet.add(new Integer(42));
//		ba[2] = sTreeSet.add("b");
//		ba[3] = sTreeSet.add("a"); // duplicate
//		ba[4] = sTreeSet.add(new Object());
//		
//		for (int x = 0; x < ba.length; x++)
//			System.out.print(ba[x] + " ");
//		System.out.println("\n");
//		for (Object o : sTreeSet)
//			System.out.print(o + " ");
//		Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.
//		Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
		
//		siralama yapmilamaz.
	}

}
