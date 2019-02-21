package javainpout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin= new FileInputStream("D:\\testout.txt");
			 int i=0;    
	            while((i=fin.read())!=-1){ 
			System.out.print((char)i);
	            }
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
