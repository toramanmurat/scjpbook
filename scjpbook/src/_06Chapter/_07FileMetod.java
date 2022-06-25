package _06Chapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class _07FileMetod {
	public static void main(String[] args) throws IOException {
		File myDir=new File("mydir"); //myDir directory
		myDir.mkdir();
		
		File myFile=new File(myDir,"myFile.txt"); //myDir icine myFile.txt
		myFile.createNewFile();
		
		PrintWriter pw = new PrintWriter(myFile);
		pw.println("new stuff"); //myfile.txt icine new stuff yazar
		pw.flush();
		pw.close();
		
		System.out.println(myDir.isDirectory());//true
		System.out.println(myDir.isFile()); //false
		
		System.out.println(myFile.isDirectory()); //false
		System.out.println(myFile.isFile());//true
		
		FileReader fr=new FileReader(myFile);
		BufferedReader bf=new BufferedReader(fr);
		
		String s;
		while((s = bf.readLine()) != null) {
			System.out.println(s);
			
		}
		
		bf.close();
		
		
		String[] files = new String[100];
		File search = new File(".");
		files = search.list();
		
		for(String fn:files) {
			System.out.println("Found "+fn);
		}
	}

}
