package _07Chapter;

import java.util.Arrays;
import java.util.List;

public class _11ConvertingArraysToList {

	public static void main(String[] args) {
		String[] sa = {"one", "two", "three", "four"};
		List sList = Arrays.asList(sa); //array list'e 
		System.out.println("size " + sList.size());
		System.out.println("idx2 " + sList.get(2));
//		sList.add("seven"); Arrays.asList ile bir arrayden List olusturdugumuzda eleman eklememize izin vermez
//		java.lang.UnsupportedOperationException hatasi aliriz
		
		
		//Listedeki elemanlari guncelledigimizde Array'de de guncellenir.
		sList.set(3,"six"); // change List
		sa[1] = "five";
		for(String s : sa)
			System.out.print(s + " ");
		System.out.println("\nsl[1] " + sList.get(1));
		
		//Collection elemanlari primitive olmaz, Hepsi obje tipindedir.
	}
}
