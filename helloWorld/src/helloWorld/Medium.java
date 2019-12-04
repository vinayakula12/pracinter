package helloWorld;

import java.util.Arrays;

public class Medium {
	//int k=0;
	//static int sumi;
	//static int suml;
	
	public static int med(int[] A) {
		
		int l=A.length;
		
		for(int i=0;i<l;i++) {
				int sumi=0;
				for(int k=0;k<i;k++) {
					 sumi = sumi+A[k];
					 System.out.println(A[i]);
				}
				int suml=0;
				for(int j=i+1;j<l;j++) {
					 suml = suml+A[j];
					 System.out.println(A[j]);
				}
					if(sumi==suml) {
						System.out.println("its same "+sumi+i+A[i]);
						
					return 1;
				
			}
			
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
		med(arr);
		
	}

}
