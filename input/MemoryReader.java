import org.harshalic.tictactoe.IReader; 

package org.harshalic.tictactoe.input;

/**
 * Memory Reader gives ....
 */
public class MemoryReader implements IReader {

    private char[3][3] matrix;

    MemoryReader() {
        this.matrix = new char[3][3];
    }

    public void setConfiguration(char[3][3] input) {
        for (int i = 0 ; i < 3; i ++ ) { 
            for (int j = 0 ; j < 3; j ++ ) {
                this.matrix[i][j] = input[i][j];
            }
        }
    }

    public char[3][3] getConfiguration() {
        return this.matrix;
    }
}