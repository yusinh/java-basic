package day2;

public class DoubleLoopExam3 {
    public static void main(String[] args) {

        int a = 3;

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        a = 5;

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        a = 7;

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // 출력
    /*
    높이 : [3]

    *
    **
    ***


    */

    /*

    높이 : [5]

    *
    **
    ***
    ****
    *****

    */

    /*

    높이 : [7]

    *
    **
    ***
    ****
    *****
    ******
    *******

    */
    }
}
