package day1;

public class day1_exam {
    public static void main(String[] args) {
        //홀수와 짝수를 구별해주세요.
        // num이 짝수면 even, 홀수면 odd 출력해주세요.
        // 짝수 판별 : 2로 나누어서 떨어지면 짝수

        int num = 6;

        if(num % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
