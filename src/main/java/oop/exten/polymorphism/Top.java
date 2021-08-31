package oop.exten.polymorphism;

public class Top {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal a = new Dog();
        Animal b = new Cat();
        a.makeSounds();
        a.eat();
        b.makeSounds();
        b.eat();
    }
}
