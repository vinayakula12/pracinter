package Hashing;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CustomSort {

	//private static final String Map = null;
	public static int[] zesum(int arrA[],int arrB[]) {
		Map<Integer, Integer> tt=new HashMap<>();
		//Map<Integer, Integer> freq = new TreeMap<>();
		int n=arrA.length;
		int m=arrB.length;
		for(int i=0;i<n;i++){
			if(tt.containsKey(arrA[i])) {
				tt.put(arrA[i], tt.get(arrA[i])+1);
			}
			else {
				tt.put(arrA[i],1);
			}
		}
		int h=0;
		for(int j=0;j<m;j++){
			if(tt.containsKey(arrB[j])) {
			int count=tt.get(arrB[j]);
			while(count>0) {
				arrA[h]=arrB[j];
				count--;
				h++;
			}
			}
			tt.remove(arrB[j]);
		}
		for (Map.Entry<Integer,Integer> entry: tt.entrySet()) {
			int cc=entry.getValue();
			while(cc>0) {
				arrA[h]=entry.getKey();
				cc--;
				h++;
			}
		}
		return arrA;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] first = { 5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 5, 1, 8, 4 };
		int[] second = { 3, 5, 7, 2 };

		int g[]=zesum(first, second);

		System.out.println("After sorting the array is : " + Arrays.toString(g));

	}

}
