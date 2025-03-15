package joo.de.java.clip11_8;

public class GrandParents extends Human implements Walkable {

    public GrandParents(String name, int age) {
        super(name, age, 1);
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
