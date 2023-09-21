package review;

public class FunctionsPrime {
	public void prime(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean isPrime = true;
			for (int j = 2; j < a[i]; j++) {
				if (a[i] % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				System.out.println(a[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] num = { 43, 65, 23, 12, 9, 76, 90, 36 };

		FunctionsPrime f1 = new FunctionsPrime();
		f1.prime(num);

	}
}
