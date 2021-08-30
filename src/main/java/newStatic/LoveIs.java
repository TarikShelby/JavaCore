package newStatic;

public class LoveIs {
    public static void main(String[] args) {
        People vova = new People(12, "Vova");
        People vika = new People(13, "Vika");
        System.out.println(vova.show());
        System.out.println(vika.show());
        vova.move();
        vika.move();

    }

    public static class People {
        int age;
        String name;

        public People() {
        }

        public People(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String show() {
            return name + " " + age;
        }

        public void move() {
            System.out.println(name + " Move");
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}