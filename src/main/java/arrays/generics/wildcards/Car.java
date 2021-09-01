package arrays.generics.wildcards;

public class Car {
    private int id;

    public Car() {
    }

    public Car(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("start");
    }

    public String toString() {
        return String.valueOf(id);
    }

}
