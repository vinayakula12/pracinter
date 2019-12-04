package helloWorld;

import java.util.Arrays;

public class Triplet2 {
	public static int trip(int[] A) {
		Arrays.sort(A); 
		
	int l=A.length;

	for(int k=l-1;k>0;k--) {
		int sumk=A[k];
	for(int i=0;i<l-1;i++) {
		int sumi=A[i];
		
		for(int j=i+1;j<l;j++)
		{
			if(sumi+A[j]==sumk) {
				System.out.println("the numbers are "+sumk+" hj "+sumi+" jj "+A[j]);
				return 1;
			}
			if(sumi+A[j]>sumk) {
				break;
			}
		}
	}
	}
	return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 32, 1, 7, 10, 50, 19, 21, 2};
		trip(arr);
	}

}
