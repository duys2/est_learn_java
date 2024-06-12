public class Person2 {
	String name;
	int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void sayHello() {
		System.out.println("Hello my name is " + this.name);
	}

	public void introduce() {
		System.out.println("I am " + this.age + " years old.");
	}

	public static void main(String[] args) {
		Person2 person1 = new Person2("John", 23);
		Person2 person2 = new Person2("Kavin", 27);

		person1.sayHello();
		person1.introduce();

		person2.sayHello();
		person2.introduce();
	}
}