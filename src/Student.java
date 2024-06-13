public class Student extends Person {
	int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

	public void say() {
		System.out.println("My name is " + name);
	}
}