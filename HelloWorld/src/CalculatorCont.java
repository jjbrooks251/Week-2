
public class CalculatorCont {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 5;

		String ops = "div";

		if (ops.equals("add")) {
			System.out.println(num1 + num2);
		} else if (ops.equals("minus")) {
			System.out.println(num1 - num2);
		} else if (ops.equals("multi")) {
			System.out.println(num1 * num2);
		} else if (ops.equals("div")) {
			System.out.println(num1 / num2);
		} else
			System.out.println("operator incorrect, plese try again");

	}

}
