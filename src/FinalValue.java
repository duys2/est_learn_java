public class FinalValue {
	public static void main(String[] args) {
		Person3 person = new Person3("홍길동");

		person.introduce();
	}
}

class Person3 {
	String name;
	final int AGE = 30;
	final String GENDER = "남성";
	final String BIRTHDAY = "11월 11일";
	final String FROM = "조선";

	public Person3(String name) {
		this.name = name;
	}

	public void introduce() {
		System.out.println("저의 이름은 " + this.name);
		System.out.println("나이는 " + this.AGE);
		System.out.println("성별은 " + this.GENDER);
		System.out.println("생일은 " + this.BIRTHDAY);
		System.out.println("출신지는 " + this.FROM);
	}
}