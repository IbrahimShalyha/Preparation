package day4class;

public class Task {
	public static void main(String[] args) {

		int value = Integer.parseInt(args[0]);

		int value1 = Integer.parseInt(args[1]);

		int num = value + value1;

		System.out.println(num);
		
		int value2 = Integer.parseInt(args[0]);
		
		int value3 = Integer.parseInt(args[1]);
		
		int num1 = value2-value3;
		
		System.out.println(num1);
		
		int value4 = Integer.parseInt(args[0]);
		
		int value5 = Integer.parseInt(args[1]);
		
		int num2 = value4*value5;
		
		System.out.println(num2);
		
		int value6 = Integer.parseInt(args[0]);
		
		int value7 = Integer.parseInt(args[1]);
		
		int num3 = value6+value7;
		
		System.out.println(num3);
		
		
		float value8 = Float.parseFloat(args[0]);
		
		float value9 = Float.parseFloat(args[1]);
		
		float num4 = value8+value9;
		
		System.out.println(num4);
		
		
		long value10 = Long.parseLong(args[2]);
		
		long value11 = Long.parseLong(args[3]);
		
		long num5 = value10+value11;
		
		System.out.println(num5);
		
		double value12 = Double.parseDouble(args[2]);
		
		double value13 = Double.parseDouble(args[3]);
		
		double num6 = value12+value13;
		
		System.out.println(num6);
		

		double value17 = Double.parseDouble(args[2]);
		
		double value18 = Double.parseDouble(args[3]);
		
		double num9 = value17-value18;
		
		System.out.println(num9);
		
		
		boolean value14 = Boolean.parseBoolean(args[4]);
		
		boolean value15 = Boolean.parseBoolean(args[5]);
		
		boolean num7 = value14;
		
		boolean num8 = value15;
		
		System.out.println(num7);
		
		System.out.println(num8);
		
	}
}
