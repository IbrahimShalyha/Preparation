package roomwork;

public class SecondMaxNumber {
	public static void main(String[] args) {
		int[] nums = { 12, 43, 23, 54, 65, 34, 21, 87, 47 };

		int first = 0;
		int second = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > first) {
				second = first;
				first = nums[i];
			} else if (nums[i] > second) {
				second = nums[i];
			}
		}

		System.out.println(second);
	}
}
