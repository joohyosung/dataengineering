package joo.de.java.clip7;

public class Character {
    public static void main(String[] args) {
        char alphabet = 'A';
        System.out.println(alphabet);

        Defaults defaults = new Defaults();
        System.out.println(defaults.charDefaults);

    }

    static class Defaults {
        char charDefaults;
    }
}
