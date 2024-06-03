public class IfLearn {
  public static void main(String[] args) {
    // int number = 10;
    //
    // if (number > 10) {
    //   System.out.println("number는 10보다 큽니다.");
    // } else if (number < 10) {
    //   System.out.println("number는 10보다 작습니다.");
    //   if (number > 5) {
    //     System.out.println("number는 5보다 큽니다.");
    //   }
    // } else {
    //   System.out.println("number는 10입니다.");
    // }

    // int a = 5, b = 3;

    // // if-else문
    // if (a > b) {
    //   System.out.println("a is greater than b");
    // } else if (a == b) {
    //   System.out.println("a and b are equal");
    // } else {
    //   System.out.println("a is less than b");
    // }

    // // 삼항 연산자
    // System.out.println((a > b) ? "a is greater than b" : ((a == b) ? "a and b are equal" : "a is
    // less than b"));

    /*
       퀴즈
       1. 변수 x에 10이 저장되어 있습니다. x가 양수인지, 음수인지, 아니면 0인지를 판별하는 코드를 작성하세요. (삼항연산자)
       2. 변수 score에 75가 저장되어 있습니다. score에 따라 학점을 출력하는 코드를 작성하세요.
           - 90점 이상: A
           - 80점 이상 90점 미만: B
           - 70점 이상 80점 미만: C
           - 60점 이상 70점 미만: D
           - 60점 미만: F
       3. 변수 year에 2023이 저장되어 있습니다. year가 윤년인지 아닌지를 판별하는 코드를 작성하세요.
            - 윤년의 조건: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수인 해
       4. 변수 a에 10, b에 20, c에 30이 저장되어 있습니다. 세 변수 중 가장 큰 값을 출력하는 코드를 작성하세요.
       5. 변수 passScore에 60이 저장되어 있습니다. 변수 myScore에 75가 저장되어 있을 때, myScore가 passScore 이상인지 판별하여 합격/불합격을 출력하는 코드를 작성하세요.
    */

    // /* 1번 */
    // int x = 10;
    //
    // if (x > 0) {
    //   System.out.println("x는 양수입니다.");
    // } else if (x < 0) {
    //   System.out.println("x는 음수입니다.");
    // } else {
    //   System.out.println("x는 0입니다.");
    // }
    //
    // System.out.println((x > 0) ? "x는 양수입니다." : ((x < 0) ? "x는 음수입니다." : "x는 0입니다."));
    //
    // /* 2번 */
    // int score = 75;
    //
    // if (score > 90) {
    //   System.out.println('A');
    // } else if (score > 80) {
    //   System.out.println('B');
    // } else if (score > 70) {
    //   System.out.println('C');
    // } else if (score > 60) {
    //   System.out.println('D');
    // } else {
    //   System.out.println('E');
    // }
    //
    // /* 3번 */
    // int year = 2023;
    //
    // if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
    //   System.out.println("윤년입니다.");
    // }
    //
    // /* 4번 */
    // int a = 10, b = 20, c = 30;
    //
    // if (a > b && a > c) {
    //   System.out.println("a가 가장 큽니다.");
    // } else if (a > b && a < c) {
    //   System.out.println("c가 가장 큽니다.");
    // } else {
    //   System.out.println("b가 가장 큽니다.");
    // }
    //
    // /* 5번 */
    // int passScore = 60, myScore = 75;
    //
    // if (passScore <= myScore) {
    //   System.out.println("합격");
    // } else {
    //   System.out.println("불합격");
    // }
    //
    // System.out.println((passScore <= myScore) ? "합격" : "불합격");

    // int a = 10;
    // int b = 5;
    //
    // boolean result1 = (a > 5) && (b < 10);
    // boolean result2 = (a > 5) || (b > 10);
    // boolean result3 = !(a > 5);

    // 논리연산자 실습
    boolean x = true, y = false, z = true;

    if (x && !y) {
      System.out.println("조건 1 충족");
    }
    if ((y && z) || (!x && !z)) {
      System.out.println("조건 2 충족");
    }
    if (x || y || z) {
      System.out.println("적어도 하나는 참");
    }
    if (!x && !y && !z) {
      System.out.println("모두 거짓");
    }
  }
}
