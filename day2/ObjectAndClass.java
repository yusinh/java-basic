package day2;

public class ObjectAndClass {
    public static void main(String[] args) {
        // 객체 : 폴더

        // 사람 표현
        // 이름, 나이, 거주지

        // 사람 1명
        String name = "홍길동";
        String name2 = "이순신";
        int age = 20;
        int age2 = 30;
        String home = "서울";
        String home2 = "부산";

        System.out.printf("%s사는 %d살 %s입니다.\n", name, age, home);
        System.out.printf("%s사는 %d살 %s입니다.\n", name2, age2, home2);

        // 이순신 정보 복사
        String name3 = name2;
        int age3 = age2;
        String home3 = home2;

        // ===================================================

        // 2.이력서 원본 복사 (=객체,오브젝트,인스턴스)
        Person1 p1 = new Person1();

        // 3.복사본에다가 홍길동의 정보를 기입
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";


        // 4.이력서 원본 복사
        Person1 p2 = new Person1();

        // 5.복사본에다가 이순신 정보를 기입
        p2.name = "이순신";
        p2.age = 30;
        p2.home = "부산";


        // 홍길동 자기소개
        System.out.printf("%s사는 %d살 %s입니다.\n", p1.home, p1.age, p1.name);

        // 이순신 자기소개
        System.out.printf("%s사는 %d살 %s입니다.\n", p2.home, p2.age, p2.name);

        // 객체 복사
        Person1 p3 = p2;
        System.out.println(p3.name);


        // ============================================================

        // 자동차 1개 생성
        Car1 c1 = new Car1();
        c1.model = "포르쉐";
        c1.price = 1000;
        c1.year = 12;

    }
}

// 1.새로운 클래스 생성
class Person1 {
    String name;  // 8바이트
    int age; // 4바이트
    String home; // 8바이트

}

class Car1 {
    String model;
    int year;
    int price;
}