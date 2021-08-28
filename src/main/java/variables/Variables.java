package variables;

public class Variables {
    public static void main(String[] args) {
        int myInt; // -2147483648 до 2147483647 , 4 байта
        byte myByte = 127; //от 127  -128 ,1 байт
        short myShort = 1998; //от -32768 до 32767 , 2 байта
        long myLong = 123456789; // от -9223372036854775808 до 9223372036854775807 ,8 байтов памяти
        double myDouble = 321.213;
        float myFloat = 321.241f;
        char a = 'a';
        boolean bool = true;
        var myVar = 1243412433;// new variables
        //these are all variables
        myInt = 31;
        {
            System.out.println(myInt);
        }
        System.out.println(myByte);
        System.out.println(myDouble);
        System.out.println(a);
        System.out.println(bool);
    }
}
