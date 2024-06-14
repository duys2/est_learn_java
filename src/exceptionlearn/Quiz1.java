package exceptionlearn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("두 개의 정수를 입력하세요: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			if (num2 == 0)
				throw new ArithmeticException();

			double result = (double)num1 / num2;
			System.out.println("result = " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해 주세요.");
		} finally {
			scanner.close();
		}
		*/

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("두 개의 정수를 입력하세요: ");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			System.out.println("result = " + num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다!");
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력해 주세요.");
		} finally {
			scanner.close();
		}

		/* 강사님 코드 */
		/*try {
			System.out.print("첫 번째 정수를 입력하세요: ");
			int num1 = scanner.nextInt();

			System.out.print("두 번째 정수를 입력하세요: ");
			int num2 = scanner.nextInt();

			int result = num1 / num2; // 나눗셈 수행
			System.out.println("결과: " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."); // ArithmeticException 처리
		} finally {
			scanner.close(); // scanner 자원 해제
		}*/
	}
}