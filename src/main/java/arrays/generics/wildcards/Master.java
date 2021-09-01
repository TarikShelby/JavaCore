package arrays.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Master {
    public static void main(String[] args) {

        List<Car> listOfCar = new ArrayList<>();
        listOfCar.add(new Car(1));
        listOfCar.add(new Car(2));
        listOfCar.add(new Car(3));


        List<Lamba> listOfLamba = new ArrayList<>();
        listOfLamba.add(new Lamba());
        listOfLamba.add(new Lamba());

        test(listOfCar);
        test(listOfLamba);
    }

    private static void test(List<? extends Car> list) {
        for (Car car : list) {
            System.out.println(car);
        }
    }

}