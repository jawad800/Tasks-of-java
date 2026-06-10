public class q22 {
    public static boolean isIdentity(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i == j && m[i][j] != 1)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println(isIdentity(matrix));
    }
}

