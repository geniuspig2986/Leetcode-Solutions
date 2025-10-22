import java.util.HashSet;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        char[][] row = new char[9][9];
        char[][] col = new char[9][9];
        char[][] box = new char[9][9];
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                char val = board[x][y];
                if (val == '.') continue;
                int boxIdx = (y / 3) * 3 + x / 3;
                row[x][val - '1']++;
                col[y][val - '1']++;
                box[boxIdx][val - '1']++;
                if (row[x][val - '1'] == 2 ||
                col[y][val - '1'] == 2 ||
                box[boxIdx][val - '1'] == 2) return false;
            }
        }
        return true;
    }
}