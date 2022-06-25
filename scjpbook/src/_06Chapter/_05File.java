package _06Chapter;

import java.io.File;

public class _05File {
	public static void main(String[] args) {
		try {
			boolean newFile = false;
			File file = new File // it's only an object
			("fileWrite1.txt");
			System.out.println(file.exists()); // look for a real file
			newFile = file.createNewFile(); // maybe create a file!
			System.out.println(newFile); // already there?
			System.out.println(file.exists()); // look again
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
