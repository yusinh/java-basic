package day2;

public class IncDecOperator {
    public static void main(String[] args) {

        //증감연산자
        int num = 10;
        System.out.println(num+5);
        System.out.println(num);

        // 변수의 값을 증가시키고 싶다.
        num = num + 5;
        num += 5; // 형식만 다를뿐 위와 같은 표현

        // 변수의 값을 3 감소시키고 싶다.
        num = num - 3;
        num -= 3; // 형식만 다를뿐 위와 같은 표현

        num += 1; // 증가값이 1인 경우에 한해서는 num++ 라고 쓸 수 있다.
        num++; // 형식만 다를뿐 위와 같은 표현
        num--; // 1씩 감소되는 표현
    }
}
