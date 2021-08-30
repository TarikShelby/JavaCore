package arrays;

public class Array {
    public static void main(String[] args) {
        int car[] = new int[10];
        car[2] = 100;
        car[4] = 150;
        car[7] = 250;
        car[3] = 99;
        System.out.println(car[4]);

        String mash[] = {"A", "BEeeeeeeeeeeeeeeeeeeeeeeeeeeeee", "Je"};
        System.out.println(mash[1]);

        int[] arr = new int[4];
        System.out.println(arr.length); // lenght длинна масива

        int[] myArr = {4, 23, 21, 12, 432};
        int sum = 0;
        for (int x = 0; x < myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);

        String[] azbyka = new String[5];
        azbyka[2] = "Hello";
        azbyka[1] = "Mir";
        azbyka[0] = "The End";
        System.out.println(azbyka[2]);
        System.out.println(azbyka[1]);
        System.out.println(azbyka[0]);

        for (String azbk : azbyka) { // for each первое тип дынных второе переменная 3-это масив через который он пройдет
            System.out.println(azbk);
        }
    }
}
