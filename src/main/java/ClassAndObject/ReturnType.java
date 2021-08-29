package ClassAndObject;

import static java.lang.Math.max;

public class ReturnType {
    public static void main(String[] args) {
        int rs = max(4, 12);
        System.out.println(rs);
        Pastik pastik = new Pastik();
        pastik.age = 21;
        int year1 = pastik.calculateYears();
        System.out.println(" do pensii " + year1);
    }

    static class Pastik {

        static int max(int a, int b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
        int age;

        int calculateYears() {
            int years = 65 - age;
            return years;
        }

    }
}