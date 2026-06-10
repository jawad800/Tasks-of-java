public class q2 {
    public static void main(String[] args) {
        double[][] matrix = {{6, 2, 3}, {5, 5, 6}, {7,7, 4}};
        System.out.println("Sum of major diagonal: " + sumMajorDiagonal(matrix));
    }
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
