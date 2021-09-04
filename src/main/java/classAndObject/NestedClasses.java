package classAndObject;

public class NestedClasses {
    private int id;


    public NestedClasses(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("motor is starting " + id + "Grrr");

    }

    private class Motor {
        public void MotorStart() {
            final int x = 1;
            class SomeClass {
                public void claser() {
                    System.out.println(x);
                    System.out.println(id);
                }
            }
            System.out.println("Motor is starting .... ");
        }

        private class Battery {
            public void charge() {
                System.out.println("electromashine is charge .... ");
            }
        }
    }
}
