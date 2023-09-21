package day2class;

public class Student1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "DAVID";
		s1.standard = "12th";
		s1.rollno = 1230;
		s1.tamil = 90;
		s1.english = 87;
		s1.maths = 85;
		s1.science = 97;
		s1.social = 92;
		s1.total = (s1.tamil + s1.english + s1.maths + s1.science + s1.social);
		s1.avg = (s1.total / 5);
		System.out.println("name = " + s1.name + "\n" + "standard" + s1.standard + "\n" + "rollno" + s1.rollno + "\n"
				+ "tamil" + s1.tamil + "\n" + "english" + s1.english + "\n" + "maths" + s1.maths + "\n" + "science"
				+ s1.science + "\n" + "social" + s1.social + "\n" + s1.total + "\n" + s1.avg);

	}
}