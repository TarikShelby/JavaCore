package anonymous;

interface Jungle {
    public void monkey();
}

public class Example {
    public static void main(String[] args) {
        Jungle jungle1 = new Jungle() {
            @Override
            public void monkey() {
                System.out.println(" Monkey is jumper ");
            }
        };
        jungle1.monkey();
    }
}
