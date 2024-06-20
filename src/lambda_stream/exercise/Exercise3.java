package lambda_stream.exercise;

import java.util.Arrays;
import java.util.List;

public class Exercise3 {
	public static void main(String[] args) {
		// 문자열 리스트에서 길이가 5 이하인 문자열만 출력하는 프로그램을 람다 표현식을 사용하여 작성하세요.
		List<String> strings = Arrays.asList("Java", "C", "Python", "Spring");

		strings.stream()
			.filter(e -> e.length() <= 5)
			.forEach(s -> System.out.println(s));
	}
}