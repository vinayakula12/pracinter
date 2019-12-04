package helloWorld;

import java.util.ArrayList;

public class Rotateindex {
	public static  int[] rotateArray(int arr[], int B) {
		 int[] ret = new int[10];
        for (int i = 0; i < arr.length; i++) {
        	if (i >=arr.length-B) {
            ret[i]=arr[i+B-arr.length];
        	}
        	else
        	{
        		ret[i]=arr[i + B];
        	}}
        return ret;
        }
	
        		
        static //
        void printArray(int arrf[]) 
        	
        
        { 
         
			for (int i = 0; i < arrf.length; i++) 
                System.out.print(arrf[i] + " "); 
        } 
    



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrpr1=new int[11];
		int arrpr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		arrpr1=rotateArray(arrpr,1);
		printArray(arrpr1);

	}

}
