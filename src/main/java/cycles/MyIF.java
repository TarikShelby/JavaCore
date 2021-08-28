package cycles;

public class MyIF {
    public static void main(String[] args) {
        int x =18 ;
        if (x <= 18) {
            System.out.println("Hello Andrei" );
        } else {
            System.out.println("error 404");
        }
        int y = 0;
        if (y == 1) {
            System.out.println("НЕ будет его не когда");
        } else if (y == 2) {
            System.out.println("Тоже самое ");
        } else if (y == 5) {
            System.out.println("когда уже");
        } else {
            System.out.println("Паповсь");
        }
        if (args.length == 1) {
            System.out.println("Net Arguments");
        } else if (args.length > 0) {
            System.out.println("Est` Arguments ");
        } else {
            System.out.println("kak poly4its9 ");
        }
    }
}
