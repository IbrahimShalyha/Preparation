package day6class;

public class Task5 {
public static void main(String[]args) {
	int total = 0;
	int count = 0;
	for (int a=10; a<=20; a++) {
		total = total+a;
		count = count+1;
	}
	System.out.println(total);
	System.out.println(count);
	System.out.println("AVERAGE="+total/count);
}
}
