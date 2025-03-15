package joo.de.java.clip11_4;

import javax.swing.*;

public class Main {
    static class Animal{
        String name;

        Animal(String name){
            this.name = name;
        }

        public void cry(){
            System.out.println(name + " is crying.");
        }
    }
    static class Dog extends Animal{

        String breed;

        Dog(String name, String breed) {
            super(name);
            this.breed = breed;
        }

        public void swim(){
            System.out.println(name + "(" + breed + ")" + " is swimming.");
        }
    }

    // 오버라이딩 예제
    static class Giraffe extends Animal{
        Giraffe(String name){
            super(name);
        }
        @Override
        public void cry(){
            System.out.println(name + " cannot cry.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("코코", "허스키");
        dog.cry();
        dog.swim();

        Animal animal = dog;
        animal.cry();

        Animal giraffe = new Giraffe("기린이");
        giraffe.cry();
    }
}
