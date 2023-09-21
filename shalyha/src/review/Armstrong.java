package review;

public class Armstrong {
	public void findArmstrong(int num) {
		int arms = 0;
		int nums = num;
		while (num > 0) {
			int rem = num % 10;
			arms = arms + (rem * rem * rem);
			num = num / 10;
		}
		if (nums == arms) {
			System.out.println("IT IS ARMSTRONG");
		} else {
			System.out.println("IT IS NOT ARMSTRONG");
		}

	}

	public static void main(String[] args) {

		int num = 153;
		Armstrong a1 = new Armstrong();
		a1.findArmstrong(num);
	}
}
