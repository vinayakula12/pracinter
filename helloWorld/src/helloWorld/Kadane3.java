package helloWorld;

public class Kadane3 {
 int maxsofar=0,maxendhere=0;
	int maxSubArraySum(int a[]) {
		int n=a.length;
		for(int i=0;i<n;i++) {
			
			maxendhere=maxendhere+a[i];
			if(maxendhere<0) {
				maxendhere=0;
			}
			if(maxendhere>maxsofar) {
				maxsofar=maxendhere;
			}
		}
		return maxsofar;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kadane3 kadane = new Kadane3(); 
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        int y=kadane.maxSubArraySum(arr);
        System.out.println(y);
        

	}

}
