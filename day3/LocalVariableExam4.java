package day3;

public class LocalVariableExam4 {
    // 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.
    static int num = 10;

    public static void main(String[] args) {

        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕
    }
    static String printValue(String a) {
        System.out.println(a);
        return a;
    }
}
