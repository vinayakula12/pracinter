package String;

public class Revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "I love you Algo";
		String bv []=s.split(" ");
		int l=bv.length;
		String a = "";
		for(int i=l-1;i>=0;i--) {
			 a=a+bv[i]+" ";
		}
		
		System.out.println(a);
		

	}

}
