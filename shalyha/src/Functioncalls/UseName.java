package Functioncalls;

public class UseName {
	public static void main(String[] args) {
		String a = args[0];
		Name name = new Name();
		System.out.println(name.findVowel(a));
	}
}
