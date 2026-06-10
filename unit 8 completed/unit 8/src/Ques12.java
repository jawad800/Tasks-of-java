public class Ques12 {//completed
    public static void main(String[] args) {
        double[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Sum of row " + i + ": " + sumRow(matrix, i));
        }
    }
    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;
        for (int j = 0; j < m[rowIndex].length; j++) {
            sum += m[rowIndex][j];
        }
        return sum;
    }
}
