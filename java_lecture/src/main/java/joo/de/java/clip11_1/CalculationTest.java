package joo.de.java.clip11_1;

public class CalculationTest {

    static class Calcuation{
        static int add(int x, int y){
            int result = x + y;
            return result;
        }

        int subtract(int x, int y){
            return x - y;
        }
    }

    public static void main(String[] args) {
        Calcuation calculation = new Calcuation();
        System.out.println("100 + 90 = " + calculation.add(100, 90));
        System.out.println("100 + 80 = " + Calcuation.add(100, 80));
        System.out.println("100 - 90 = " + calculation.subtract(100, 90));
    }
}
