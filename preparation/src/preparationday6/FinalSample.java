package preparationday6;

public class FinalSample {

	public void finalize() {
		System.out.println("COLLECTED");
	}

	public static void main(String[] args) {
		FinalSample s1 = new FinalSample();
		System.out.println(s1.hashCode());

		s1 = new FinalSample();
		System.out.println(s1.hashCode());

		System.gc();
	}
}