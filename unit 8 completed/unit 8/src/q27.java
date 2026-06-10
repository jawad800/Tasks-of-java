public class q27 {
    public static void main(String[] args) {
        int[][] A = {{1, 4, 3}, {45 ,6, 6}};
        int[][] T = new int[3][2];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                T[j][i] = A[i][j];
            }
        }
        for (int[] row : T) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
