
public class ArrayPractice {

	public static void main(String[] args) {

		loop(200);

	}

	static void loop(int input) {

		int[] array1 = new int[input];

		for (int i = 0; i < input; i++) {

			array1[i] = i + 1;
			System.out.println(array1[i]);

		}

	}

}
