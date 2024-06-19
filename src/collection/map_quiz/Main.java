package collection.map_quiz;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		/*Map<Student, Integer> studentMap = new HashMap<>();

		Student student = new Student(50, "홍길동");
		Student student2 = new Student(50, "전우치");

		studentMap.put(student, 90); // 학생, 점수(값)
		studentMap.put(student2, 72);

		Set<Entry<Student, Integer>> entries = studentMap.entrySet();

		System.out.println("=====");

		for (Entry<Student, Integer> entry : entries) {
			Student key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("키: " + key);
			System.out.println("이름: " + key.getName());
			System.out.println("번호: " + key.getNo());
			System.out.println("점수: " + value);
			System.out.println("=====");
		}*/

		/*Map<Student, Integer> studentIntegerMap = new HashMap<>();

		studentIntegerMap.put(new Student(50, "홍길동"), 95);
		studentIntegerMap.put(new Student(50, "홍길동"), 95);

		System.out.println(studentIntegerMap.size());

		Set<Entry<Student, Integer>> entries = studentIntegerMap.entrySet();

		for (Entry<Student, Integer> entry : entries) {
			String name = entry.getKey().getName();
			int no = entry.getKey().getNo();
			Integer value = entry.getValue();
		}*/

		Map<String, String> map = new Hashtable<>();
		Scanner sc = new Scanner(System.in);

		map.put("spring", "qwer");
		map.put("summer", "qwer1234");
		map.put("fall", "qwer123");
		map.put("winter", "qwer123");

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디 : ");
			String id = sc.nextLine();

			System.out.println("비밀번호 : ");
			String password = sc.nextLine();

			System.out.println("=============");

			if (map.containsKey(id)) {
				String mapPassword = map.get(id);
				if (mapPassword.equals(password)) {
					System.out.println("로그인에 성공했습니다.");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}

			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
	}
}