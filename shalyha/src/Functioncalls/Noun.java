package Functioncalls;

public class Noun {
	public void findPlural(String word) {
		if (word.endsWith("s")) {
			System.out.println("Plural");
		} else {
			System.out.println("Singular");
		}
	}
}
