package joo.de.java.clip10;

public class Quiz2 {
    public static void main(String[] args) {
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < 31; i++){
            if (i % 2 == 0){
                result1 += i;
            } else {
                result2 += i;
            }
        }

        System.out.println("짝수의 합: " + result1 + "\n" + "홀수의 합: " + result2);
    }
}
