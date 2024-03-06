package day3;

public class Reference {
    public static void main(String[] args) {
        Person p1 = new Person(); // 객체가 힙 메모리에 생성
        Person p2 = new Person();
        // 스택에 p1, p2가 생김
        // 객체 자체는 힙에 생김
        // 참조값(=주민번호)은 스택에 객체당 8바이트씩 생기는데 그것을 힙에서 참조해서 봄

        System.out.println(p1);
        System.out.println(p2);

        //사람 복사
        p1.name = "홍길동";
        p1.age = 20;
        p1.home = "서울";

        System.out.println(p1.name);

        Person p3 = p1; // 홍길동 정보를 p3에 복사
        System.out.println(p3.name);

        // 홍길동은 2명이 됐을까? // x
        System.out.println(p3); // 참조값 p1 == p3
        // 홍길동이 2명이 된건 아니고 p1, p3이 하나의 객체를 같이 바라보게됨.
        p3.name = "이순신";
        System.out.println(p3.name);
        System.out.println(p1.name);
        // 객체가 두개가 생긴것이 아니고 동일한 참조값 바이트가 두개가 생겼을 뿐이라
        // 결과적으로는 하나를 같이 보기때문에 p3의 값이 바뀌면 힙메모리에 값이 바뀌면서 자동으로 p1에서 값을 볼때 똑같이 바뀐게 보임.

        // 손흥민을 2명 만들어주세요. (단, 코드의 중복은 없어야 합니다.)
        Person p4 = new Person();
        p4.name = "손흥민";
        p4.age = 31;
        p4.home = "런던";

        Person p5 = new Person();
        p5.name = p4.name;
        p5.age = p4.age;
        p5.home = p4.home;

        p4.name = "손흥만";
        System.out.println(p4.name);
        System.out.println(p5.name); // 참조값이 다르고 객체도 별개이기에(객체 값만 복사했던 상황) 따라서 값이 변하지 않음

        // 객체의 복사
        // 참조값의 복사 → 얕은 복사
        // 객체값의 복사 → 깊은 복사

    }
}
