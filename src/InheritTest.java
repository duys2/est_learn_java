public class InheritTest {
	public static void main(String[] args) {
		// InheritB inheritB = new InheritB();
		//
		// inheritB.field2 = "필드2";
		// inheritB.method2();
		//
		// inheritB.field1 = 100;
		// inheritB.method1();

		// Child child = new Child();

		// child.save();
		// child.invest();

		// Tiger tiger = new Tiger(10);
		//
		// tiger.setName("호식이");
		//
		// // 아래 둘은 다른 메서드: 메서드 오버로딩
		// tiger.sleep();
		// tiger.sleep(2);

		// Student student = new Student("jj", "wwb993", 1);
		// student.say();

		// Child child = new Child();
		//
		// child.method1();
		// child.method2();
		// child.method3();

		// Calculator calculator = new Calculator();
		// Computer computer = new Computer();
		//
		// computer.say();
		//
		// System.out.println("원의 면적: " + calculator.areaCircle(10));
		// System.out.println();
		// System.out.println("원의 면적: " + computer.areaCircle(10));

		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
	}
}