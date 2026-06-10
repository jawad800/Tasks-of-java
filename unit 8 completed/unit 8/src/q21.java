public class q21 {
    public static void main(String[] args) {
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] /= sum;}
        }
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
