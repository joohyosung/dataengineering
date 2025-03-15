package joo.de.java.clip11_8;

public class Main {
    public static void main(String[] args) {
        Human grandParent = new GrandParents("할아버지", 70);
        Human parents = new Parents("엄마", 50);
        Human chlid = new Child("나", 10);

        Human[] humans = {grandParent, parents, chlid};
        System.out.println("활동 시작");
        for (Human human : humans) {
            if (human instanceof Walkable) {
                ((Walkable) human).walk(1, 1);
                System.out.println("=======================");
            }
            if (human instanceof Runable) {
                ((Runable) human).run(2, 2);
                System.out.println("=======================");
            }
            if (human instanceof Swimable) {
                ((Swimable) human).swim(3, -1);
                System.out.println("=======================");
            }
        }
    }
}
