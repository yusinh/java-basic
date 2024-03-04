package day1;

public class OPeratorExam1 {
    public static void main(String[] args) {
        if ( true ) {
            System.out.println("true 1");
        }

        if ( false ) {
            System.out.println("false 1");
        }

        int a = 10;
        // `==` => 같다.
        if ( a == 10 ) {
            System.out.println("true 2");
        }

        // `!=` => 같지 않다.
        if ( a != 10 ) {
            System.out.println("false 2");
        }

        if ( a > 10 ) {
            System.out.println("false 3");
        }

        if ( a >= 10 ) {
            System.out.println("true 3");
        }

        int b = 10;

        if ( a == b ) {
            System.out.println("true 4");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if ( c ) {
            System.out.println("false 4");
        }

        if ( c == false ) {
            System.out.println("true 5");
        }

        // `!` => 반전
        if ( !c ) {
            System.out.println("true 6");
        }

        // `!` => 반전
        if ( !(!c) ) {
            System.out.println("false 5");
        }

        boolean d = true;

        if ( c != d ) {
            System.out.println("true 7");
        }

    }
}
