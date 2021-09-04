package equals;

import arrays.generics.wildcards.Car;

public class Equal {
    public static void main(String[] args) {
        Car car1 = new Car(1);
        Car car2 = new Car(1);
        System.out.println(car1.equals(car2)); // лучше всего сравнить строки с помощью метода equals !
        String name1 = "hi";
        String name2 = "hi";
        System.out.println(name1 == name2);

    }

    static class Car {
        private int id;

        public Car(int id) {
            this.id = id;
        }

        public boolean equals(Object obj) {
            Car othercar = (Car) obj;
            return this.id == othercar.id;
        }
    }
}
