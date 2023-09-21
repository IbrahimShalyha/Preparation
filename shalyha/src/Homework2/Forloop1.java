package Homework2;

public class Forloop1 {
	public static void main(String[] args) {

		int val = Integer.parseInt(args[0]);
		int ans = 1;
		for (int i = 1; i <= val; i++) {
			ans = ans * i;
		}
		System.out.println(ans);
	}

}
