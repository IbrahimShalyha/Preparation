package day7class;

public class Task7 {
	public static void main(String[] args) {
		int[] num = { 65, 74, 83, 94, 267 };
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		System.out.println(min);
	}
}
