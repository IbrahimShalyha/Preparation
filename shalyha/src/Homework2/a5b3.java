package Homework2;

public class a5b3 {
   public static void main(String[]args) {
	   
	   String a = "a5b3c6";
	   
	   String[] b = a.split("");
	   
	   for(int i =0; i<a.length(); i=i+2) {
		   for(int j = 0 ; j<Integer.parseInt(b[i+1]); j++) {
			   System.out.print(b[i]);
		   }
	   }
   }
}
