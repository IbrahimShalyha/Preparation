package day4class;

public class UseMaker {
     public static void main(String[]args) {
    	 
    	 Maker m1 = new Maker();
    	 m1.brand = args[0];
    	 m1.price = Integer.parseInt(args[1]);
    	 m1.colour = args[2];
    	 
    	 System.out.println("BRAND = "+m1.brand);
    	 System.out.println("PRICE = "+m1.price);
    	 System.out.println("COLOUR = "+m1.colour);
     }
}
