public class q23 {//completed
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0}, {0, 0, 0}, {0, 1, 0}};
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                count += matrix[i][j];
            }
            if (count == 1) {
                System.out.println("Row " + i + " has exactly one 1");
            }
        }
    }
}