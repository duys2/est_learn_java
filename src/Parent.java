public class Parent {
	int money = 0;

	public void save () {
		this.money += 10000;
		System.out.println("10000원 저축했습니다.");
		System.out.println("현재 금액은 " + money + "원입니다.");
	}

	void method1() {
		System.out.println("Parent 메서드1 호출");
	}

	void method2() {
		System.out.println("Parent 메서드2 호출");
	}
}