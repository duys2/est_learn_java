public class Iphone implements Phone {
  @Override
  public void call() {
    System.out.println("아이폰으로 통화 중입니다.");
  }

  @Override
  public void name() {
    System.out.println("이 폰은 아이폰입니다.");
  }

  public static void main(String[] args) {
    Phone myPhone = new Iphone();
    myPhone.call();
    myPhone.name();
  }
}