package joo.de.java.clip11_7;

public interface Bird {
    void fly(int x, int y, int z);

    default void printBreed() {
        System.out.println("나는 새 중에 " + getBreed() + " 입니다.");
    }

    String getBreed();

    static void staticMethid() {
        System.out.println("This is static method");
    }

    abstract void abstractMethod();
}

