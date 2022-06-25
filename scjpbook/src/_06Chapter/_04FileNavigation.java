package _06Chapter;

import java.io.File;

public class _04FileNavigation {
	
	// File ; bir dosyayi yada bir dizin/directory/folder gosterebilir. Bu sinif dosyadan veri okumak/yazmak icin kullanilmaz!.
	// File sinifi yeni bir bos dosya olusturmak klasor olusturmak dosya silmek isim degistirmek gibi islemler icin kullanilabilir.
	
	
	//FileReader; Bu sýnýf karakter dosyalarýný okumak için kullanýlýr
	//BufferedReader; Dosyadan veri okumak icin kullanilir.
	
	//FileWriter;Bu sýnýf karakter dosyalarýna yazmak için kullanýlýr.
	//BufferedWriter;Dosyaya veri yazma.
	//PrintWriter
	//Console
	
	public static void main(String[] args) {
		//File Objesi olusur. Harddisk'te yeni bir dosya olusmaz.
		File file=new File("fileWrite1.txt");
	}
}
