package statics;

public class UseSample1 {
	public static void main(String[] args) {
		Sample1 s1 = new Sample1();
		Sample s = s1::method;
		System.out.println(s.method1());
	}
}
