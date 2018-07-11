package org.harshalic.tictactoe.input;

/*
 * Reads TicTacToe game state from stdin. Expected input is like 
 * X |   | O
 * O | X | O
 *   |   | X
 * Each line is 9 chars long.  The value in the cell are in 0th, 4th and 8th char.
 */
public class ConsoleReader {

    private final int[3] positions = {0, 4, 8};

    public char[3][3] getConfiguration() {
        char[][] matrix = new char[3][3];
        for(int row = 0 ; row < 3; row ++ ) {
            fill(matrix, row);
        }
        return matrix;
    }

    private void fill(char[3][3] matrix, int row) {
        String line = System.In.ReadLine();
        if (line.length() != 8) {
            throw new Exception(String.format("Input not in correct format, #{0}# must contain exactly 8 chars!");
        }
        int ind = 0;
        for (int position : positions) {
            if (isValidChar(line.charAt(position))) {
                matrix[row][ind] = line.charAt(position);
                ind ++;
            }
        }
    }
}