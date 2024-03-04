package day1;

public class Print {
    public static void main(String[] args){
        // 숫자 출력
        System.out.println(100);
        System.out.println(200);

        // 문자 출력
        System.out.println("안녕");
        System.out.println("잘가");

        // 문자열 줄바꿈 : \n
        System.out.println("안녕하세요.\n반갑습니다.");

        // 문자 합치기 (+)
        System.out.println("안녕하세요 " + "유신형입니다");

        // 숫자 더하기 (+)
        System.out.println(100 + 200);

        // 문자열과 숫자 더하기 (+) : 서로의 형태가 같아야 더하기가 가능
        System.out.println("100"); // 문자
        System.out.println(100);  // 숫자

        System.out.println("100" + "200");
        System.out.println(100 + 200);

        // 문자 + 숫자 : 숫자를 문자화해서 붙임
        System.out.println("100" + 200);

        // 출력문을 이용해 더하기 식 표현하기
        System.out.println("100 + 200 = 300");
        // +연산자가 여러번 나오면 왼쪽부터 순차적으로 연산
        // 먼저 연산자 계산 원할때는 소괄호로 묶어주면 됨
        System.out.println("100 + 200 = " + (100 + 200));

        // 숫자 곱하기 (*)
        System.out.println(100 * 200);

        System.out.println("2 * 1 = " + (2 * 1) +
                "\n2 * 2 = " + (2 * 2) +
                "\n2 * 3 = " + (2 * 3) +
                "\n2 * 4 = " + (2 * 4) +
                "\n2 * 5 = " + (2 * 5) +
                "\n2 * 6 = " + (2 * 6) +
                "\n2 * 7 = " + (2 * 7) +
                "\n2 * 8 = " + (2 * 8) +
                "\n2 * 9 = " + (2 * 9));


    }
}
