package joo.de.java.clip10;

public class Quiz {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while(i < 100){
            sum += i + 1;
            i++;
            System.out.println("더할 숫자: " + i + "\n" + "숫자들의 합: " + sum);
        }
    }
}
