package lambda_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLearn {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		numbers.stream();

		int[] array = {1, 2, 3, 4, 5};
		IntStream stream = Arrays.stream(array);

		Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);

		// 필터: 조건에 맞는 것만 포함한다.
		numbers.stream() // 아래와 같이 개행
			.filter(integer -> integer % 2 == 0)
			.forEach(integer -> System.out.println(integer)); // 람다를 메서드 참조로:.forEach(System.out::println);
		// 매핑: 전부 *2한 값으로 바뀐다.
		List<Integer> collect = numbers.stream().map(integer -> integer * 2).collect(Collectors.toList());
		for (int i : collect) {
			System.out.println(i);
		}
		// 기본적으로 오름차순 정렬
		numbers.stream().sorted().forEach(integer -> System.out.println(integer));
	}
}