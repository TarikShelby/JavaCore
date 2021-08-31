package oop.exten.inter;

public class Glavnui {
    public static void main(String[] args) {

        Aninal aninal = new Aninal(1);
        People people = new People(2);
        aninal.sleep();
        people.learn();
        aninal.showInfo();
        people.showInfo();

    }
}
