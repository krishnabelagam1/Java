package javainpout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputEx1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\\\test1.txt");
		int i =0;
		while((i=fin.read())!=-1) {
			System.out.print((char)i);
			}
		fin.close();

	}

}
