package _07Chapter;
import java.util.ArrayList;
import java.util.List;

public class _16WildCards {
//		List<? extends RedCat>
//		eleman eklenmesine izin vermez.
	
//		List<? super RedCat>
//		eleman eklenmesine izin verir.
	public static void deleteCat(List<? extends CatWild> catList, CatWild catWild) {
		catList.remove(catWild);
		System.out.println("Cat Removed");
	}

	public static void addCat(List<? super RedCat> catList) {
		catList.add(new RedCat("Red Cat"));
		System.out.println("Cat Added");
	}

//	List<?> list 
//	eleman eklenmesine izin vermez.
	
	public static void printAll(List<?> list) {
		for (Object item : list)
			System.out.println(item + " ");
	}

	public static void main(String[] args) {
		List<AnimalWild> animalList = new ArrayList<AnimalWild>();
		List<RedCat> redCatList = new ArrayList<RedCat>();

		// add list of super class Animal of Cat class
		addCat(animalList);

		// add list of Cat class
		addCat(redCatList);
		addCat(redCatList);

		// print all animals
		printAll(animalList);
		printAll(redCatList);

		CatWild cat = redCatList.get(0);
		// delete cat
		deleteCat(redCatList, cat);
		printAll(redCatList);
	}
}

class AnimalWild {
	String name;

	public AnimalWild(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}

class CatWild extends AnimalWild {
	CatWild(String name) {
		super(name);
	}
}

class RedCat extends CatWild {
	RedCat(String name) {
		super(name);
	}
}

class DogWild extends AnimalWild {
	DogWild(String name) {
		super(name);
	}
}