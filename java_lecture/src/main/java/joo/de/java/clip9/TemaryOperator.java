package joo.de.java.clip9;

public class TemaryOperator {
    public static void main(String[] args) {
        int a = 11;
        String result = (a < 10) ? "10보다 작다" : (a == 10) ? "10이다" : "10보다 작지 않다";
        System.out.println(result);
    }
}
