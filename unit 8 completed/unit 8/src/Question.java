public class Question {// q11
    public static void main(String[] args) {
        int[][] matrix =  {{6, 2, 3}, {5, 5, 6}, {7,7, 4}};
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) count++;
            }
            System.out.println("Row " + i + " has " + count + " ones");
        }
    }
}
