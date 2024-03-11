package day6;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {
        // 배열의 단점

        int[] arr = new int[10]; // 방 번호 : 0 ~ 9
        arr[0] = 10; // 0번째 인덱스 사용
//        arr[10] = 100; // 10번째 인덱스 사용. x 10개 방을 생성했기에 방 번호는 9에서 끝남

        // 배열은 크기가 고정이라 유연하지 못함.

        // 동적배열 → 길이를 정하지 않고 유종적으로 변하게 함.
        // 동적배열(ArrayList)은 객체만 저장 가능

        // 원시타입 → int, double, boolean 등
        // 원시타입을 제외한 자바의 모든 것은 객체다.
        // 원시타입의 객체타입 존재.
        // int → Integer, double → Double, boolean → Boolean

        ArrayList<Integer> list = new ArrayList<>(); // int ArrayList

        // 값 추가하기
        list.add(10);  // 0번째 인덱스에 10을 저장
        list.add(20);  // 1번째 인덱스에 10을 저장
        list.add(30);  // 2번째 인덱스에 10을 저장

        // 값 가져오기
        int rst = list.get(1);
        System.out.println(rst);

        // 값 삭제하기
        list.remove(1); // 1번째 인덱스의 값을 삭제. 중간인덱스가 삭제되면 뒤의 인덱가 앞으로 땡겨진다.
        System.out.println(list.get(1)); // 30
//        System.out.println(list.get(2)); // remove 후 2번째 인덱스는 없어짐 → 에러

        // ArrayList의 크기 확인
        int size = list.size();
        System.out.println(size);

        System.out.println(list.size()); // 2

        // ArrayList의 모든 값 출력
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
