public class Qu14 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 1, 0}, {0, 1, 0, 1}, {1, 1, 0, 0}, {0, 0, 1, 1}};
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                count += matrix[i][j];
            }
            if (count == n / 2)
                System.out.println("Row " + i + " has equal 0s and 1s");
        }
    }
}
