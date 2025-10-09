import java.util.Scanner;
public class TicTakToe {

    

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static final char EMPTY = ' ';
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initBoard();
        char currentPlayer = 'X';
        boolean gameOn = true;

        System.out.println("=== Tic-Tac-Toe ===");
        printBoard();

        while (gameOn) {
            System.out.println("Player " + currentPlayer + ", enter position (1-9):");
            int pos = readPosition();

            if (!placeMove(pos, currentPlayer)) {
                System.out.println("Invalid move — try again.");
                continue;
            }

            printBoard();

            if (isWinner(currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins! 🎉");
                gameOn = false;
            } else if (isBoardFull()) {
                System.out.println("It's a draw!");
                gameOn = false;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; 
            }
        }

        System.out.println("Game over. Thanks for playing!");
    }

    private static void initBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = EMPTY;
    }


    private static void printBoard() {
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.printf(" %c | %c | %c \n", board[i][0], board[i][1], board[i][2]);
            if (i < 2) System.out.println("---+---+---");
        }
        System.out.println();
    }

   
    private static int readPosition() {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                int p = Integer.parseInt(line);
                if (p >= 1 && p <= 9) return p;
            } catch (NumberFormatException ignored) {}
            System.out.println("Please enter a number from 1 to 9:");
        }
    }

    private static boolean placeMove(int pos, char player) {
        int r = -1, c = -1;
        switch (pos) {
            case 1 -> { r = 0; c = 0; }
            case 2 -> { r = 0; c = 1; }
            case 3 -> { r = 0; c = 2; }
            case 4 -> { r = 1; c = 0; }
            case 5 -> { r = 1; c = 1; }
            case 6 -> { r = 1; c = 2; }
            case 7 -> { r = 2; c = 0; }
            case 8 -> { r = 2; c = 1; }
            case 9 -> { r = 2; c = 2; }
            default -> { return false; } 
        }

        if (board[r][c] == EMPTY) {
            board[r][c] = player;
            return true;
        } else {
            return false; 
        }
    }

   
    private static boolean isWinner(char p) {
        
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true;
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true;
        }
        
        if (board[0][0] == p && board[1][1] == p && board[2][2] == p) return true;
        if (board[0][2] == p && board[1][1] == p && board[2][0] == p) return true;

        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (board[i][j] == EMPTY) return false;
        return true;
    }
}

    
}
