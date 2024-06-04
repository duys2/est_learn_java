import java.util.stream.IntStream;

public class WhileLearn {
  public static void main(String[] args) {
    // int i = 1;
    //
    // while (i <= 5) {
    //   System.out.println(i);
    //   i++;
    // }

    // int count = 10;
    //
    // while (count >= 0) {
    //   System.out.println("현재 카운트 : " + count);
    //   count--;
    // }
    // System.out.println("카운트 종료");

    //   int n = 100, total = 0;
    //
    //   while (n > 0) {
    //     total += n;
    //     n--;
    //   }
    //   System.out.println(total);

    // int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    // int count = 0, total = 0;
    //
    // while (count < numbers.length) {
    //   total += numbers[count];
    //   count++;
    // }
    // System.out.println("평균값은 " + total / numbers.length);

    // int i = 0;
    //
    // while (i <= 300) {
    //   // 3의 배수만 출력(배수: 어떤 정수의 정수배, 따라서 0도 3의 배수)
    //   if (i % 3 == 0) System.out.println(i);
    //   i++;
    // }

    // int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
    // int i = 1, maxNumber = numbers[0];
    //
    // while (i < numbers.length) {
    //   if (maxNumber < numbers[i]) maxNumber = numbers[i];
    //   i++;
    // }
    // System.out.println("최대값: " + maxNumber);

    // int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    // int i = 0, sumP = 0, sumN = 0; // 양수: positive number, 음수: negative number
    //
    // while (i < numbers.length) {
    //   if (numbers[i] < 0) sumN += numbers[i];
    //   else sumP += numbers[i];
    //   i++;
    // }
    // System.out.println("양수의 합: " + sumP);
    // System.out.println("음수의 합: " + sumN);

    // int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    //
    // int posNum = IntStream.of(numbers).filter(num -> num > 0).sum();
    // int neNum = IntStream.of(numbers).filter(num -> num < 0).sum();
    //
    // System.out.println("양수합: " + posNum);
    // System.out.println("음수합: " + neNum);
  }
}