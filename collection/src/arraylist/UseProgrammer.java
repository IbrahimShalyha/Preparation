package arraylist;

import java.util.*;

public class UseProgrammer {
	public static void main(String[] args) {
		Programmer p1 = new Programmer("BALA", "DEVELOPER", 40000, "JAVA", true);
		Programmer p2 = new Programmer("RAJA", "DEVELOPER", 35000, "PYTHON", true);
		Programmer p3 = new Programmer("SUJA", "DEVELOPER", 50000, "AWS", false);
		Programmer p4 = new Programmer("SUJITHA", "DEVELOPER", 65000, "JAVA", false);

		ArrayList<Programmer> program = new ArrayList<>();
		ArrayList<Programmer> programs = new ArrayList<>();
		program.add(p1);
		program.add(p2);
		program.add(p3);
		program.add(p4);

		for (int i = 0; i < program.size(); i++) {
			if (program.get(i).getMale() == true) {
				programs.add(program.get(i));
			}
		}

		for (int i = 0; i < programs.size(); i++) {
			System.out.println(programs.get(i));
		}

		for (int i = 0; i < program.size(); i++) {
			if (program.get(i).getSalary() > 50000 && program.get(i).getCodingLang().equals("JAVA")) {
				System.out.println(program.get(i).getName());
			}
		}

	}

}
