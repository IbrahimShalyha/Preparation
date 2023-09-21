package review;

public class Abbccc {
	public static void main(String[] args) {
//	        int n = 3;  
//	        for(int i = 0 ; i <= n ; i++)  
//	        {  
//	        for(int j = 0 ; j <= i ; j++)  
//	        {  
//	            System.out.print(" "+(char)(65 + i));  
//	        }  
//	            System.out.println("");
//	        }  

		String a = "a5b2";
		String[] b = a.split("");
		for (int i = 0; i < a.length(); i=i+2) {
			for (int j = 0; j < Integer.parseInt(b[i + 1]); j++) {
				System.out.print(b[i]);
			}
		}
	}
}
