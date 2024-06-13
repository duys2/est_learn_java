public class Child extends Parent {
	public void invest() {
		if (money >= 1000) {
			money -= 1000;
			System.out.println("1000원 투자했습니다.");
			System.out.println("현재 남은 금액은 " + money + "원입니다.");
		} else {
			System.out.println("잔고가 부족합니다.");
		}
	}

	// 메서드 오버라이딩(재정의)
	void method2() {
		System.out.println("Child 메서드2 호출");
	}

	void method3() {
		System.out.println("Child 메서드3 호출");
	}
}