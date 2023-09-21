package Functioncalls;

public class Name {
	public String findVowel(String word) {
		if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o")
				|| word.contains("u")) {
			return "VOWEL PRESENT";
		} else {
			return "VOWEL NOT PRESENT";
		}
	}
}
