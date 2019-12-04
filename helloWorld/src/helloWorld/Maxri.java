package helloWorld;

public class Maxri {
public static void med(int[] A) {
		
		int l=A.length;
		int maxi=A[l-1];
		System.out.println("the number is"+maxi);
		
		for(int i=l-2;i>=0;i--) {
			if(maxi<A[i]) {
				maxi=A[i];
				System.out.println("the number is"+A[i]);
				//break;
			}
			
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{16, 17, 4, 3, 5, 2}; 
       
        med(arr);

	}

}
