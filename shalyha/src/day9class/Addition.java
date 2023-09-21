package day9class;

public class Addition {
	int num1;
	int num2;

	public int add() {
		return num1 + num2;
	}

	public int addWithParameter(int a, int b) {
		return a + b;
	}

	public void addWithoutParameter() {
		System.out.println(num1 + num2);
	}

	public void addvoidWithParameter(int a, int b) {
		System.out.println(a + b);
	}

}
