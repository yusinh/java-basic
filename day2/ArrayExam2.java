package day2;

public class ArrayExam2 {
    public static void main(String[] args) {
        // 배열의 모든 요소를 세번 출력해주세요.
        int[] arr = {1,2,3,4,5};

        for(int j = 1; j <= 3; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
