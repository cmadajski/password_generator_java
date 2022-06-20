package passgen;

public class Driver {
	public static void main(String[] args) {
		PassGen newPassword;
		// if no args are passed in, then assume 24 char password length
		if (args.length == 0) {
			newPassword = new PassGen(24);
		} else {
			int parsedInt = 0;
			try {
				parsedInt = Integer.parseInt(args[0]);
			}
			catch (NumberFormatException nfe) {
				System.out.println("Arg[0] must be a pure integer value!");
				System.exit(0);
			}
			newPassword = new PassGen(parsedInt);
		}
		System.out.printf("New %d character password created: %s", newPassword.getLength(), newPassword.getPassword());
	}
}