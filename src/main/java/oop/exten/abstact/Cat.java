package oop.exten.abstact;

public class Cat extends Animals {
    @Override
    public void makeSound() {
        System.out.println(" meow ");
    }

    public void eat() {
        System.out.println("eat bear");
    }
}
