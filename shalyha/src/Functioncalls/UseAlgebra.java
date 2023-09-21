package Functioncalls;

public class UseAlgebra {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		Algebra algebra = new Algebra();
		System.out.println(algebra.findlhsRhs(a, b));
	}
}
