package statics;

public interface Calculation {

	public static int add(int a, int b) {
		return a+b;
	}
	public int multiply(int b, int c);
	
	public default int divide(int a, int b) {
		return a/b;
	}
	
}
