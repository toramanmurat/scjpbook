package _07Chapter;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

public class _15Generics {
//	Derleme/Compile time da guclu bir type check/tip controlu saglar.
//	Generic yapi kullandigimizda cast islemine gerek kalmaz.
//	genel bir implementasyon saglar.

	public static void main(String[] args) {
//		List<Parent> myParentList=new ArrayList<Child>();
//		Legal degildir. Sol taraf ne ise sag tarafta ayni olmalidir.
// 		Burada Child IS-A Parent olsada durum degismez.
		
//		List<Object> myList=new ArrayList<JButton>(); //No
//		List<Number> numbers=new ArrayList<Integer>(); //No
		
		List<JButton> myList = new ArrayList<JButton>(); // yes
		List<Object> myList1 = new ArrayList<Object>(); // yes
		List<Integer> myList2 = new ArrayList<Integer>(); // yes
	}
}

class Parent{}

class Child extends Parent{}
