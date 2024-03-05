package day2;

public class DoubleLoopExam1 {
    public static void main(String[] args) {
        // 문제 : 구구단 작성
        // 조건 : 짝수번째만 곱하기
        /* 출력예시 :

          2 * 2 = 4
          2 * 4 = 8
          2 * 6 = 12
          2 * 8 = 16

          ...

          9단까지 이런식으로 나오면 됩니다.

        */
        for(int dan = 1; dan <= 9; dan++) {
            for(int i = 2; i <= 9; i += 2) {
                System.out.printf("%d * %d = %d\n", dan, i, dan * i);
            }
        }
    }
}
