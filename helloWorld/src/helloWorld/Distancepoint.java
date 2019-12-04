package helloWorld;

public class Distancepoint {
	public static int coverPoints(int[] A, int[] B) {
		int c=0,maxi;
		for(int i=0;i<A.length-1;i++)
		{
		maxi=Math.max(Math.abs(A[i]-A[i+1]),Math.abs(B[i]-B[i+1]));
		c=c+maxi;
		}
		return c;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] x= {0,1,1};
int[] y= {0,1,2};
int g=coverPoints(x,y);
System.out.println("the dis "+g);

	}

}
