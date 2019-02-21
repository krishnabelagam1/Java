package javainpout;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcelOut {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("D:\\firstexcel.xlsx");
		String St= "manual elements";
		byte b[]= St.getBytes();
		fout.write(b);
		fout.close();
		System.out.println("success");

	}

}
