package testday2;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 1234;
		e1.name = "praveen";
		e1.dob = "24/08/1996";
		e1.mobileno = 9789314134l;
		e1.cc = "+91";
		e1.acc = (e1.cc + e1.mobileno);
		System.out.println("ID = " + e1.id + "\n" + "NAME = " + e1.name + "\n" + "DOB = " + e1.dob + "\n"
				+ "MOBILENO = " + e1.mobileno + "\n" + "CC = " + e1.cc + "\n" + "ACC = " + e1.acc);

	}
}
