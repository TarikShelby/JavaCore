package ClassAndObject;

public class Klass {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName(" Peslik ");
        dog.age = 5;
        dog.voice = "Gav";
        dog.color = "white";
        System.out.println(" Меня зовут " + dog.name + " мне " + dog.age + " я могу " + dog.voice + " Цвет настроение " + dog.color);
        dog.speak();
        Animal cat = new Animal();
        cat.name = "markis";
        cat.age = 3;
        cat.voice = "M9y ";
        cat.color = "Black";
        System.out.println(cat.voice);
        cat.speak(); // мы создали в обычном классе метод спик
        cat.br();
    }

    static class Animal {
        String name;
        int age;
        String voice;
        String color;

        void speak() {
            System.out.println(" " + name);
        }

        void setName(String username) {
            name = username;
        }

        void br() {
            for (int i = 0; i < 5; i++) {
                System.out.println(name);
            }
        }
    }
}
//Классов может быть много ,точка входа одна

