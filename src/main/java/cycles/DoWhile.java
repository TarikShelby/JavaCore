package cycles;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lemonade;
        do {
            System.out.println("Угадай число до 10 : ");
            lemonade = scan.nextInt();
        } while (lemonade != 8);
        System.out.println("Угадал 8");
        int x = 8;
        do {
            System.out.println(" " + x);
            x++;
        } while (x < 1200);
    }
}

