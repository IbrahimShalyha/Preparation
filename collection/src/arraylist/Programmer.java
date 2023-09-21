package arraylist;

public class Programmer {
	private String name;
	private String designation;
	private int salary;
	private String codingLang;
	private boolean isMale;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCodingLang() {
		return codingLang;
	}

	public void setCodingLang(String codingLang) {
		this.codingLang = codingLang;
	}

	public boolean getMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public Programmer(String name, String designation, int salary, String codingLang, boolean isMale) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.codingLang = codingLang;
		this.isMale = isMale;
	}

	public String toString() {
		return "Programmer [name=" + name + ", designation=" + designation + ", salary=" + salary + ", codingLang="
				+ codingLang + ", isMale=" + isMale + "]";
	}

}
