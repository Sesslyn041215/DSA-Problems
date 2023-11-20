package freshworksMockTest1;

//Consider a Tic Tac Toe board represented as a two dimensional char array containing ‘X’ for player 1 and ‘O’ for player 2 and ‘’ for empty positions.
//A player is consider a winner if their symbols forms a straight line horizontally , vertically or diagonally. Return X ,O if there is a winner and ‘-’ if there is no winner.

public class TicTacToe {
    public static char find(char[][] arr) {
        for (int i = 0; i < 3; i++) {
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                return arr[i][0]; 
            }
            if (arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i]) {
                return arr[0][i];
            }
        }
        
        if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) {
            return arr[0][0]; 
        }
        if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) {
            return arr[0][2]; 
        }
        
        return '-'; 
    }

    public static void main(String[] args) {
        char[][] arr = {{'O', 'X', 'O'}, {'X', 'O', 'O'}, {' ', 'X', 'O'}};
        char winner = find(arr);
        System.out.println(winner);
    }
}
