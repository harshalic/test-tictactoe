package org.harshalic.tictactoe;

public class Main {
    private static player1WinCount = player2WinCount = drawGameCount = 0;

    public static void main(String[] args) {
        
        for (int gameNumber = 0 ; gameNumber < 10000 ; gameNumber ++ ) {
            playGame();    
        }
        System.out.println(
            String.format(
                "Player 1 won {0} times, Player 2 won {1} times while {2} games ended in draw."
                , player1WinCount, player2WinCount, drawGameCount));
    }

    private static void playGame() {
        MemoryReader memoryReader1 = new MemoryReader();
        MemoryReader memoryReader2 = new MemoryReader();
        MemoryWriter memoryWriter1 = new MemoryWriter();
        MemoryWriter memoryWriter2 = new MemoryWriter();
        RandomPlayer randomPlayer1 = new RandomPlayer('X');
        RandomPlayer randomPlayer2 = new RandomPlayer('O');

        TicTacToe player1 = new TicTacToe(memoryReader1, memoryWriter1, randomPlayer1);
        TicTacToe player2 = new TicTacToe(memoryReader2, memoryWriter2, randomPlayer2);

        // Set Empty Board.
        memoryReader1.setConfiguration({
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
        });

        while (true) {
            player1.play();
            if (GameComplete.didWin(memoryWriter1.getOutput(), 'X')) {
                player1WinCount++;
                return;
            } else if (GameComplete.isDraw(memoryWriter1.getOutput())) {
                drawGameCount++;
                return;
            }

            memoryReader2.setConfiguration(memoryWriter1.getOutput());
            player2.play();
            if (GameComplete.didWin(memoryWriter2.getOutput(), 'O')) {
                player2WinCount++;
                return;
            } else if (GameComplete.isDraw(memoryWriter2.getOutput())) {
                drawGameCount++;
                return;
            }
            
            memoryReader1.setConfiguration(memoryWriter2.getOutput());
        }


    }
}