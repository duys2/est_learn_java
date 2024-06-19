package collection;

import java.util.HashSet;
import java.util.Set;

public class MemberTest {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();

		set.hashCode();
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		System.out.println("총 객체수: " + set.size());
	}
}