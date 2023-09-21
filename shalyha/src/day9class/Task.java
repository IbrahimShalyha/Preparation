package day9class;

public class Task {
	public String findposorneg(int num) {
		if (num > 0) {
			return num + " IS POSITIVE";
		} else {
			return num + " IS NEGATIVE";
		}
	}

	public int mulFactorial(int num) {
		int count = 1;
		for (int i = 1; i <= num; i++) {
			count = count * i;
		}
		return count;
	}

	public void fibonacci(int num) {
		int a = 0;
		int b = 1;
		int sum = 1;
		for (int i = 0; i <= num; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);
		}

	}
}
