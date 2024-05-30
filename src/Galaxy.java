public class Galaxy implements Phone {

  @Override
  public void call() {
    System.out.println("갤럭시로 통화 중입니다.");
  }

  @Override
  public void name() {
    System.out.println("이 폰은 갤럭시입니다.");
  }

  public static void main(String[] args) {
    Phone myPhone = new Galaxy();
    myPhone.call();
    myPhone.name();
  }
}