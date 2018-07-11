package org.harshalic.tictactoe;

public interface IReader {
    // Reads the game configuration and returns a 3x3 array.
    public char[3][3] getConfiguration();
}