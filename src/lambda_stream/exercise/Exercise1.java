package lambda_stream.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
	public static void main(String[] args) {
		// 홀수 필터링하기
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> collect =
			numbers.stream()
				.filter(e -> e % 2 != 0)
				.collect(Collectors.toList());

		System.out.println(collect);
	}
}