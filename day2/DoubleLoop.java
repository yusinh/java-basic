package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        for(int j = 1; j <= 3; j++) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        }

        // 구구단 2 ~ 9단 출력

        for(int i = 2; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }

        // 2단 8번 만들기

        for(int i = 1; i <= 8; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("2 * %d = %d\n", j, 2 * j);
            }
        }
    }
}
