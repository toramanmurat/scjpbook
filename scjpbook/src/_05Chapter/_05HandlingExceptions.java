package _05Chapter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class _05HandlingExceptions {
	// Exceptions : checked and unchecked.
	// try,catch,finally,throw,throws
	// firlatilan hata catch blogunda yoksa o  hatayi yakalayamayiz.
	// firlatilan hatanýn ya kendisi yada super class'ý olmalidir.
	
	//finally; kodumuzda exception olsun yada olmasýn çalýþmasýný istedigimiz bir kod blogunu finally blogu icerisine aliriz.
	//close resource,clean up
	//database connection,network islemleri, dosya okuma/yazma bu islemlerde kaynaklarýn temizlenmesi kapatilmasi gerekir.
	// aksi durumda memory leak'ler memory sismeleri ortaya cikabilir.(OutOfMemoryError)
	//
    // throws anlami -> ben X hatasini firlatabilirim anlamina gelir.
	//throws new NullPointerException; throw edilen exception bir checked exception bu nedenle throws ifadesi gereklidir.
	
	// catch ifadesinde yer alan exceptionlar hiyerarsisi onemlidir.
	// birden fazla catch blogu varsa aralarinda hiyerarsik bir baglanti oldugundan bu durumda ait sinif/subclass once yer almalidir.
	//aralarinda bir hiyerarsi yoksa yerleri nerede oldugu onemli degildir.
		
	

	public static void main(String[] args) {
		
		
		try {
			RandomAccessFile raf = new RandomAccessFile("myfile.txt", "r");
			byte b[] = new byte[1000];
			raf.readFully(b, 0, 1000);
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("IO Error");
			System.err.println(e.toString());
			e.printStackTrace();
		}

	}
}
