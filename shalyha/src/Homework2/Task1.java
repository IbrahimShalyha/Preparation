package Homework2;

public class Task1 {
	public static void main(String[] args) {
		String s = args[0];
		char c = s.charAt(0);
		if (c == 'N') {
			System.out.println("NORTH");
		} else if (c == 'S') {
			System.out.println("SOUTH");
		} else if (c == 'E') {
			System.out.println("EAST");
		} else {
			System.out.println("WEST");
		}
	}
}
