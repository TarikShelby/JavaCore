package oop.exten.inter;

public class People implements Information {
    int id;

    public People(int id) {
        this.id = id;
    }

    public void learn() {
        System.out.println("I`m learning");
    }

    public void showInfo() {
        System.out.println("info id " + id);
    }
}
