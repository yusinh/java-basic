package day2;

public class Loop {
    public static void main(String[] args) {

        // 반복문을 이용해 동일한 명령을 여러번 실행

        //while(true) {
        //    System.out.println("실행");
        //}

        // 원하는 만큼만 반복
        int cnt = 0; // 반복횟수 세는 용도

        while(cnt < 5) { // 5번 반복
            System.out.println("실행");
            cnt++;
        }

        // for문
        for(int cnt = 0; cnt < 5; cnt++) {
            System.out.println("실행");
        }

    }
}
