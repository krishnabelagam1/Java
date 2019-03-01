package javainpout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputEx1 {

	public static void main(String[] args) throws IOException  {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\test1.txt");
			String s = "Bahubali the beginning";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	

}
}
