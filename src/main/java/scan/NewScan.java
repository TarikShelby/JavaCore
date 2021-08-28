package scan;

import java.util.Scanner;

public class NewScan {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);// обязательно проверьте что бы подключился java util
        System.out.println(" Будете что-то писать : ");
        String id = name.nextLine();
        System.out.println("Вы написали : " + id); // сделали эхо сканера
        System.out.println("Что-то с название компании : ");
        String username = name.nextLine();
        System.out.println(" тут можно только цифры : ");
        int password = name.nextInt();
        System.out.println(username + " " + password);
    }


}
