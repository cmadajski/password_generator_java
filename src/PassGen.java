package passgen;

public class PassGen {
	private int passwordLength;
	private String randomPassword;

	public PassGen(int passwordLength) {
		this.passwordLength = passwordLength;
		this.randomPassword = generatePassword(this.passwordLength);

	}

	public int getLength() {
		return this.passwordLength;
	}
	public String getPassword(){
		return this.randomPassword;
	}
	private String generatePassword(int numChars) {
		StringBuilder buildPassword = new StringBuilder();
		int specialIndex = (int) Math.floor(Math.random() * numChars);
		byte asciiNum = 0;
		for (int i = 0; i < numChars; i++) {
			if (i == specialIndex) {
				int specialCharCode = (int) Math.floor(Math.random() * 9);
				asciiNum = (byte) getSpecialCharacter(specialCharCode);
			} else {
				byte nextChar = (byte) Math.floor(Math.random() * 3);
				switch (nextChar) {
					// generate lowercase char
					case 0:
						asciiNum = (byte) Math.floor(Math.random() * 26 + 97);
						break;
					// generate uppercase char
					case 1:
						asciiNum = (byte) Math.floor(Math.random() * 26 + 65);
						break;
					// generate number 0-9
					case 2:
						asciiNum = (byte) Math.floor(Math.random() * 10 + 48);
				}
			}
			// add ascii char to the StringBuilder
			buildPassword.append((char) asciiNum);
		}
		// return password in String form
		return buildPassword.toString();
	}
	private int getSpecialCharacter(int code) {
		switch(code) {
			case 0:
				return 33;
			case 1:
				return 35;
			case 2:
				return 36;
			case 3:
				return 37;
			case 4:
				return 38;
			case 5:
				return 42;
			case 6:
				return 43;
			case 7:
				return 63;
			case 8:
				return 64;
			default:
				return 0;
		}
	}
}