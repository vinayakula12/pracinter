package helloWorld;

import java.util.Arrays;

public class rearrangealter6 {
	 static int[] rearr(int arr[]) {
		int n=arr.length;
		int temp[] = new int[n]; 
		 int small=0, large=n-1; 
		 boolean flag = true;
		
		for(int i=0;i<n;i++) {
			if(flag) {
				temp[i]=arr[large];
				
				large--;
			}
			if(!flag) {
				temp[i]=arr[small];
				
				small++;
			}
			flag = !flag; 
		}
		
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{1, 2, 3, 4, 5, 6}; 
        
        System.out.println("Original Array "); 
        System.out.println(Arrays.toString(arr)); 
          
        int s[]=rearr(arr); 
          
        System.out.println("Modified Array "); 
        System.out.println(Arrays.toString(s));

	}

}
