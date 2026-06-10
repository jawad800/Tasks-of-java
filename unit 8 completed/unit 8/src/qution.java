public class qution {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int[][] A = {{1, 0}, {0, 3}};
        int[][] B = {{5, 6}, {7, 8}};

        int[][] C = new int[2][2];
        for (int i = 0; i < A.length; i++) for (int j = 0; j < A[i].length; j++) C[i][j] = A[i][j];
        for (int i = 0; i < B.length; i++) for (int j = 0; j < B[i].length; j++) C[i][j] = B[i][j];





    }
}
