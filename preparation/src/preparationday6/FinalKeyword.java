package preparationday6;

public class FinalKeyword {
	public static void main(String[]args) throws CustomException {
     try {
    	 int a = 10;
         int b = 0;
         int c = a/b;
         System.out.println(c);
         }
//     catch(ArithmeticException ae) {
//    	 System.out.println("HELLO");
//    	 ae.printStackTrace();
//     }
     finally {
    	 System.out.println("ARITHMETIC EXCEPTION");
     }
     System.out.println("END");
	}
}