package homework;

public class Name {
	public static void main(String[] args) {
		String name = args[0];
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.substring(1, 3));
			break;
		}
	}
}
