package helloWorld;

public class SumSubarr {
	public static int summax(int[] A,int f) {
		int l=A.length;
		int sum;
		for(int i=0;i<l-1;i++) {
			sum=A[i];
			for(int j=i+1;j<l;j++) {
				sum=sum+A[j];
				if(sum==f) {
					System.out.println("the sum is met at indexes "+i+" and "+j);
					return 1;
				}
				if(sum > f || j == l) {
					break;
					
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
		summax(arr,23);

	}

}
