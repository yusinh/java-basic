package day1;

public class Variable {
    public static void main(String[] args){
        // 변수 : 데이터를 저장하는 공간

        // 변수 선언 (변수 타입 변수명)

        // 숫자형 변수
        // int : 정수
        int number;

        //변수에 값 저장
        number = 26; // 변수가 왼쪽, 값이 오른쪽
        // 40 = number; // 안됨

        int number2;

        // number2 = "유신형"; // 숫자 변수에 문자를 저장하려고 하면 안됨

        //String : 자바에서 문자열을 의미
        String str;
        str = "유신형";

        // 변수에 저장되어 있는 값을 사용
        // 변수명을 값처럼 사용
        System.out.println(number);
        System.out.println(number);
        System.out.println(str);
        System.out.println(str);

        String i = "안녕하세요. 26살 유신형입니다.";
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);
        System.out.println(i);

        String name = "유신형";
        int age = 24;

        System.out.println("안녕하세요. 만" + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. 만" + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. 만" + age + "살 " + name + "입니다.");
        System.out.println("안녕하세요. 만" + age + "살 " + name + "입니다.");

        // 변수 주의사항
        // 변수명은 중복되지 않도록 지어야 한다.
        // 변수명은 숫자로 시작하면 안된다.
        // 변수는 재활용 가능하다.
    }
}
