package getterSetter.constructor;

public class Cons {
    public static void main(String[] args) {
        Pub pub = new Pub(21);

    }

    static class Pub {
        private String name;
        private int age;

        public Pub() {
            System.out.println("Если что это первый ");
        }

        public Pub(String name) {
            System.out.println("Если ввели имя ");  //Это называется перегрузка методов когда конструкторы одним название!
        }

        public Pub(int age) {
            System.out.println("Если ввели возраст");
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
