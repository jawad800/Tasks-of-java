public class q19 {// this is Quetion 20
    public static void main(String[] args) {
        int[][] matrix ={{1, 0, 1, 1}, {1, 1, 1, 0}, {0, 0, 1, 0}};
        int maxRow = 0;
        int maxCount= 0;
        for (int i = 0; i < matrix.length; i++) {
            int count= 0;
            for (int j=0; j<= matrix[i].length; j++) {
                count += matrix[i][j];
            }
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }
        System.out.println("Row with most 1s: " + maxRow);
    }
}
