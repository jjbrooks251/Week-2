import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {

		StreamPractice legend = new StreamPractice();

		System.out.println(legend.list("aaa"));

		System.out.println(legend.largeNo(20));

		legend.evenOnly(20);
	}

	private long list(String word) {
		ArrayList<String> list3 = new ArrayList<String>();

		list3.add("aaa");
		list3.add("fff");
		list3.add("aaa");
		list3.add("ggg");
		list3.add("aaa");
		list3.add("dddd");

		return list3.stream().filter(i -> i.equals(word)).count();

	}

	private Optional<Integer> largeNo(int num) {

		ArrayList<Integer> listNum = new ArrayList<Integer>();
		for (int i = 0; i <= num; i++) {

			listNum.add(i);

		}

		return listNum.stream().max(Integer::compare);

	}

	private void evenOnly(int num) {

		ArrayList<Integer> listEven = new ArrayList<Integer>();
		for (int i = 0; i <= num; i++) {

			listEven.add(i);

		}

		System.out.println(listEven.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));

	}
}
