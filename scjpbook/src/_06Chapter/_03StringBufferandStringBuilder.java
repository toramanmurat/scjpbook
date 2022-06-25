package _06Chapter;

public class _03StringBufferandStringBuilder {

	// java.lang.StringBuffer
	// java.lang.StringBuilder
	
	//StringBuffer'in metodlari synchronized ozellige sahiptir.(tread-safe ozellige sahiptir.)
	//StringBuilder metodlari ise synchronized degildir.Bu yuzden daha hizli calisir.
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		sb.append("def");
		System.out.println("sb= "+sb);
		
		sb.reverse().insert(3,"---"); //tersi
		System.out.println(sb);
		
//		different arguments alabilir
		StringBuffer sb2=new StringBuffer("set");
		sb2.append("point"); //String 
		System.out.println(sb2);
		StringBuffer sb3=new StringBuffer("pi="); //float
		sb3.append(3.14159f);
		System.out.println(sb3);
		
		StringBuffer sb4=new StringBuffer("0123456789");
		System.out.println(sb4.delete(3, 7)); //[3,7)
		
		StringBuilder sb5 = new StringBuilder("01234567");
		sb5.insert(4, "---");
		System.out.println( sb5 ); //0123---4567
		
		StringBuffer sb6 = new StringBuffer("A man a plan a canal Panama");
		sb6.reverse();
		System.out.println(sb6); //amanaP lanac a nalp a nam A
		
		StringBuffer sb7 = new StringBuffer("A man a plan a canal Panama");
		StringBuffer sb8 = new StringBuffer("A man a plan a canal Panama");
		
		
		// StringBuilder equals ile karsilastirirsak false aliriz !!! Cunku bu siniflarda equals override edilmemistir !!!!
		System.out.println(sb7==sb8);//false
		
		//StringBuilder kontrol ederken basta String'e cevirip sonra equals yapmamiz gerekli!
		System.out.println(sb7.toString().equals(sb8.toString())); //true
		
		
		
	}
}
