package _06Chapter;

import java.io.File;

public class _04FileNavigation {
	
	// File ; bir dosyayi yada bir dizin/directory/folder gosterebilir. Bu sinif dosyadan veri okumak/yazmak icin kullanilmaz!.
	// File sinifi yeni bir bos dosya olusturmak klasor olusturmak dosya silmek isim degistirmek gibi islemler icin kullanilabilir.
	
	
	//FileReader; Bu s�n�f karakter dosyalar�n� okumak i�in kullan�l�r
	//BufferedReader; Dosyadan veri okumak icin kullanilir.
	
	//FileWriter;Bu s�n�f karakter dosyalar�na yazmak i�in kullan�l�r.
	//BufferedWriter;Dosyaya veri yazma.
	//PrintWriter
	//Console
	
	public static void main(String[] args) {
		//File Objesi olusur. Harddisk'te yeni bir dosya olusmaz.
		File file=new File("fileWrite1.txt");
	}
}
