package javainpout;

import java.io.FileOutputStream;

public class Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try{    
	             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
	             String s="Welcome to javaTpoint.";    
	             byte b[]= s.getBytes();   
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);} 
	}

}
