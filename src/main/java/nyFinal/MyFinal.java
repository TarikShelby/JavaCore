package nyFinal;

public class MyFinal {
    public static void main(String[] args) {
        final int congress = People.CONGRESS;
        //final = переманная которая не может изменятся и переписываться!"
        System.out.println(congress);

    }

    class People {
        public static final int CONGRESS = 1927;
    }
}
