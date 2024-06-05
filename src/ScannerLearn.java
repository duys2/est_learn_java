import java.util.*;

public class ScannerLearn {
  public static void main(String[] args) {
    /* 사용자의 입력을 받는 프로그램 작성해 보기 */

    // // Scanner
    // Scanner sc = new Scanner(System.in); // 값 입력 완료전에는 계속 런타임 상태
    //
    // System.out.print("정수를 입력해 주세요: ");
    // int number = sc.nextInt(); // 정수형으로 받아서 number 변수에 저장
    //
    // sc.nextLine(); // 문자열 받을 때 사용
    //
    // System.out.print("문자열을 입력하세요: ");
    //
    // String line = sc.nextLine();
    //
    // System.out.println("정수는 = " + number);
    // System.out.println("문자열은 = " + line);
    //
    // sc.close();

    /* 문제:
    "계절을 맞춰보세요!"라는 자바 프로그램을 작성해보세요.
    사용자에게 1에서 4 사이의 숫자를 입력하라고 요청합니다.
    각 숫자는 계절을 나타냅니다: 1은 봄, 2는 여름, 3은 가을, 4는 겨울입니다.
    사용자가 숫자를 입력하면, 프로그램은 해당 계절의 이름을 출력해야 합니다. 만약 사용자가 1에서 4 사이의 숫자가 아닌 것을 입력하면, "잘못된 입력입니다!"라고 출력해야 합니다.
    이 문제를 해결하기 위해 switch 문을 사용하세요.*/
    // Scanner sc = new Scanner(System.in);
    //
    // System.out.print("1부터 4 사이의 숫자를 입력하세요: ");
    //
    // int num = sc.nextInt();
    // sc.nextLine();
    //
    // switch (num) {
    //   case 1:
    //     System.out.println("봄");
    //     break;
    //   case 2:
    //     System.out.println("여름");
    //     break;
    //   case 3:
    //     System.out.println("가을");
    //     break;
    //   case 4:
    //     System.out.println("겨울");
    //     break;
    //   default:
    //     System.out.println("잘못된 입력입니다!");
    //     break;
    // }
    //
    // sc.close();

    // // Random
    // Random random = new Random();
    //
    // int num = random.nextInt(100) + 1; // 1부터 100까지의 난수
    //
    // System.out.println(num);

    /*퀴즈: 로또 번호 생성기
    로또 번호 생성기 프로그램을 작성하세요.
    이 프로그램은 1부터 45까지의 숫자 중 중복되지 않는 6개의 숫자를 무작위로 선택하여 출력합니다.

    요구사항:
    1. Random 클래스를 사용하여 난수를 생성해야 합니다.
    2. ~~생성된 로또 번호는 오름차순으로 정렬되어 출력되어야 합니다.~~
    3. 생성된 로또 번호는 서로 중복되지 않아야 합니다.
    4. 출력 형식은 다음과 같아야 합니다:
    로또 번호: [번호1] [번호2] [번호3] [번호4] [번호5] [번호6]

    힌트:
    - 1부터 45까지의 숫자를 리스트나 배열에 저장하고, 해당 리스트에서 난수를 생성하여 번호를 선택할 수 있습니다.
    - 중복을 방지하기 위해 선택된 번호는 리스트에서 제거하거나, Set 자료구조를 사용할 수 있습니다.
    - ~~정렬에는 Arrays.sort() 메서드를 사용할 수 있습니다.~~
    */
    // Random random = new Random();
    //
    // ArrayList<Integer> lottoList = new ArrayList<Integer>(); // wrapper class만 들어감
    // /*
    // 박싱 (자료형 → 래퍼 클래스)
    // int → Integer
    // boolean → Boolean
    // double → Double
    // */
    // // Set<Integer> integersSet = new HashSet<>();
    // // lottoList.size();
    // // lottoList.add(1);
    // // if (lottoList.contains(1)) {}
    //
    // while (lottoList.size() != 6) {
    //   int number = random.nextInt(45) + 1;
    //
    //   if (!lottoList.contains(number)) {
    //     lottoList.add(number);
    //   }
    // }
    //
    // Collections.sort(lottoList);
    //
    // for (int data : lottoList) {
    //   System.out.print(data + " ");
    // }

    /* 아래는 Set */
    // Set<Integer> set = new HashSet<>();
    //
    // while (set.size() != 6) {
    //   int number = random.nextInt(45) + 1;
    //   set.add(number);
    // }

    /* 문제
    사용자가 1부터 100 사이의 숫자를 맞추는 게임을 만들어 보세요. 프로그램은 먼저 1부터 100 사이의 무작위 숫자를 생성합니다.
    그런 다음 사용자에게 숫자를 입력하라고 요청합니다. 사용자가 숫자를 입력하면,
    프로그램은 사용자가 입력한 숫자가 무작위로 생성된 숫자보다 높은지, 낮은지, 아니면 정확히 맞는지를 알려줍니다.
    사용자가 정확한 숫자를 맞출 때까지 이 과정을 반복합니다. 숫자를 맞추면 "정답입니다!"라고 출력하고 게임을 종료합니다.
    */
    Scanner scanner = new Scanner(System.in);
    int randomNum = (new Random()).nextInt(100) + 1;

    while (true) {
      System.out.print("숫자을 입력하세요: ");
      int num = scanner.nextInt();
      scanner.nextLine();

      if (num > randomNum) {
        System.out.println("숫자가 더 큽니다!");
      } else if (num < randomNum) {
        System.out.println("숫자가 더 작습니다!");
      } else break;
    }

    System.out.println("정답입니다!");

    scanner.close();
  }
}
