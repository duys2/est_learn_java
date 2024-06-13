public class Computer extends Calculator {

	@Override
	double areaCircle(double radius) {
		System.out.println("Computer 객체의 areaCircle 메서드 실행");
		return Math.PI * radius * radius;
	}

	@Override
	void say() {
		System.out.println("Hello Computer!");
	}
}