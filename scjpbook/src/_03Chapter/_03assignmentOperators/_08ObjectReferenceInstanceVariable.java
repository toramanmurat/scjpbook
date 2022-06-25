package _03Chapter._03assignmentOperators;

public class _08ObjectReferenceInstanceVariable {
	
	private String title; //instance reference variable
	public String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
		_08ObjectReferenceInstanceVariable b=new _08ObjectReferenceInstanceVariable();
		System.out.println("The title is "+ b.getTitle()); //The title is null
		
//		String s=b.getTitle(); 
//		String t=s.toLowerCase();
//		System.out.println(t); // runtime da hata verir. java.lang.NullPointerException.
//		java.lang.NullPointerException. null degerine sahip reference type cagirmaya calisirsak bu hatayi aliriz.
	}

}
