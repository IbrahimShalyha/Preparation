package testday2;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "ibushalyha";
		s1.id = 2436;
		s1.age = 17;
		s1.Class = "XII";
		s1.attendancepercentage = 97.5f;
		s1.noofdayspresent = 234;
		s1.totalworkingdaysofschool = 240;
		s1.numberofleaves = ((s1.totalworkingdaysofschool / s1.noofdayspresent) * s1.attendancepercentage);
		System.out.println("NAME = " + s1.name + "\n" + "ID = " + s1.id + "\n" + "AGE = " + s1.age + "\n" + "CLASS = "
				+ s1.Class + "\n" + "ATTENDANCE PERCENTAGE = " + s1.attendancepercentage + "\n"
				+ "NO OF DAYS PRESENT = " + s1.noofdayspresent + "\n" + "TOTAL WORKING DAYS OF SCHOOL = "
				+ s1.totalworkingdaysofschool + "\n" + "NUMBER OF LEAVES = " + s1.numberofleaves);
	}
}
