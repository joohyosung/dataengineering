package joo.de.java.clip11_8;

public class Parents extends Human implements Walkable, Runable{
    public Parents(String name, int age) {
        super(name, age, 3);
    }

    @Override
    public void run(int x, int y) {
        printWhoamI();
        System.out.println("run speed:" + (speed + 2));
        this.x = x;
        this.y = y;
        System.out.println("ran to " + getLocation());
    }

    @Override
    public void walk(int x, int y) {
        printWhoamI();
        System.out.println("walk speed:" + speed);
        this.x = x;
        this.y = y;
        System.out.println("walked to " + getLocation());
    }
}
