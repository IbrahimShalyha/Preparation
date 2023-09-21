package preparationday10;

public class CheckPassword {

	public void getThis(String password) throws PassWordException {
		try {

			if (password.length() > 8) {
				System.out.println("LOGIN SUCCESSFULLY");
			} else {
				throw new PassWordException("LOGIN FAILED");
			}

		} catch (PassWordException pe) {
			pe.printStackTrace();
		}
	}
}
