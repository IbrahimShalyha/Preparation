package interviewprograms;

public class RemoveDuplicatesFromSorted {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 3, 4, 4 };

		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(nums[i]);
			}
		}
	}
}