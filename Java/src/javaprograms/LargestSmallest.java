package javaprograms;

public class LargestSmallest {

	public static void main(String[] args) throws Exception {
	int num[]= {201,31,32,532,532,78,33,7};
	int small = num[0];
	int larg = num[0];
	Thread.sleep(2000);
	for(int i =1;i<=num.length;i++) {
		if(num[i]>larg)
			larg = num[i];
		else if(num[i]<small)
			small = num[i];
	}
	System.out.println("Largest number is:"+larg);
	System.out.println("Smallest number is:"+small);
	}

}
