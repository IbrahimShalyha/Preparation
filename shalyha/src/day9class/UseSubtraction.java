package day9class;

public class UseSubtraction {
	public static void main(String[] args) {
		Subtraction s = new Subtraction();
		System.out.println(s.sub());
		System.out.println(s.subWithPara(45, 54));
		s.subWithoutPara();
		s.subvoidWithPara(45, 30);
	}
}
