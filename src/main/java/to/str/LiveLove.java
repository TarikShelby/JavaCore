package to.str;

public class LiveLove {
    public static void main(String[] args) {
        Person g1 = new Person(21, "pika");
        System.out.println(g1);

    }

    static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;

        }

        public String toString() {
            return name + " , " + age; // переопределили string v toString, Теперь у нас не будет ссылки в ввыводе !
        }

    }
}
