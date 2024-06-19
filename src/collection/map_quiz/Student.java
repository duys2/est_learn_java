package collection.map_quiz;

import java.util.Objects;

public class Student {
	private int no;
	private String name;

	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Student student = (Student)o;
		return no == student.no && Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}
}