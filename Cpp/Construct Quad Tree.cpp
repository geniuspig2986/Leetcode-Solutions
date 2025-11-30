class Solution {
public:
    Node* construct(vector<vector<int>>& grid) {
        return constructsub(grid, 0, 0, grid.size());
    }
private:
    Node* constructsub(vector<vector<int>>& grid, int row, int col, int size){
        if (isUniform(grid, row, col, size)) {
            return new Node(grid[row][col] == 1, true);
        }
        int mid = size / 2;
        Node* topLeft = constructsub(grid, row, col, mid);
        Node* topRight = constructsub(grid, row, col + mid, mid);
        Node* bottomLeft = constructsub(grid, row + mid, col, mid);
        Node* bottomRight = constructsub(grid, row + mid, col + mid, mid);
        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }
    bool isUniform(vector<vector<int>>& grid, int row, int col, int size) {
        int val = grid[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (grid[i][j] != val) {
                    return false;
                }
            }
        }
        return true;
    }
};