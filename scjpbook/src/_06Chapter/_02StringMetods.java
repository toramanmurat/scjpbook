package _06Chapter;

public class _02StringMetods {
//	charAt() Returns the character located at the specified index
//	concat() Appends one String to the end of another ( "+" also works)
//	equalsIgnoreCase() Determines the equality of two Strings, ignoring case,Boolean value
//	length() Returns the number of characters in a String
//	replace() Replaces occurrences of a character with a new character
//	substring() Returns a part of a String
//	toLowerCase() Returns a String with uppercase characters converted
//	toString() Returns the value of a String
//	toUpperCase() Returns a String with lowercase characters converted
//	trim() Removes whitespace from the ends of a String
	
	public static void main(String[] args) {
		String x = "airplane";
		System.out.println(x.charAt(2)); //r
		System.out.println(x.concat(" taxi"));//airplane taxi
		System.out.println(x.equalsIgnoreCase("airplane")); //true
		System.out.println(x.equalsIgnoreCase("AIRPLANE"));//true
		System.out.println(x.equalsIgnoreCase("airplanex")); //false
		System.out.println(x.equalsIgnoreCase("AIRPLANEX"));//false
		System.out.println(x.length());//8
		System.out.println(x.replace('r', 'X')); //aiXplane
		System.out.println(x.substring(2,5));//rpl [2,5) ilk index dahil son index dahil degil
		System.out.println(x.toLowerCase()); //airplane
		System.out.println(x.toString());
		System.out.println(x.toUpperCase()); //AÝRPLANE
		String z="  hi  friends !!!     "; 
		System.out.println(z.trim());//bastaki ve sondaki bosluklari kaldirir.
		
		
		
		
		String y="library";
		System.out.println(y+" card");//library card
		y+=" ocean";
		System.out.println(y);//library ocean
		
		
		
	}
	
}
