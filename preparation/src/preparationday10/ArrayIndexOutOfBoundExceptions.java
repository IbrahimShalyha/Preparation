package preparationday10;

public class ArrayIndexOutOfBoundExceptions extends Exception {
	public static void main(String[] args) {

		System.out.println("HELLO");
		try {
			String[] a = { "SUN", "EAR", "NOON" };
			for (int i = 0; i < a.length; i++) {
				System.out.println(a[5].charAt(7));
			}
		} catch (StringIndexOutOfBoundsException ai) {
			System.out.println(ai);
		} catch (IndexOutOfBoundsException io) {
			System.out.println(io);
		} catch (RuntimeException rt) {
			System.out.println(rt);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("YOU ARE WELCOME");
		}

	}
}
