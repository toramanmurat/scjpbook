package _06Chapter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _06Writer {
	
	//File Metod;
	// createNewFile(),delete(),exists(),isDirectory(),isFile(),list(),mkdir(),renameTo()
	
	//FileWriter Metod
	//close(),flush(),write()
	
	//BufferedWriter Metod
	//close(),flush(),write(),newLine()
	
	//PrintWriter Metod
	//close(),flush(),write(),format()*, printf()* ,print(), println()
	
	//FileReader Metod
	//read();
	
	//BufferedReader Metod
	//read(),readLine()

	public static void main(String[] args) {
		char[] in = new char[50]; // to store input
		int size = 0;
		try {
			File file = new File("fileWrite2.txt");// just an object

			FileWriter fw = new FileWriter(file); // create an actual file
			// & a FileWriter obj
			fw.write("howdy\nfolks\n"); // write characters to
			// the file
			fw.flush(); // flush before closing
			fw.close(); // close file when done
			FileReader fr = new FileReader(file); // create a FileReader
			// object
			size = fr.read(in); // read the whole file!
			System.out.print(size + " "); // how many bytes read
			for (char c : in) // print the array
				System.out.print(c);
			fr.close(); // again, always close
		} catch (IOException e) {
		}
	}
}
