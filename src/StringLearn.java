public class StringLearn {
  public static void main(String[] args) {
    // // 문자열 변수 선언 및 초기화
    // String firstName = "Yu Seok";
    // String secondName = "An";
    // String phone = "Galaxy";
    // String status = "Happy";
    //
    // // 문자열 연산 (더하기)
    // System.out.println("저는 " + secondName + " " + firstName + "이고, 휴대폰은 " + phone + "이며, 상태는 " +
    // status + "입니다.");
    // // 번개 모양 예외
    // System.out.println(firstName.length()); // 길이 반환
    // System.out.println(firstName.toUpperCase()); // 대문자로
    // System.out.println(firstName.toLowerCase()); // 소문자로
    // System.out.println(firstName.equals(secondName)); // 둘이 같은지 반환
    // System.out.println(firstName == secondName);

    // String str1 = "hello";
    // String str2 = new String("hello");
    //
    // // equals()를 쓰는 이유: 서로 다른 객체를 참조하는 변수라서 서로 다른 객체를 가리킴.
    // // 즉, 서로 다른 주소를 가지고 있기에 == 연산에서 메모리 주소값을 비교하므로 false 가 나옴
    // System.out.println(str1.equals(str2)); // true
    // System.out.println(str1 == str2); // false

    // // indexOf()
    // String a = "Hello World!";
    // System.out.println(a.indexOf("!"));
    // System.out.println(a.indexOf("l"));
    // System.out.println(a.indexOf("g"));

    // String str = "Hello World";
    // System.out.println(str.contains("Wor"));

    //  // 실습 문제: ESTSOFT를 b라는 변수에 담고 SOFT가 포함되는지 확인
    // String b = "ESTSOFT";
    //  System.out.println(b.contains("SOFT"));

    // String findChar = "What is your hobby";
    // // char 형이라서 ""을 넣어주면 강제로 문자열로 됨
    // System.out.println(""+findChar.charAt(13)+findChar.charAt(14)+findChar.charAt(15)+findChar.charAt(16)+findChar.charAt(17));

    // String a = "Hello World!";
    // System.out.println(a.replaceAll("World", "Spring"));

    // String str = "WEEE ASKE ; ND";
    // System.out.println(str.substring(3, 9)); // (시작 인덱스, 종료 인덱스): 종료 인덱스 전까지 실행. 고로 끝 인덱스는 +1 해줘야
    // 함
    // // substring(): 원본 데이터를 훼손시키지 않기 위해
    // System.out.println(str.length());
    // System.out.println(str.substring(0, 3) + str.substring(7, 9) + str.substring(12,
    // str.length())); // str.substring(12, str.length()) 보다는 str.substring(12) 끝 인덱스를 생략하면 시작 인덱스부터
    // 끝까지 실행

    // String a = "a:b:c:d";
    // String[] split = a.split(":");// result는 {"a", "b", "c", "d"}
    // for (int i = 0; i < split.length; i++) {
    //   System.out.println(split[i]);
    // }
    //
    // String[] split2 = a.split("c");// result는 {"a", "b", "c", "d"}
    // for (int i = 0; i < split2.length; i++) {
    //   System.out.println(split2[i]);
    // }

    // String result = "Hello";
    // System.out.println(result.concat(" World!"));   // 결과 : Hello!
    // String concat = result.concat(" World!"); // 반환하기에 다른 변수에 할당해야 함
    // System.out.println(result);
    // System.out.println(concat);
    // result = result.concat(" World!"); // 이렇게 재할당해도 됨
    // System.out.println(result);

    // String name1 = "Tim";
    // int age1 = 30;
    //
    // String name2 = "Anna";
    // int age2 = 45;
    //
    // String format1 = String.format("%s의 나이는 %s세입니다.", name1, age1);
    // String format2 = String.format("%s의 나이는 %s세입니다.", name2, age2);
    //
    // System.out.println(format1);
    // System.out.println(format2);

    // String result = "";
    //
    // result += "Hello";
    // result += "Java";
    // result += "World";
    // System.out.println(result);
    // // 이런 방법은 새롭게 더 붙이면서 하기에 메모리를 더 소모한다
    //
    // // 문자열을 이어 붙일 때는 무조건 스트링 빌더 & 버퍼
    // StringBuilder builder = new StringBuilder();
    // builder.append("Hello");
    // builder.append("Java");
    // builder.append("World");
    // System.out.println(builder);
    // // System.out.println(builder.toString()); // 뒤에 .toString() 생략 가능
    //
    // StringBuffer buffer = new StringBuffer();
    // buffer.append("Hello"); // 뒤에 추가
    // buffer.append("Java");
    // buffer.append("World");
    // System.out.println(buffer);

    // StringBuffer sb = new StringBuffer();
    // sb.append("Hello");
    //
    // sb.insert(0, "World");
    // sb.insert(0, "World");
    // sb.insert(0, "World");
    // sb.insert(0, "World");
    // System.out.println(sb);

    // sb.insert(1, "World");
    // System.out.println(sb);


  }
}
