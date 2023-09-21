package hashmap;

public class Employees {
	String name;
	int salary;
	String company;

	public Employees(String name, int salary, String company) {
		this.name = name;
		this.salary = salary;
		this.company = company;
	}

	public String toString() {
		return "name=" + name + "," + "salary=" + salary + "," + "company=" + company;
	}
}
