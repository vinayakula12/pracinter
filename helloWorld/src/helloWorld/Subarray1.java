package helloWorld;

public class Subarray1 {
	int curr_sum;
	int subArraySum(int arr[], int n, int sum) {
		for(int i=0;i<n;i++) {
			curr_sum =arr[i];
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("we got the sum "+ i+ " and "+ j);
				}
				if(arr[i]+arr[j]>sum || j==n) {
					break;
				}
				curr_sum = curr_sum + arr[j]; 
			}
		}
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Subarray1 arraysum = new Subarray1(); 
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
        int n = arr.length; 
        int sum = 23; 
        arraysum.subArraySum(arr, n, sum);

	}

}
