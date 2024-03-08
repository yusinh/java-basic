package day5;
// 오리 시뮬레이션을 구성을 이용해 중복없이 아래와 같이 출력되게 해주세요.
// 힌트 : 오리에게 날개와 발을 부여하고 날때는 날개를 헤엄칠 때는 발을 사용하게 해보세요.
public class DuckExam1_2 {
    public static void main(String[] args) {
    그냥오리 a그냥오리 = new 그냥오리();
    a그냥오리.날다(); // 오리가 날아갑니다.
    a그냥오리.헤엄치다(); // 오리가 헤엄칩니다.

    뚱뚱오리 a뚱뚱오리 = new 뚱뚱오리();
    a뚱뚱오리.날다(); // 날다가 떨어집니다.
    a뚱뚱오리.헤엄치다(); // 오리가 헤엄칩니다.

    날씬오리 a날씬오리 = new 날씬오리();
    a날씬오리.날다(); // 오리가 날아갑니다.
    a날씬오리.헤엄치다(); // 오리가 떠내려갑니다.

    게으른오리 a게으른오리 = new 게으른오리();
    a게으른오리.날다(); // 날다가 떨어집니다.
    a게으른오리.헤엄치다(); // 오리가 떠내려갑니다.
    }
}

abstract class 날개아이템 {
    abstract void 사용();
}
class 그냥날개 extends 날개아이템 {
    void 사용() {
        System.out.println("오리가 날아갑니다.");
    }
}
class 비실날개 extends 날개아이템 {
    void 사용() {
        System.out.println("날다가 떨어집니다.");
    }
}
abstract class 발아이템 {
    abstract void 사용();
}
class 그냥발 extends 발아이템 {
    void 사용() {
        System.out.println("오리가 헤엄칩니다.");
    }
}
class 비실발 extends 발아이템 {
    void 사용() {
        System.out.println("오리가 떠내려갑니다.");
    }
}
class 오리 {
    날개아이템 a날개 = new 그냥날개();
    발아이템 a발 = new 그냥발();
    void 날다() {
        a날개.사용();
    }
    void 헤엄치다() {
        a발.사용();
    }
}
class 그냥오리 extends 오리{
}
class 뚱뚱오리 extends 오리{
    public 뚱뚱오리() {
        a날개 = new 비실날개();
    }
    public void 날다() {
        a날개.사용();
    }
}
class 날씬오리 extends 오리{
    public 날씬오리() {
        a발 = new 비실발();
    }
    void 헤엄치다() {
        a발.사용();
    }
}
class 게으른오리 extends 뚱뚱오리 {
    public 게으른오리() {
        a발 = new 비실발();
    }
    void 헤엄치다() {
        a발.사용();
    }
}