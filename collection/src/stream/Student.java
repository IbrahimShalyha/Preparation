package stream;

public class Student {
	private String name;
	private int age;
	private int id;
	private int marks;
	private String standard;
	private boolean isMale;

	public Student(String name, int age, int id, int marks, String standard, boolean isMale) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.marks = marks;
		this.standard = standard;
		this.isMale = isMale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public boolean getIsMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String toString() {
		return "name=" + name + ", age=" + age + ", id=" + id + ", marks=" + marks + ", standard=" + standard
				+ ", isMale=" + isMale;
	}

}
