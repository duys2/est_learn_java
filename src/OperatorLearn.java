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

    boolean isRainning = true;

    if (isRainning) {
      System.out.println("하늘에서 비가 와요.");
    }
    if(!isRainning) {
      System.out.println("김태희가 안 옵니다.");
    }

    boolean isSunny = false;

    if (!isSunny) {
      System.out.println("날씨가 맑아요.");
    }
    else {
      System.out.println("집에서 쉬어야죠.");
    }
  }
}
