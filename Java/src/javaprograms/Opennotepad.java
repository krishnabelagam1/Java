package javaprograms;

import java.io.IOException;

public class Opennotepad {

	public static void main(String[] args) throws Exception {
	 Runtime rs = Runtime.getRuntime();
		 rs.exec("notepad"); 
	 rs.freeMemory();
	 rs.gc();

	}

}
