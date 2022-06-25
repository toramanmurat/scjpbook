package _07Chapter;

import java.util.*;

public class _10SearchingArraysAndCollections {

	public static void main(String[] args) {
		String[] sa = { "one", "two", "three", "four" };
		Arrays.sort(sa);

		for (String s : sa) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("one= " + Arrays.binarySearch(sa, "one")); // index

		System.out.println("now reverse sort");
		ReSortComparator rs = new ReSortComparator();

		Arrays.sort(sa, rs);
		for (String s : sa) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("one = " + Arrays.binarySearch(sa, "one")); //Comparator (rs) kullanmadýgýmýz icin yanlis sonuc elde ettik
		System.out.println("one = " + Arrays.binarySearch(sa, "one", rs));

	}

	static class ReSortComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}

	}

}
