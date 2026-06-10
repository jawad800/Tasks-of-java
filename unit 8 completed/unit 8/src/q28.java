//completed
public class q28 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        boolean sorted = true;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                if (matrix[i][j] > matrix[i + 1][j]) {
                    sorted = false;
                }
            }
        }
        System.out.println("sort: " + sorted);
    }
}
