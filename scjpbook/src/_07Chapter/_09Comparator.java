package _07Chapter;

import java.util.ArrayList;

public class _09Comparator {
	public static void main(String[] args) {
		ArrayList<DVDInfo> dvdList=new ArrayList<DVDInfo>();
		DVDInfo dvd1=new DVDInfo("Donnie Darko","sci-fi/Gyllenhall", "Jake",2001);
		DVDInfo dvd2=new DVDInfo("Raiders of the Lost","action/Ford", "Harrison",1992);
		DVDInfo dvd3=new DVDInfo("Caddy Shack","comedy/Murray", "Bill",2005);
		DVDInfo dvd4=new DVDInfo("Star Wars","sci-fi/Ford", "Harrison",1999);
		DVDInfo dvd5=new DVDInfo("Lost in Translation","comedy/Murray", "Bill",2010);
		
		dvdList.add(dvd1);
		dvdList.add(dvd2);
		dvdList.add(dvd3);
		dvdList.add(dvd4);
		dvdList.add(dvd5);
	}

}
