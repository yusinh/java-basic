package day3;

public class LocalVariableExam2 {
    public static void main(String[] args) {
        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.

        // 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
        // 각 자동차가 자신의 최고속력으로 달리게 해주세요.

        Car1 c1 = new Car1();
        c1.go(20);

        Car1 c2 = new Car1();
        c1.go(100);




    }
}

class Car1 {
    int go(int i) {
        System.out.println("자동차가 최고속력 " + i + "로 달립니다.");
        return i;
    }
}