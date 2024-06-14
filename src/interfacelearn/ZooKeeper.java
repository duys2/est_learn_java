package interfacelearn;

public class ZooKeeper {
	/*
	// 오버로딩
	void feed(Tiger tiger) {
		System.out.println("feed meat");
	}

	// 오버로딩
	void feed(Lion lion) {
		System.out.println("feed fish");
	}
	*/

	void feed(Predator predator) {
		System.out.println("feed meet");
	}

	void feed2(Herbivore herbivore) {
		System.out.println("feed grace");
	}
}