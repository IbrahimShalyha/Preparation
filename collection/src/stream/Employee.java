package stream;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private String codingLang;
	private String designation;

	public Employee(String name, int id, int salary, String codingLang, String designation) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.codingLang = codingLang;
		this.designation = designation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String toString() {
		return "name=" + name + ", id=" + id + ", salary=" + salary + ", codingLang=" + codingLang + ", designation="
				+ designation;
	}

}
