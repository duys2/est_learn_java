public class OperatorLearn {
  public static void main(String[] args) {
    // int positive = 10;
    // int negative = -10;
    //
    // System.out.println("양의 부호 연산자 적용: " + (+positive)); // +는 없어도 차이는 없음
    // System.out.println("음의 부호 연산자 적용: " + (-positive));
    // System.out.println("음의 부호 연산자로 부호 반전: " + (-negative));
    // System.out.println("음의 부호 연산자로 다시 부호 반전: " + (-negative));

    // // 증가
    // int x = 5;
    // int y = 5;
    //
    // System.out.println("전위 증가 연산자: " + (++x));
    // System.out.println("후위 증가 연산자: " + (y++));
    //
    // System.out.println("===================");
    //
    // System.out.println("x는 " + x);
    // System.out.println("y는 " + y);

    // // 감소
    // int a = 100;
    // int b = 100;
    //
    // System.out.println("전위 감소 연산자: " + (--a));
    // System.out.println("후위 감소 연산자: " + (b--));
    // System.out.println("전위 감소 연산자: " + (--a));
    // System.out.println("후위 감소 연산자: " + (b--));
    // System.out.println("전위 감소 연산자: " + (--a));
    // System.out.println("후위 감소 연산자: " + (b--));

    // boolean isRainning = true;
    //
    // if (isRainning) {
    //   System.out.println("하늘에서 비가 와요.");
    // }
    // if(!isRainning) {
    //   System.out.println("김태희가 안 옵니다.");
    // }
    //
    // boolean isSunny = false;
    //
    // if (!isSunny) {
    //   System.out.println("날씨가 맑아요.");
    // }
    // else {
    //   System.out.println("집에서 쉬어야죠.");
    // }

    // // 크기 비교
    // int num1 = 28;
    // int num2 = 30;
    //
    // System.out.println(num1 > num2);
    // System.out.println(num1 >= num2);
    // System.out.println(num1 < num2);
    // System.out.println(num1 <= num2);
    //
    // System.out.println(num1 == num2);
    // System.out.println(num1 != num2);

    // // 논리 연산: &&(AND), ||(OR), ^(배타적 논리합, XOR)
    // System.out.println(true && true);
    // System.out.println(true && false);
    // System.out.println(false && true);
    // System.out.println(false && false);
    //
    // System.out.println(true || true);
    // System.out.println(true || false);
    // System.out.println(false || true);
    // System.out.println(false || false);
    //
    // System.out.println(true ^ true);
    // System.out.println(true ^ false);
    // System.out.println(false ^ true);
    // System.out.println(false ^ false);

    // i는 2의 배수이면서 3의 배수
    // i % 2 == 0 && i % 3 == 0

    // x는 30의 배수이면서 2의 배수이거나 5의 배수이다
    // x % 30 == 0 && (x % 2 == 0 || x % 5 == 0)
    // (x % 30 == 0) && ((x % 2 == 0 ) || (x % 5 == 0))

    // // 비트 연산
    // System.out.println(0b01111 & 0b11110);

    int score = 95;
    // char grade = (score > 90) ? 'A' : 'B';
    char grade;
    // String grade = (score == 95) ? ((score % 5 == 0) ? "good" : "bad") : "bad";
    if (score > 90) {
      grade = 'A';
    }
    else {
      grade = 'B';
    }
    System.out.println(grade);
  }
}
