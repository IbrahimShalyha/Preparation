package Functioncalls;

public class UseNoun {
	public static void main(String[] args) {
		String word = args[0];
		Noun noun = new Noun();
		noun.findPlural(word);
	}
}
