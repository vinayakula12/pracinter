package helloWorld;

public class Totl {
	static int sum;
	static int tol=0;
	public static int trip(int[] A) {
		int n=A.length;
		sum = (n+1) * (n + 2) / 2;
		for(int i=0;i<n;i++) {
			 tol=tol+A[i];
			
		}
		return sum-tol;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a[] = { 1, 2, 4, 5, 6 };
        System.out.println(trip(a));
	}

}
