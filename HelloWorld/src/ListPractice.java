import java.util.ArrayList;
import java.util.Collections;

public class ListPractice {

	public static void main(String[] args) {

		ListPractice name = new ListPractice();

		name.q1();
		System.out.println(name.q2(5));
		System.out.println(name.q3(""));
		name.q4(20);
		System.out.println("");
		System.out.println(name.q5("aaa"));
	}

	private ArrayList q1() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {

			list1.add(i);
			System.out.println(list1.get(i));

		}
		return list1;
	}

	private boolean q2(int num) {

		return this.q1().contains(num) == true;

	}

	private Boolean q3(String word) {
		ArrayList<String> list3 = new ArrayList<String>();

		list3.add("aaa");
		list3.add("fff");
		list3.add("ssss");
		list3.add("ggg");
		list3.add("aaa");
		list3.add("dddd");

		return list3.contains(word) == true;

	}

	private void q4(int num) {
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for (int i = 0; i <= num; i++) {

			list3.add(i);

		}

		for (int j : list3) {
			if ((list3.get(j) % 5) == 0) {
				int mult = list3.get(j) * 10;
				System.out.print(mult + ", ");
			}
		}

	}

	private int q5(String word) {

		ArrayList<String> list3 = new ArrayList<String>();

		list3.add("aaa");
		list3.add("fff");
		list3.add("ssss");
		list3.add("ggg");
		list3.add("aaa");
		list3.add("dddd");

		int occurr = Collections.frequency(list3, word);

		return occurr;

	}

}
