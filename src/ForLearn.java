import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ForLearn {
  public static void main(String[] args) {
    // int total = 0;
    //
    // for (int i = 1; i <= 100; i++) {
    //   if (i % 2 == 0) total += i;
    // }
    //
    // // IntStream 사용
    // int total2 = IntStream.range(1, 101).filter(e -> e % 2 == 0).sum();
    //
    // System.out.println("짝수의 총합: " + total);
    // System.out.println("짝수의 총합: " + total2);

    /*
    사용자로부터 정수 n을 입력받아, 1부터 n까지의 정수 중에서 3의 배수이면서 5의 배수인 수의 합을 계산하여 출력하는 프로그램을 작성하세요.
    예시:

    입력: 20
    출력: 30

    설명:
    1부터 20까지의 정수 중에서 3의 배수이면서 5의 배수인 수는 15 하나뿐입니다. 따라서 출력 결과는 15의 합인 30입니다.
    이 문제에서는 for문을 사용하여 1부터 n까지의 정수를 순회하면서, 3의 배수이면서 5의 배수인 수를 찾아 그 합을 계산해야 합니다.
    */

    // // 입력 받기
    // Scanner sc = new Scanner(System.in);
    // System.out.print("숫자를 입력하세요: ");
    // int num = sc.nextInt(), total = 0;
    //
    // for (int i = 1; i <= num; i++) {
    //   if (i % 3 == 0 && i % 5 == 0) total += i + i;
    // }
    //
    // System.out.println(total);
    // System.out.println(IntStream.range(1, 21).filter(e -> (e % 3 == 0) && (e % 5 == 0)).sum() +
    // IntStream.range(1, 21).filter(e -> (e % 3 == 0) && (e % 5 == 0)).sum());

    // // 피보나치 수열
    // int[] arr = new int[10];
    // arr[0] = 1;
    // arr[1] = 1;
    //
    // for (int i = 2; i < arr.length; i++) {
    //   arr[i] = arr[i - 2] + arr[i - 1];
    //   System.out.print(arr[i] + " ");
    // }

    // for (int i = 100; i > 0; i--) System.out.println(i);

    // for (int i = 0; i >= -100; i--) if (i % 2 == 0) System.out.println(i);
    //
    // for (int i = 0; i < 100; i++)
    //   IntStream.rangeClosed(0, -100).filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

    // 크기 100짜리 피보나치 배열
    // int[] arr = new int[100];
    // arr[0] = 1;
    // arr[1] = 1;
    //
    // for (int i = 2; i < arr.length; i++) {
    //   arr[i] = arr[i - 2] + arr[i - 1];
    //   System.out.println(arr[i]);
    // }

    // int[] arr = new int[100];
    // arr[0] = 1;
    // arr[1] = 1;
    //
    // // 이것도 피보나치
    // Arrays.parallelSetAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]); // 이게 아니고
    // Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]); // 이게 맞다
    // System.out.println(arr[5]); // parallelSetAll()는 병렬로 처리하기 때문

    // 구구단 2단부터 9단까지
    // for (int i = 2; i < 10; i++)
    //   for (int j = 1; j < 10; j++)
    //     System.out.println("<" + i + "> x <" + j + "> = <" + i * j + ">");

    // IntStream 사용
    // IntStream.rangeClosed(2,9).forEach(i -> IntStream.rangeClosed(1, 9).forEach(j ->
    // System.out.println("<" + i + "> x <" + j + "> = <" + i * j + ">")));

    // 구구단 19단부터 역순으로
    // for (int i = 19; i >= 2; i--)
    //   for (int j = 19; j >= 1; j--)
    //     System.out.println("<" + i + "> x <" + j + "> = <" + i * j + ">");
    //
    // IntStream.rangeClosed(19, 2).forEach(i -> IntStream.rangeClosed(19, 1).forEach(j ->
    // System.out.println("<" + i + "> x <" + j + "> = <" + i * j + ">")));

    // for (int i = 0; i<10; i++) {
    //   System.out.println("현재 i의 값은 = " + i);
    //   for (int j=0; j<10; j++) {
    //     System.out.println("현재 j의 값은 = " + j);
    //     if(j == 5) break;
    //   }
    // }

    /*
    실습 문제: 이중 for문을 만든다. i -> 1~100, j -> 2-> 100
    i가 50이되면 break, j는 80되면  break;
    */
    // for (int i = 1; i < 100; i++) {
    //   System.out.println("현재 i의 값은 = " + i);
    //   if (i == 50) break;
    //   for (int j = 2; j < 100; j++) {
    //     System.out.println("현재 j의 값은 = " + j);
    //     if (j == 80) break;
    //   }
    // }

    // int number = 0;

    // while (number < 10) {
    //   number++;
    //   if (number == 3) {
    //     continue;
    //   } else {
    //     System.out.println("현재 숫자 : " + number);
    //   }
    // }

    // for (int i = 0; i < 10; i++) {
    //   if (number == 3) continue;
    //
    //   System.out.println("현재값은:" + number);
    // }

    // // 실습 문제: 1부터 10까지 숫자를 출력하세요. 이때 4와 7은 건너뛰고 출력합니다.
    // for (int i = 1; i <= 10; i++) {
    //   if (i == 4 || i == 7) continue;
    //   System.out.println("현재값은: " + i);
    // }

    // // 문제: 정수형 배열 scores가 주어졌을 때, 향상된 반복문을 사용하여 점수의 총합과 평균을 계산하는 코드를 작성하세요.d
    // int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    // int total = 0;
    // double  avg;
    //
    // for (int i : scores) {
    //   total += i;
    // }
    // avg = (double)total / scores.length;
    // System.out.println("총합: " + total);
    // System.out.println("평균: " + avg);

    // // 문제: 문자열 배열 names가 주어졌을 때, 향상된 반복문을 사용하여 이름의 길이가 5 이상인 이름만 출력하는 코드를 작성하세요.
    // String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
    //
    // for (String str : arr) {
    //   if (str.length() >= 5) System.out.println(str);
    // }
  }
}