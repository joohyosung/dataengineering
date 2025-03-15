package joo.de.java.clip11_6;

public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird peacock = new Peacock();

        System.out.println("-- 비둘기 --");
        pigeon.fly(1,3,4);
        System.out.println("-- 공작 --");
        peacock.fly(1,3,2);
        System.out.println("-- 높이 나는 비둘기 --");
        pigeon.fly(1,2,20000);
    }
}
