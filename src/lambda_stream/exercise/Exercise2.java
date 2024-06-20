package lambda_stream.exercise;

import java.util.Arrays;
import java.util.List;

public class Exercise2 {
	public static void main(String[] args) {
		// 정수 리스트에서 홀수만 필터링하여 출력하는 프로그램을 람다 표현식을 사용하여 작성하세요.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.stream()
			.filter(e -> e % 2 != 0)
			.forEach(e -> System.out.println(e));
	}
}