package day2;

public class DoubleLoopExam5 {
    public static void main(String[] args) {
        int y = 3;
        for(int i = 1; i <= y; i++) {
            for(int j = 1; j < i * 2; j ++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // 출력
        /*


         *
         ***
         *****


         */

        y = 5;
        for(int i = 1; i <= y; i++) {
            for(int j = 1; j < i * 2; j ++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // 출력
        /*


         *
         ***
         *****
         *******
         *********


         */

        y = 7;
        for(int i = 1; i <= y; i++) {
            for(int j = 1; j < i * 2; j ++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // 출력
        /*


         *
         ***
         *****
         *******
         *********
         ***********
         *************


         */
    }
}
