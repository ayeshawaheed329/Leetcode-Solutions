import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> boxesChecker = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            boxesChecker.add(new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            Set<Character> rowChecker = new HashSet<>();
            Set<Character> colChecker = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                // Row check
                char rowChar = board[i][j];
                if (rowChar >= '1' && rowChar <= '9') {
                    if (rowChecker.contains(rowChar)) return false;
                    rowChecker.add(rowChar);

                    int boxIndex = (i / 3) * 3 + (j / 3);
                    if (boxesChecker.get(boxIndex).contains(rowChar)) return false;
                    boxesChecker.get(boxIndex).add(rowChar);
                }

                // Column check
                char colChar = board[j][i];
                if (colChar >= '1' && colChar <= '9') {
                    if (colChecker.contains(colChar)) return false;
                    colChecker.add(colChar);
                }
            }
        }

        return true;
    }
}
