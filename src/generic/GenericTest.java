package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	public static void main(String[] args) {
		// <>안에가 제네릭: stringArrayList는 무조건 String 타입만 들어갈 수 있음
		ArrayList<String> stringArrayList = new ArrayList<>();

		// 아래에는 Animal 타입만 들어갈 수 있음 (Animal을 구현하는 Lion도 가능)
		ArrayList<Animal> animals = new ArrayList<>();

		List list = new ArrayList<>();
		// String o = (String)list.get(0);
		// Object o = list.get(0);

		// List<Animal> animalList = new ArrayList<>();
		// animalList.add(1); // 제네릭으로 체크


	}
}