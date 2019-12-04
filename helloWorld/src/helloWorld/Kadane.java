package helloWorld;

public class Kadane {
	static int sm;
	public static int summax(int[] A) {
		int l=A.length;
		
		int maxsub =A[0];
		int maxglsub =A[0];
		for(int i=0;i<l;i++) {
			maxsub=Math.max(A[i],A[i]+maxsub);
			if(maxsub>maxglsub) {
				maxglsub=maxsub;
			}
		}
		return maxglsub;	
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] t= {-2,1,-3,4,-1,2,1,-5,4};
		int res=summax(t);
		System.out.println("he max is "+res);
	}

}
