package practise;

import java.util.Scanner;

public class Prime1to100 {

	public static void main(String[] args) {

       
        int i, k, j;
		for (i = 2; i <= 150; i++) {
			k = 0;
       
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    k=1;
                    break;
                }
                
            }
            if(k==0)
            {
            	
                System.out.println(i);
                
            }
            
        
    }
	}}
