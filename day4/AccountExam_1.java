package day4;

public class AccountExam_1 {
    public static void main(String[] args) {

        Account a1 = new Account(); // 철수 계좌

        a1.deposit(1000); // 1000원을 예금했습니다.
        a1.deposit(2000); // 2000원을 예금했습니다.
        a1.deposit(3000); // 3000원을 예금했습니다.

        int money = a1.withdraw(400);
        System.out.println(money); // 400

        int remainder = a1.getRemainder();
        System.out.println(remainder); // 5600

        money = a1.withdraw(1400);
        System.out.println(money); // 1400

        remainder = a1.getRemainder();
        System.out.println(remainder); // 4200


        //---------------------------------------------
        Account a2 = new Account(); // 영희 계좌

        a2.deposit(3000); // 3000원을 예금했습니다.
        a2.deposit(5000); // 5000원을 예금했습니다.



    }
}

class Account {

    int balance = 0;

    public void deposit(int deposit) {
        balance += deposit;
        System.out.printf("%d원을 예금했습니다.\n", deposit);
    }
    public int withdraw(int withdraw) {
        balance -= withdraw;
        return withdraw;
    }
    public int getRemainder() {
        return balance;
    }



}
