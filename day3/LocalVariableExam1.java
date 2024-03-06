package day3;

public class LocalVariableExam1 {
    public static void main(String[] args) {

        // 문제 : 자동차 클래스를 만들고 함수를 이용해 다음과 같이 출력해주세요.
        // 1. 자동차가 자신의 최고속력으로 달리게 해주세요.

        Car.speed = 220;
        Car.run();
        // 출력 : 자동차가 최대속력 220km로 달립니다.

        // 2. 두 자동차가 자신의 최고속력으로 달리게 해주세요.
        Car.speed = 220;
        Car.run();
        // 출력 : 자동차가 최대속력 220km로 달립니다.

        Car.speed = 250;
        Car.run();
        // 출력 : 자동차가 최대속력 250km로 달립니다.
    }
    }


class Car {
    static int speed; // 객체를 생성하지 않았으니까 복사를 할 수 없음. 따라서 static을 붙임으로써 하나를 다같이 사용.
    static void run() {
        System.out.println("자동차가 최대속력 " + speed + "km로 달립니다.");
    }
}