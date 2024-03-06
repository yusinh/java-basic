package day3;

public class Parameter {


    //함수 정의할때는 값이 아니라 변수 입력
    public static void plus(int num1, int num2) { // 매개변수
        System.out.println(num1 + num2);

    }

    public static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public static void main(String[] args) {

        // 함수 호출할때는 인자(값) 입력
        plus(10, 20); // 10 + 20 결과를 출력
        plus(30, 40); // 30 + 40 결과를 출력

        multiply(10, 20); // 10 * 20 결과를 출력
        multiply(5, 5); // 5 * 5를 출력

        // 인자의 개수와 매개변수의 개수는 동일해야함.
    }
}
