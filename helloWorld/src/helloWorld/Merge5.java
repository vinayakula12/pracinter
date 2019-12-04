package helloWorld;

public class Merge5 {
	int[] merge(int a[],int b[]) {
		int n=a.length;
		int p=b.length;
		int i=0;
		int j=0;
		int k=0;
		int c[]=new int[n+p];
		
		while(i<n &&  j<p) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				k++;
				i++;
				
			}
			else
			{
				c[k]=b[j];
				k++;
				j++;
			}
			
		}
		while(i<n) {
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<p) {
			c[k]=b[j];
			k++;
			j++;
		}
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 3, 5, 7};
		int[] arr2 = {2, 4, 6, 8}; 
		Merge5 merge1 = new Merge5(); 
		int g[]=merge1.merge(arr1, arr2);
		for (int f=0; f<g.length; f++) 
            System.out.print(g[f] + " ");
	}

}
