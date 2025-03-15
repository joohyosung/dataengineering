package joo.de.java.clip7;

import java.time.chrono.MinguoChronology;

public class numbers {
    public static void main(String[] args) {
        short s = 1;
        System.out.println(s);

        int a = 3;
        System.out.println(a);

        long b = 1234567L;
        System.out.println(b);

        float c = 5.5F;
        System.out.println(c);

        double d = 9.1234123412341234123512341234d;
        System.out.println(d);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

        Defaults defaults = new Defaults();
        System.out.println("==================== defaults ====================");
        System.out.println(defaults.doubleDefaults);
        System.out.println(defaults.floatDefaults);
        System.out.println(defaults.longDefaults);
        System.out.println(defaults.shortDefaults);
        System.out.println(defaults.intDefaults);
    }

    static class Defaults{
        short shortDefaults;
        int intDefaults;
        long longDefaults;
        float floatDefaults;
        double doubleDefaults;
    }
}
