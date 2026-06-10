public class qu4 {      // incomplete
    public static double[][] sumMajorDiagonal(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j];

            }
        }
        return result;
    }
    public static void main(String[] args) {
        double[][] matrix = {{6, 2, 3}};
    }
}
