import java.util.Scanner;

public class FunctionLearn {
  public static void main(String[] args) {
    /*
    Test2 test2 = new Test2();

    System.out.println(test2.b);
    System.out.println(test2.good());

    Test2.call(); // static method: 인스턴스(클래스로 생성된 객체)를 만들지 않아도 호출 가능
    // test2 = null; // 가비지 컬렉터가 힙에서 안 쓰는 객체 삭제

    System.out.println(test2.add(3,5));
    System.out.println(test2.sub(9,7));
    */

    Person ys = new Person("유석", 01000000001, 26, 24000);
    // Person cs = new Person("철수", 01000000002, 24, 136000);
    // Person yh = new Person("영희", 01000000003, 29, 925000);
    // Person mg = new Person("맹구", 01000000004, 20, 5000);
    //
    // ys.sayHello();
    // cs.sayHello();
    // yh.sayHello();
    // mg.sayHello();
    //
    // ys.sayMoney();

    // Student student = new Student();
    //
    // ys.teaching(student);
    // ys.cheating(student);

    Scanner scanner = new Scanner(System.in);

    System.out.print("계좌번호를 입력하세요: ");
    String accountNumber = scanner.nextLine();
    System.out.print("소유자 이름을 입력하세요: ");
    String ownerName = scanner.nextLine();
    BankAccount account = new BankAccount(accountNumber, ownerName);

    account.deposit(100000);
    account.withdraw(40000);

    account.printBalance();

    scanner.close();
  }

  // static int sum(int a, int b) {
  //   return a + b;
  // }
  //
  // static int minus(int a, int b) {
  //   return a - b;
  // }
  //
  // static int multiply(int a, int b) {
  //   return a * b;
  // }
  //
  // static int divide(int a, int b) {
  //   return a / b;
  // }
  //
  // static void login(String email, String password) {
  //
  // }
}
