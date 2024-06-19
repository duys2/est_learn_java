package collection;

public class Member {
	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Member) {
			Member member = (Member)o;
			return member.name.equals(this.name) && member.age == this.age;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// hashCode(): 해시코드 추출, 특정 숫자값으로 변환
		int i = name.hashCode() + age;
		System.out.println(i);
		return i;
		// return Objects.hash(name, age);
	}
}