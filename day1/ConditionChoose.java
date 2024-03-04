package day1;

public class ConditionChoose {
    public static void main(String[] args) {

        // 택일 구조(else if)를 사용하면 연산상의 효율성과 조건식의 간결함을 얻을 수 있다.
        int age = 20;

        if (age <= 13){
            System.out.println("초등학생");
        }
        else if (age <= 16){
            System.out.println("중학생");
        }
        else if (age <= 19){
            System.out.println("고등학생");
        }
        else{
            System.out.println("성인");
        }

        // else는 마지막에 조건을 생략하고 사용


    }
}
