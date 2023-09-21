package day9class;

public class UseMultiple {
	public static void main(String[] args) {
		Multiple m = new Multiple();
		System.out.println(m.mul());
		System.out.println(m.mulWithPara(20, 35));
		m.mulWithoutPara();
		m.mulvoidWithPara(15, 10);
	}
}
