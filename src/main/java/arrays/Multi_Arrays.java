package arrays;

public class Multi_Arrays {
    public static void main(String[] args) {
        int[][] ym = {{1, 2, 3, 4}, {5, 6, 7, 8, 9}, {1}, {5, 3, 1}};
        for (int i = 0; i < ym.length; i++) {
            for (int j = 0; j < ym[i].length; j++) {
                System.out.println(ym[i][j]);
            }
        }
    }
}
