import java.util.ArrayList;

public class ClassEx21 {

	public static void main(String[] args) {

		ClassEx21 Ex21 = new ClassEx21();

		System.out.println(Ex21.checkTeen(15, 16, 9));

	}

	private boolean checkTeen(int num1, int num2, int num3) {

		ArrayList<Integer> numLine = new ArrayList<Integer>();

		numLine.add(num1);
		numLine.add(num2);
		numLine.add(num3);

		return numLine.stream().filter(i -> i >= 13 && i <= 19).count() >= 2;
	}

}
