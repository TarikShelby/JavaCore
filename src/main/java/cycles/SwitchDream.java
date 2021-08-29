package cycles;

import java.util.Scanner;

public class SwitchDream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число от 1 до 10 и ты узнаешь свое авто : ");
        int car_brand = scanner.nextInt();
        switch (car_brand) {
            case 1:
                System.out.println("Lanos");
                break;
            case 2:
                System.out.println("Нисан Тусан ");
                break;
            case 3:
                System.out.println("урус");
                break;
            case 4:

                System.out.println("жигули");
                break;
            case 5:
                System.out.println("запорожец");
                break;
            case 6:
                System.out.println("фюжен");
                break;
            case 7:
                System.out.println("макларен");
                break;
            case 8:
                System.out.println("ламборгини");
                break;
            case 9:
                System.out.println("ферарри");
                break;
            case 10:
                System.out.println("Мазерати ");
                break;
            default: // определяет если не один из вариантов не подходит
                System.out.println("Ты вёл лишнего мой друг ");
        }
    }
}
