package _07Chapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _08Comparable {
	
//	java.lang.Comparable
//	java.util.Comparator
	
//	String ve Wrapper sýnýflar Comparable interface'ini implement etmiþlerdir.
	
	public static void main(String[] args) {
		
		ArrayList<DVDInfo> dvdList=new ArrayList<DVDInfo>();
		DVDInfo dvd1=new DVDInfo("Donnie Darko","Genre=sci-fi/Gyllenhall", "Jake",2001);
		DVDInfo dvd2=new DVDInfo("Raiders of the Lost","Genre=action/Ford", "Harrison",1992);
		DVDInfo dvd3=new DVDInfo("Caddy Shack","Genre=comedy/Murray", "Bill",2005);
		DVDInfo dvd4=new DVDInfo("Star Wars","Genre=sci-fi/Ford", "Harrison",1999);
		DVDInfo dvd5=new DVDInfo("Lost in Translation","Genre=comedy/Murray", "Bill",2010);
		
		dvdList.add(dvd1);
		dvdList.add(dvd2);
		dvdList.add(dvd3);
		dvdList.add(dvd4);
		dvdList.add(dvd5);
		
		System.out.println(dvdList);
//		Collections.sort(dvdList); Comparable metodunu kullanmazsak neye gore siralama yapacak ? Derleme hatasi verir!
		System.out.println("-------------------------------");
		Collections.sort(dvdList);
		System.out.println(dvdList);
		
		System.out.println("-------------------------------");
		GenreSort genreSort=new GenreSort();
		Collections.sort(dvdList,genreSort);
		System.out.println(dvdList);
		
	}
	
	
	

}


//Comparable interface implement et!
//compareTo metodunu @override et!
// metodta neye gore siralama yapacagini belirt!
class DVDInfo implements Comparable<DVDInfo>{
	String title;
	String genre;
	String leadActor;
	int year;
	
	public DVDInfo(String title, String genre, String leadActor,int year) {
		super();
		this.title = title;
		this.genre = genre;
		this.leadActor = leadActor;
		this.year=year;
	}

	@Override
	public String toString() {
		return year+" "+title + " " + genre + " " + leadActor + "\n";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(DVDInfo o) {
		
//		return title.compareTo(o.getTitle()); --> kucukten buyuge
//		return o.getTitle().compareTo(title);  buyukten kucuge 
		
//		return Integer.compare(year, o.getYear()); kucukten buyuge
		return Integer.compare(o.getYear(), year); //buyukten kucuge
	}
	
	
	
	
}

class GenreSort implements Comparator<DVDInfo>{
	public int compare(DVDInfo one, DVDInfo two) {
		return one.getGenre().compareTo(two.getGenre());
		}
	
}
