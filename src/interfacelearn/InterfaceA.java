package interfacelearn;

public interface InterfaceA {
	void methodA();

	// default 메서드
	default void showA() {
		System.out.println("okay");
	}
}