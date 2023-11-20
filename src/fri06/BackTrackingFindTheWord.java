package fri06;

//Given an m x n grid of characters board and a string word, return true if the word
//exists in the grid. The word can be constructed from letters of sequentially
//adjacent cells, where adjacent cells are horizontally or vertically neighboring. The
//same letter cell may not be used more than once. The word may not always be in
//a single line. It can be bent across the grid.

public class BackTrackingFindTheWord {
	public static boolean exist(char[][] board, String word) {
		int m = board.length;
		int n = board[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (dfs(board, i, j, word, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfs(char[][] board, int i, int j, String word, int index) {
		if (index == word.length()) {
			return true;
		}
		if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
			return false;
		}
		char temp = board[i][j];
		board[i][j] = ' '; // Mark cell as visited

		boolean found = dfs(board, i + 1, j, word, index + 1) || dfs(board, i - 1, j, word, index + 1)
				|| dfs(board, i, j + 1, word, index + 1) || dfs(board, i, j - 1, word, index + 1);
		board[i][j] = temp; // Restore cell
		return found;
	}

	public static void main(String[] args) {
		char[][] board = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ABCCED";
		boolean exists = exist(board, word);
		System.out.println("Word '" + word + "' exists: " + exists);
	}
}