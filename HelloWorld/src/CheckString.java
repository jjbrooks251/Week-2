
public class CheckString {
	static String name = "Josh";
	static String name2 = "Josh";

	public static void main(String[] args) {

		if (name.equals("Josh")) {

			System.out.println("The Strings match");

		} else {
			System.out.println("Strings do not match");
		}

		if (name.equals(name2)) {
			System.out.println("Inputs match");
		} else {
			System.out.println("Inputs do not match");
		}

	}

}