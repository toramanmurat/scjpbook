package _06Chapter;

import java.io.FileOutputStream;

public class _08FileOutPutStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("testout.txt");
			fout.write(65); //A
			fout.write(76); //L
			fout.write(110); //n ASCII degerlerine gore
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
