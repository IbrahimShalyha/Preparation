package day7class;

public class Task4 {
	public static void main(String[] args) {
		int[] num = new int[6];
		num[0] = 95;
		num[1] = 85;
		num[2] = 74;
		num[3] = 60;
		num[4] = 76;
		num[5] = 83;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println("EVEN = "+num[i]);
				
			}
		 else if(num[i]%2 !=0) {
			 System.out.println("ODD = "+num[i]);
		 }
			
		}
	
	}
}
