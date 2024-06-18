package generic.quiz;

public class Test {
	public static void main(String[] args) {
		Car<String> stringCar = new Car<>();
		stringCar.set("Kia");
		System.out.println(stringCar.get());
	}
}