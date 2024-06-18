package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// List<String> arrayList = new ArrayList<>();

		// arrayList.add("홍길동");
		// arrayList.add(0, "전우치");
		// // String s = arrayList.get(1); // 전우치
		// // arrayList.remove(1);
		// arrayList.add("홍길동");
		// arrayList.add("홍길동");
		// arrayList.add("홍길동");
		// arrayList.add("홍길동");
		// arrayList.add("홍길동");
		// arrayList.remove("홍길동"); // 처음 찾은 거만 삭제
		// arrayList.add(null);
		// // 일반 for 문
		// // for (int i = 0; i < arrayList.size(); i++) {
		// // 	System.out.println(arrayList.get(i));
		// // }
		//
		// // foreach 문
		// for(String str : arrayList) {
		// 	System.out.println(str);
		// }

		// arrayList.add("Java");
		// arrayList.add("Spring");
		// arrayList.add("Servlet/JSP");
		// arrayList.add("DBMS");
		// arrayList.add("JPA");
		//
		// System.out.println("총 객체 수: " + arrayList.size());
		//
		// System.out.println("두 번째 인덱스의 값: " + arrayList.get(2));
		//
		// System.out.println(arrayList.contains("java"));
		//
		// ArrayList<Object> objects = new ArrayList<>();
		// objects.add(null); // null 값도 값이다.
		// System.out.println(objects.isEmpty());
		// objects.clear();
		// System.out.println(objects.isEmpty());

		List<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();

		long startTime, endTime;

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arrayList.add(0, String.valueOf(i)); // 계속 시프트 일어남
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간: " + (endTime - startTime));

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요 시간: " + (endTime - startTime));
	}
}