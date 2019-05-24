
public class NumberToWord {

	public static void main(String[] args) {

		for (int i = 1; i <= 999; i++) {

			String s = Integer.toString(i);
			int l = s.length();

			if (l == 3) {

				System.out.println(hundreds(i, s, l));
			} else if (l == 2) {

				System.out.println(tens(i, s, l));
			} else {
				System.out.println(units(i, s, l));
			}
		}
	}

	static String units(int i, String word, int len) {

		int asc = word.charAt(len - 1);

		int num = Character.getNumericValue(asc);

		switch (num) {
		case 0:
			return "";

		case 1:
			return "One";

		case 2:
			return "Two";

		case 3:
			return "Three";

		case 4:
			return "Four";

		case 5:
			return "Five";

		case 6:
			return "Six";

		case 7:
			return "Seven";

		case 8:
			return "Eight";

		case 9:
			return "Nine";

		}
		return word;
	}

	static String tens(int i, String word, int len) {

		if (i == 0) {

			System.out.println(" ");

		} else if (i < 20) {

			int asc = word.charAt(len - 1);

			int num = Character.getNumericValue(asc);

			switch (num) {
			case 0:
				return "Ten ";

			case 1:
				return "Eleven ";

			case 2:
				return "Twelve ";

			case 3:
				return "Thirteen ";

			case 4:
				return "Fourteen ";

			case 5:
				return "Fifteen ";

			case 6:
				return "Sixteen ";

			case 7:
				return "Seventeen ";

			case 8:
				return "Eighteen ";

			case 9:
				return "Nineteen ";

			}

		} else {
			int remI = i % 10;
			String s = Integer.toString(remI);
			int l = s.length();

			int asc = word.charAt(len - 2);

			int num = Character.getNumericValue(asc);

			switch (num) {
			case 2:
				return "Twenty " + units(remI, s, l);

			case 3:
				return "Thirty " + units(remI, s, l);

			case 4:
				return "Forty " + units(remI, s, l);

			case 5:
				return "Fifty " + units(remI, s, l);

			case 6:
				return "Sixty " + units(remI, s, l);

			case 7:
				return "Seventy " + units(remI, s, l);

			case 8:
				return "Eighty " + units(remI, s, l);

			case 9:
				return "Ninety " + units(remI, s, l);

			}
		}
		return word;
	}

	static String hundreds(int i, String word, int len) {

		int remI = i % 100;
		String remS = Integer.toString(remI);
		int remL = remS.length();

		int asc = word.charAt(len - len);

		int num = Character.getNumericValue(asc);

		String strU = Integer.toString(num);
		int lenU = strU.length();

		return units(num, strU, lenU) + " Hundred and " + tens(remI, remS, remL);

	}

}
