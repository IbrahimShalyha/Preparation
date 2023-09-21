package preparationday6;

public class StringImmutable {
	public static void main(String[] args) {

		String a = "HELLO";
		System.out.println(a.hashCode());
		a = a.concat("WORLD");
		System.out.println(a.hashCode());
		System.out.println(a);
	}
}
