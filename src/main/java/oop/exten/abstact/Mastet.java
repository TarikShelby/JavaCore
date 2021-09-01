package oop.exten.abstact;

public class Mastet {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Rabbit rabbit = new Rabbit();
        cat.makeSound();
        rabbit.makeSound();
        cat.eat();
        rabbit.eat();
    }
}
