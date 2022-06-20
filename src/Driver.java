package passgen;

public class Driver {
	public static void main(String[] args) {
		PassGen newPassword;
		// if no args are passed in, then assume 24 char password length
		if (args.length == 0) {
			newPassword = new PassGen(24);
		} else {
			newPassword = new PassGen(Integer.parseInt(args[0]));
		}
		System.out.printf("New %d character password created: %s", newPassword.getLength(), newPassword.getPassword());
	}
}