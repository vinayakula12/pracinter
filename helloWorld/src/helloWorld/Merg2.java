package helloWorld;

public class Merg2 {
	public static int[] Merge(int[] A,int[] B) {
		int n=A.length;
		int m=B.length;
		int [] C=new int[m+n];
		int i = 0,k = 0,j=0;
		while(i<n && k<m) {
		if(A[i]<B[k]) {
			C[j]=A[i];
			j++;
			i++;
		}
		else {
			C[j]=B[k];
		j++;
		k++;
			
		}
		}
		while(i<n) {
			C[j]=A[i];
			j++;
			i++;	
		}
		while(k<m) {
			C[j]=B[k];
			j++;
			k++;	
		}
		return C;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 3, 5, 7}; 
		 int[] arr2 = {2, 4, 6, 8};
		 int d[]=Merge(arr1,arr2);
		 System.out.println("Array after merging"); 
	        for (int i=0; i < d.length; i++) 
	            System.out.print(d[i] + " "); 

	}

}
