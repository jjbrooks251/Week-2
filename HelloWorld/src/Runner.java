
public class Runner {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		System.out.println(add(3, 5));
		System.out.println(minus(3, 5));
		System.out.println(multi(3, 5));
		System.out.println(div(5, 3));
		System.out.println(rem(25, 10));
	}

	static int add(int num1, int num2) {

		int num3 = num1 + num2;

		return num3;

	}

	static int minus(int num1, int num2) {

		int num3 = num1 - num2;

		return num3;

	}

	static int multi(int num1, int num2) {

		int num3 = num1 * num2;

		return num3;

	}

	static int div(int num1, int num2) {

		int num3 = num1 / num2;

		return num3;

	}

	static int rem(int num1, int num2) {

		int num3 = num1 % num2;

		return num3;

	}

}