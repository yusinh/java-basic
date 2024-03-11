package day6;

import java.util.Scanner;

public class StringInputExam1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("이름을 입력해주세요 : ");
        String name = scan.nextLine();

        System.out.print("나이를 입력해주세요 : ");
        int age = scan.nextInt();

        System.out.printf("안녕하세요 %d세 %s입니다.", age, name);


        System.out.print("나이를 입력해주세요 : ");
        String age1 = scan.nextLine();

        scan.nextLine(); // 입력 버퍼 비우기(\n을 빼줌)

        System.out.print("이름을 입력해주세요 : ");
        String name2 = scan.nextLine();


        System.out.printf("안녕하세요 %d세 %s입니다.", age1, name2);

        // 버퍼 찌꺼기 때문에 입력 꼬이는 것 해결하는 방법
        // 1. 버퍼를 직접 비워준다.
        // 2. 입력을 nextLine으로 통일한다.

    }
}
