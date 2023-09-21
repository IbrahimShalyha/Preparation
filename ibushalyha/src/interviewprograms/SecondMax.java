package interviewprograms;

public class SecondMax {
	public static void main(String[] args) {

		int[] nums = { 10, 35, 21, 65, 76, 23, 12, 5, 70, 71 };

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
