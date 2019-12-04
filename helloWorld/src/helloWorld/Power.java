package helloWorld;

public class Power {
	static //static int[] res = null;
	int s;
	public static int sum1(int[] A) {
		int l=A.length;
		int sum=0;
		for(int i=0;i<l;i++) {
	     sum = sum +A[i]*(int) Math.pow(10, l-i-1);
		}
		
		int s=sum+1;
		//return res;
		
	
	
	String temp = Integer.toString(s);
	int[] intArray = new int[temp.length()];
	
	for (int i = 0; i < temp.length(); i++)
	{
		intArray[i] = temp.charAt(i);
	}
	return s;
}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {3,1,1};
		int f=sum1(x);
System.out.println(f);
	}

}

