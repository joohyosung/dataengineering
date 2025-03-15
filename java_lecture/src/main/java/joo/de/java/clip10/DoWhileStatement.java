package joo.de.java.clip10;

public class DoWhileStatement {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        do {
            sum += i + 1;
            i++;
        } while (i < 10);

        System.out.println(sum);
    }
}
// 조건문을 먼저 실행하고 조건을 확인
