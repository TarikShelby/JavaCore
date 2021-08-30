package strings;

public class StringBilder {
    public static void main(String[] args) {
        StringBuilder gj = new StringBuilder(" Fake ");

        gj.append(" da");
        gj.append(" Friends");
        gj.append(" M<r");
        System.out.println(gj);
        /* если часто изменяете изменяете строку то использовать лучше StringBuilder */
        /* String является не изменяемый */
    }
}
