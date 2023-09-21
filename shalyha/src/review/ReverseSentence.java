package review;

public class ReverseSentence {
	public void findReverseSentence(String a) {
		String[] b = a.split(" ");	
			for (int j = b.length - 1; j >= 0; j--) {
				System.out.print(b[j] + " ");
			}
		}


	public static void main(String[] args) {
		String a = "MY NAME IS IBRAHIM";
		ReverseSentence r1 = new ReverseSentence();
		r1.findReverseSentence(a);
	}
}
