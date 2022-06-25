package _06Chapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class _10Serializable {
//?????
	public static void main(String[] args) {
		Cat c = new Cat();
		try {
			FileOutputStream fs = new FileOutputStream("testSer.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c); // 3
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("testSer.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (Cat) ois.readObject(); // 4
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class Cat implements Serializable {
}