package primitive;

public class Big {
    public static void main(String[] args) {

        int f = (int) 3.13;
        System.out.println(f);
        double a = 42.12321;
        int b = (int) a;
        System.out.println(b);
        double x = 42.32;
        double y = 23.213;
        sum((int) x, (int) y);

    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

}
