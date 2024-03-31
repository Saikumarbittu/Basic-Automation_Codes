package coreJava;

public class PrintintfromString {

	public static void usingmethods() {
		String str = " helloThisIsA1234Sample";
		String numberOnly = str.replaceAll("[^0-9]", "");
		System.out.println(numberOnly);
	}

	public static void withoutmethod() {
		String alphaNumericString = "h8ll0";
		StringBuilder str = new StringBuilder();
		char[] carray = alphaNumericString.toCharArray();

		for (char c : carray) {
			if (Character.isDigit(c)) {
				str.append(c);

				// System.out.println(c);
			}

		}
	}

	public static void printNo() {
		int i;
		for (i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i + ": Pingpong");

			} else {
				if (i % 7 == 0) {
					System.out.println(i + ": Pong");
				}

				else {
					if (i % 5 == 0) {
						System.out.println(i + ": Ping");

					}
				}

			}
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		usingmethods();
		withoutmethod();
		printNo();
	}

}
