public class Test2 {
  public static void call() {
    System.out.println("call");
  }

  private int a = 1;

  public String b = "hello";

  public String good() {
    test();

    return "okay";
  }

  private void test() {
    System.out.println("test");
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }
}
