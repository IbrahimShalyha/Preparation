package preparationday8;

public class UseStringUpperCase {
	public static void main(String[] args) {

		String a = "ibrahim";
		
//		StringUpperCase s1 = String::toUpperCase;
//
//		System.out.println(s1.getThis(a));
		
		StringUpperCase s1 = a::charAt;
		
		System.out.println(s1.getThis(3));

	}
}