package String;

import java.util.Arrays;

public class Anagram {
	 static boolean Anagram(char[] str1, char[] str2) {
		 Arrays.sort(str1);
		 Arrays.sort(str2);
		 int n1=str1.length;
		 int n2=str2.length;
		 if(n1!=n2) {
			 System.out.println("not equal");
			 return false;
		 }
		 
		 else {
			 for(int i=0;i<n1;i++) {
				 if(str1[i]!=str2[i]) {
					 System.out.println("not equal");
					 return false;
				 }
				 
				 
			 }
		 }
		return true;
		 
		 
		 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str1[] = { 't', 'e', 's', 't' }; 
        char str2[] = { 't', 't', 'e', 's' }; 
        if (Anagram(str1, str2)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");

	}

}
