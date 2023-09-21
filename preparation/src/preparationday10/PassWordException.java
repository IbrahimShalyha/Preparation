package preparationday10;

public class PassWordException extends Exception {
	public PassWordException(String msg) {
		super(msg);
	}

	public void printStackTrace() {
		System.err.println("EXCEPTION HANDLED");
	}
}
