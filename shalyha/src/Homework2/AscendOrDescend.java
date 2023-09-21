package Homework2;

public class AscendOrDescend {
	public static void main(String[] args) {

		int[] nums = { 12, 42, 41, 18, 2, 4, 56, 98, 67, 45 };

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
			System.out.println(nums[i]);
		}
	}
}
