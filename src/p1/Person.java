package p1;

public class Person {
  String name;
  int phoneNumber;
  int age;
  int money;

  public Person(String name, int phoneNumber, int age, int money) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.age = age;
    this.money = money;
  }

  public void sayHello() {
    System.out.println("My name is " + name + " and I am " + age + " years old.");
  }

  public void sayMoney() {
    System.out.println("내가 가지고 있는 돈은 " + money * 10000 + "원이야!");
  }

  public void teaching(Student student) { // 파라미터로 p1.Student 클래스를 받음
    student.levelUp();
  }

  public void cheating(Student student) {
    student.levelDown();
  }

  protected void testMethod(){
    System.out.println("test");
  }
}
