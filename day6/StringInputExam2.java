package day6;

import java.util.Scanner;

public class StringInputExam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        // 문자열 → 숫자 변환
        // System.out.println("100" + 100);
        // int convertedInt = Integer.parseInt("100"); // 숫자로만 이루어진 문자열이 아니면 에러가 난다.
        // System.out.println(convertedInt + 100); // 200

        System.out.print("나이를 입력해주세요 : ");

//        String age1 = scan.nextLine();
//        int intAge = Integer.parseInt(age1);

        int age1 = Integer.parseInt(scan.nextLine());

        System.out.print("이름을 입력해주세요 : ");
        String name2 = scan.nextLine();


        System.out.printf("안녕하세요 %d세 %s입니다.", age1, name2);

        // 버퍼 찌꺼기 때문에 입력 꼬이는 것 해결하는 방법
        // 1. 버퍼를 직접 비워준다.
        // 2. 입력을 nextLine으로 통일한다.
    }
}
