import java.util.Arrays;
public class Q16{// easy
    public static void main(String[] args) {
        int[][] matrix = {{6, 2, 3}, {5, 5, 6}, {7,7, 4}};
        Arrays.sort(matrix, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] row : matrix) {System.out.println(Arrays.toString(row));}
    }
}
