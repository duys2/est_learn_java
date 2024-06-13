public class Tiger extends Animal {
	// 다른 메서드: 오버로딩
	int age;

	void sleep(int times) {
		System.out.println(name + "Zzz... " + times + " hours");
	}

	public Tiger(int age) {
		super("okay", "남");
		this.age = age;
	}
}