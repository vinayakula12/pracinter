package helloWorld;

import java.util.Arrays;

public class Grtint {
	public static void summax(int[] A,int f) {
		int l=A.length;
		int count=0;
		 Arrays.sort(A); 
		for(int i=0;i<l;i++) {
			if(A[i]>f) {
				count++;
			}
		}
		if (count==f) {
			System.out.println("the condition met and the number is "+f);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
