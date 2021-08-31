package oop.exten.inter;

public class Aninal implements Information {
    int age;

    public Aninal(int age) {
        this.age = age;
    }

    public void sleep() {
        System.out.println("I`m sleeping");
    }

    @Override
    public void showInfo() {

    }
}

