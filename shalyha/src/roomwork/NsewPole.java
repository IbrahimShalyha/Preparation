package roomwork;

public class NsewPole {
	public static void main(String[] args) {
		String pole = "NORTH";
		char v = pole.charAt(0);

		if (v == 'S') {
			System.out.println("SOUTH");
		} else if (v == 'N') {
			System.out.println("NORTH");
		} else if (v == 'E') {
			System.out.println("EAST");
		} else {
			System.out.println("WEST");
		}

	}

}
