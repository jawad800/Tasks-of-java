public class q1 {
    public static void main(String[] args) {
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.println("Sum  " + j + ": " + sumColum(matrix, j));
        }
    }
    public static double sumColum(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }

}
