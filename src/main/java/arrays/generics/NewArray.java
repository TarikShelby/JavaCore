package arrays.generics;

import java.util.ArrayList;

public class NewArray {
    public static void main(String[] args) {

        ArrayList<String> car = new ArrayList<>();
        car.add("Lamba");
        car.add("bygati");
        car.add("mitsuban");
        car.add("nissan ");
        car.add("vw");
        car.add("Pika4y");
        car.remove("Pika4y");
        car.size();
        System.out.println(car.size());
        System.out.println(car);
    }
}
