package helloWorld;

import java.util.HashMap;

public class Zerosum
{
	public static int zesum(int arr[]){
		HashMap<Integer, Integer> hM =  new HashMap<Integer, Integer>(); 
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
        { 
			sum=sum+arr[i];
			if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)  {                        
                System.out.println("found the zerosum");
                return 1;
			}
			
            // Add sum to hash map 
            hM.put(sum, i);
        }
		return 0;
		
        }

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {-3, 2, 3, 1, 6}; 
		int arr2[]={4, 2, -3, 1, 6};
		zesum(arr2);
		
		
		

	}

}
