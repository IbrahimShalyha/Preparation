package preparationday6;

public class StringBuilderAndBuffer {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("HELLO");
		System.out.println(sb.hashCode());
		sb.reverse();
		System.out.println(sb);
        
		String a = "SHAKINA";
		StringBuffer su = new StringBuffer("IBRAHIM");
		System.out.println(su.hashCode());
		su.append(a);
		System.out.println(su.hashCode());
		System.out.println(su);
	}
}