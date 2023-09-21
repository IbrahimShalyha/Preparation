package preparationday6;

public class StaticKeyword {
	static int a = 0;

	public StaticKeyword() {
		a++;
		System.out.println(a);
	}

	public static String get() {
		return "HELLO";
	}

	public static void main(String[] args){
		StaticKeyword s1 = new StaticKeyword();
		StaticKeyword s2 = new StaticKeyword();

		System.out.println(StaticKeyword.get());
	}

	static {
		System.out.println("WORLD");
	}
}
