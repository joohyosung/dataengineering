package joo.de.java.clip11_5_1;

import joo.de.java.clip11_5.AccessModifierTest;

public class Child extends AccessModifierTest{
    public void call(){
//            this.messageDefault();
            this.messageOutside();
            this.messageProtected();
//            this.messageInside();
    }
}
