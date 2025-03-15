package joo.de.java.clip11_5;

public class AccessModifierTest {

    private void messageInside(){
        System.out.println("this is private modifier");
    }

    void messageDefault(){
        messageInside();
        System.out.println("This is default(package-private) modifier");
    }

    protected void messageProtected(){
        messageInside();
        System.out.println("This is protected modifier");
    }

    public void messageOutside(){
        messageInside();
        System.out.println("This is public modifier");
    }
}
