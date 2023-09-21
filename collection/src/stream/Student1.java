package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student1 {
	public static void main(String[] args) {
		Student s1 = new Student("RAMU", 15, 57, 450, "10th", true);
		Student s2 = new Student("LATHA", 16, 57, 400, "10th", false);
		Student s3 = new Student("GURU", 17, 57, 387, "10th", true);
		Student s4 = new Student("SELVI", 22, 57, 398, "10th", false);
		Student s5 = new Student("KEERTHI", 20, 57, 459, "10th", false);
		Student s6 = new Student("RAJA", 20, 57, 490, "10th", true);

		ArrayList<Student> li = new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);

//		List<Student> l = li.stream().filter(f -> f.getName().equalsIgnoreCase("raja")).peek(j -> j.setName("MANI"))
//				.collect(Collectors.toList());
//		System.out.println(l);

//		li.stream().filter(x -> x.getMarks() > 450).forEach(x -> System.out.println(x));
//
//		List<Student> z = li.stream().filter(x -> x.getIsMale() == true).collect(Collectors.toList());
//		z.forEach(x -> System.out.println(x));
//
//		List<String> names = li.stream().filter(x -> x.getMarks() > 450).map(x -> x.getName())
//				.collect(Collectors.toList());
//		names.forEach(x -> System.out.println(x));
//
//		List<String> words = li.stream().filter(x -> x.getMarks() < 450 && x.getIsMale() == true).map(x -> x.getName())
//				.collect(Collectors.toList());
//		words.forEach(x -> System.out.println(x));
//
//		Map<Integer, Student> group = li.stream().filter(x -> x.getAge() > 20)
//				.collect(Collectors.toMap(x -> x.getId(), y -> y));
//		group.forEach((x, y) -> System.out.println(x + " " + y));

//		List<Student> v = li.stream().filter(x -> x.getStandard().equalsIgnoreCase("10th"))
//				.peek(f -> f.setStandard("11th")).collect(Collectors.toList());
//		v.forEach(x -> System.out.println(x));
//		
//		li.stream().filter(x -> x.getIsMale() == false).forEach(x -> System.out.println(x));

//		li.stream().filter(x -> x.getIsMale() == false).peek(x -> x.setMale(true)).forEach(x -> System.out.println(x));
	}
}
