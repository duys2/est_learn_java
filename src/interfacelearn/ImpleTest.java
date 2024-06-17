package interfacelearn;

public class ImpleTest {
	public static void main(String[] args) {
		InterfaceC impleC = new ImpleC();

		InterfaceA interfaceA = impleC;
		interfaceA.methodA();
		System.out.println();

		InterfaceB interfaceB = impleC;
		interfaceB.methodB();
		System.out.println();

		impleC.methodA();
		impleC.methodB();
		impleC.methodC();
	}
}