package joo.de.java.clip9;

public class ifStatement {
    public static void main(String[] args) {
        int check = 100;
//        int num1 = 150;
//        int num1 = 100;
        int num1 = 90;
        if(num1 > check) {
            System.out.println("100보다 크다");
//        } else {
//            System.out.println("100보다 크지 않가");
        } else if (num1 == check) {
            System.out.println("100이다");
        } else {
            System.out.println("100보다 작다");
        }
    }
}
