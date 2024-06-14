package exceptionlearn;

public class BankAccount {
	private int balance = 0;

	public void withdraw(int amount) throws InsufficientBalanceException {
		if (balance < amount) {
			throw new InsufficientBalanceException("잔액이 부족합니다.");
		}
		balance -= amount;
	}
}