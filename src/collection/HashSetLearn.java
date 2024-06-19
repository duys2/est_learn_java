package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetLearn {
	public static void main(String[] args) {
		// 제네릭 Integer
		Set<Integer> integerSet = new HashSet<>();

		integerSet.add(1);
		integerSet.add(2);
		integerSet.add(3);
		integerSet.add(4);
		integerSet.add(5);

		Iterator<Integer> iterator = integerSet.iterator();

		// 가져올 다음 객체가 있는 동안 반복: hasNext()는 가져올 객체가 있으면 true 반환
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // next()는 객체 가져오기
		}

		System.out.println();

		// foreach 문도 가능
		for (int a : integerSet) {
			System.out.println(a);
		}

		Set<String> stringSet = new HashSet<>();

		// // 뒤에 뭘 붙인다.
		// stringSet.add("okay"); // okay123
		// stringSet.add("okay"); // okay1123

		stringSet.add("Java");
		stringSet.add("Spring");
		stringSet.add("JSP");
		stringSet.add("Java");
		stringSet.add("DBMS");

		System.out.println(stringSet.size()); // 4 출력: "Java"가 겹치기 때문에

		stringSet.remove("Java");

		System.out.println(stringSet.size()); // 3 출력

		Iterator<String> stringIterator = stringSet.iterator();

		// 순서 보장 안 됨
		while (stringIterator.hasNext()) {
			System.out.println(stringIterator.next());
		}

		// stringSet.clear();

		if (stringSet.isEmpty()) {
			System.out.println("비어있습니다.");
		} else {
			System.out.println("비어있지 않습니다.");
		}
	}
}