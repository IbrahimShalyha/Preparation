package statics;

public interface NameString {
	public static String getName(String a, String b) {
		return a.concat(b);
	}

	public default String getNames(String a, String b) {
		return a.concat(b);
	}

	public String addNames(String a, String b);
}
