package cycles;

public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (i != 52) {
            System.out.println("sasi" + i);
            i++;
        }
        for (int x = 0; x <= 15; x++) {
            if (x == 14)
                continue;
            System.out.println(x);
        }
    }
}
