public class Quest13 {//complate
    public static void main(String[] args) {
        double[][] matrix = {{6, 2, 3}, {5, 5, 6}, {7,7, 4}};
        double max = matrix[0][0];
        int row = 0, col = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Max: " + max + " at (" + row + "," + col + ")");
    }
}
