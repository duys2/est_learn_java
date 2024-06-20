package lambda_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaLearn {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		/*
		Iterator<Integer> iterator = numbers.iterator();

		while (iterator.hasNext()) {
			Integer next = iterator.next();

			if (next % 2 == 0) {
				iterator.remove();
			}
		}
		*/

		numbers.removeIf(integer -> integer % 2 == 0); // integer는 매개변수

		System.out.println(numbers); // 홀수만 남는다
	}
}