package interviewprograms;

public class ReapeatedValue {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 5, 3 };

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i] + "=" + count);
			}
		}
	}
}
