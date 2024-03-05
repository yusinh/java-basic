package day2;

public class DoubleLoopExam4 {
    public static void main(String[] args) {
        int height = 7;

        for(int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
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
