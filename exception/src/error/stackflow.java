package error;

public class stackflow {
	
	public void method1() {
		method2();
	}
	public void method2() {
		method1();
	}
	public static void main(String[]args) {
		stackflow s = new stackflow();
		s.method1();
	}
}

