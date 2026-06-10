public class Quetion{//>> qutestn 26
    public static void main(String[] args) {
        int[][] A = {{1, 0}, {0, 3}};
        int[][] B = {{5, 6}, {7, 8}};
        int[][] C = new int[2][2];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int[] row : C) {
            for (int val : row) {
                System.out.print(val + " ");
            }System.out.println();
        }
    }
}
