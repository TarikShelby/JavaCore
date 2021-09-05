package enums;

public class Other {
    public static void main(String[] args) {
        Animals animals = Animals.CAT;
        System.out.println(animals);
        switch (animals) {
            case CAT:
                System.out.println("meow");
                break;
            case DOG:
                System.out.println("gav");
                break;
            case FISH:
                System.out.println();
            default:
        }
        Season season = Season.WINTER;
        switch (season) {
            case SUMMER:
                System.out.println("KAIF");
                break;
            case AUTUMN:
                System.out.println("takoe");
                break;
            case WINTER:
                System.out.println("por9dok ");
                break;
            case SPRING:
                System.out.println("mmmm");
                break;

        }
        System.out.println(season.getTemperature());
        System.out.println(season.name());// название енама в ввиде строки
    }
}
