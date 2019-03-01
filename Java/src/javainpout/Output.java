package javainpout;

import java.io.FileOutputStream;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{    
	             FileOutputStream fout=new FileOutputStream("D:\\test.txt");    
	             String s="My name is sai krishna.My native place is parvathipuram, vizianagaram district";    
	             byte b[]= s.getBytes();   
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);} 
	}

}
