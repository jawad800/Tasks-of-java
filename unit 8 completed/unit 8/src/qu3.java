import java.util.Arrays;
public class qu3 {
    public static void main(String[] args) {
        int[][] matrix = {{6, 2, 3}, {5, 5, 6}, {7,7, 4}};
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
