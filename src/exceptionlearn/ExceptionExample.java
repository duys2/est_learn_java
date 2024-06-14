package exceptionlearn;

public class ExceptionExample {
	public static void main(String[] args) {
		/*
		try {
			int result = 10 / 2;
			System.out.println(result);
			result = 10 / 0;
			System.out.println(result);
		} // ()안에 Exception클래스 변수(보통 e를 넣음)
		catch (ArithmeticException e) { // ArithmeticException: 숫자를 0으로 나누지 못하는 예외
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("정상적으로 종료되었습니다.");
		*/

		try {
			divide(10, 0);
		}
		/*
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		*/
		/*
		catch (ArithmeticException | NullPointerException e) { // 여러가지 예외 동시에 처리
			System.out.println("0으로 나눌 수 없습니다.");
		}
		*/
		// catch는 여러 개 들어갈 수 있다
		catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NullPointerException ex) {
			System.out.println("Null 입니다.");
		}
		System.out.println("정상적으로 종료되었습니다.");
	}

	private static int divide(int a, int b) {
		if (a / b == 0) {
			throw new ArithmeticException();
		} else {
			throw new NullPointerException();
		}
	}

	/*
	// throws: 예외를 자신을 호출한 곳으로 던짐
	private static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}
	*/

	// 강사님 코드
	/*public static void main(String[] args) {

		try {
			divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (NullPointerException ex) {
			System.out.println("null입니다.");
		}
		System.out.println("정상적으로 종료되었습니다.");
	}

	private static int divide(int a, int b) {
		if (a / b == 0) {
			throw new ArithmeticException();
		} else {
			throw new NullPointerException();
		}
	}*/
}