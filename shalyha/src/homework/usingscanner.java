package homework;
import java.util.Scanner;
public class usingscanner {
public static void main(String[]args) {
	Scanner data = new Scanner (System.in);
	System.out.println("name");
	String name = data.next();
	System.out.println("age");
	int Age = data.nextInt();
	System.out.println("dob");
	int dob = data.nextInt();
	System.out.println("education");
	String education = data.next();
	System.out.println("hobbies");
	String hobbies =data.next();
	
	
}
}

