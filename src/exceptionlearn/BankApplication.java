package exceptionlearn;

public class BankApplication {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(); // 인스턴스 생성

		try {
			account.withdraw(10000);
		} // InsufficientBalanceException를 사용자 정의 예외(커스텀 익셉션)이라 한다.
		catch (InsufficientBalanceException e) { // 받은 에러를 e라는 변수가 가지고 있음
			System.out.println(e.getMessage());
		}
	}
}