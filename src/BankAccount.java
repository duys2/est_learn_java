public class BankAccount {
  private String accountNumber;
  private String ownerName;
  private double balance = 0;

  public BankAccount(String accountNumber, String ownerName) {
    this.accountNumber = accountNumber;
    this.ownerName = ownerName;
    this.balance = 0.0;
  }

  public void deposit(int amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println(amount + "원이 입금되었습니다.");
    } else {
      System.out.println("정확한 금액을 입력해 주세요.");
    }
  }

  public void withdraw(int amount) {
    if (amount <= balance) {
      balance -= amount;
      System.out.println(amount + "원 출금되었습니다.");
    } else {
      System.out.println("잔액이 부족합니다.");
    }
  }

  public void printBalance() {
    System.out.println("현재 잔액은 " + balance + "원입니다.");
  }
}
