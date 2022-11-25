public class SudokuSolver {
    //@ZoePiper
    /* The game rules Sudoku
   Board of 9x9 grid, 3x3 squares
   Every line vertical and horizontal and every square must contain the numbers 1 to 9
     */

    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        // Board 2d array 9x9 numbers
        // fill in the numbers
        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };
        printBoard(board);

        //call methode
        if (solveBoard(board)) {
            System.out.println("Solved successfully!");
        } else {
            System.out.println("Unsolvable board :( ");
        }
        printBoard(board);
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int column = 0; column < GRID_SIZE; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();

        }
    }

    // check the number in the row. if it's there true if not false
    // loops through [row][i] row 1, column 0 then row1 col1 etc.
    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }
    // check the number in the column.
    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    // check the number in the box by checking the row and column
    private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        //Gives the top location of the box. in example 0,3
        // get the place of the local box. row 1 %3 = 1. row 1 -  1 = 0
        int localBoxRow = row - row % 3;
        // get the place of the local box. column 4 %3 = 1. column4 -  1 = 3
        int localBoxColumn = column - column % 3;

        //use localBox position and look 3 left and bottom positions
        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false; //number does not exist
    }

    // checks all methodes above if the number is in the row,column and box
    // it is valid (true) if it returns false
    private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
        return !isNumberInRow(board, number, row) &&
                !isNumberInColumn(board, number, column) &&
                !isNumberInBox(board, number, row, column);
    }

    private static boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (board[row][column] == 0) { //find empty space

                    for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        // loop the numbers and look if it's valid, if so place number
                        if (isValidPlacement(board, numberToTry, row, column)) {
                            board[row][column] = numberToTry;

                            //recursion
                            // try all the numbers per position if it's valid
                            // then goes to the next empty space.
                            if (solveBoard(board)) {
                                return true; // places a number successfully
                            } else {
                                board[row][column] = 0; // clears the numberToTry to continue
                            }
                        }
                    }
                    return false; // I cant solve this. If all the numbers are not valid.
                }
            }
        }
        return true;// go through the methode but stops because the loop doesn't go further.
    }
}

