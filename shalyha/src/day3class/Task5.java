package day3class;

public class Task5 {
public static void main (String[]args) {
	String value = "programming";
	char[] value1 = value.toCharArray();
	System.out.println("VALUE1 = "+value1[4]);
	
	String value2 = "java & is & programming";
	String[] value3 = value2.split("j");
	System.out.println("VALUE3 = "+value3[1]);
	
}
}
	