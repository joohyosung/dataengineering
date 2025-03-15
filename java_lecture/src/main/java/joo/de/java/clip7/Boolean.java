package joo.de.java.clip7;

public class Boolean {
    public static void main(String[] args) {
        boolean fact = true;
        System.out.println(fact);

        Defaults defaults = new Defaults();
        System.out.println(defaults.booleanDefaults);
    }

    static class Defaults{
        boolean booleanDefaults;
    }
}
