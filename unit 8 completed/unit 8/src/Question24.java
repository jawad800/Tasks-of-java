import java.util.HashSet;// com
public class Question24 {
    public static void main(String[] args) {
        int[][] sudoku = new int[9][9];
        System.out.println(isValid(sudoku));
    }
    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            HashSet<Integer> row = new HashSet<>();
            HashSet<Integer> col = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!row.add(grid[i][j]) || !col.add(grid[j][i])) {
                    return false;
                }
            }
        }
        return true;

    }
}
