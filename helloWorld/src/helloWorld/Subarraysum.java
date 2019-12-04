package helloWorld;

public class Subarraysum {
	static int sum;
	static int subarray(int arr[],int k) {
		for(int i=0;i<arr.length;i++) {
			sum=arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				
				 sum=sum+arr[j];
				 if(sum==k) {
					 System.out.println("the sum is found between"+i+ "and"+j);
					 break;
				 }
				 
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		int a1[]={15, 2, 4, 8, 9, 5, 10, 23}; 
		subarray(a1,33);

	}

}
