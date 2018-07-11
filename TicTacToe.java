package org.harshalic.tictactoe;

public class TicTacToe {
    
    private IReader reader;
    private IWriter writer;
    private IPlayer player;

    public TicTacToe(IReader reader, IWriter writer, IPlayer player) {
        this.reader = reader;
        this.writer = writer;
        this.player = player;
    }

    private IReader getReader(Parameters params) {
        switch(params.readerType) {
            case ReaderType.MEMORY:
                return new MemoryReader();
            case ReaderType.CONSOLE:
                return new ConsoleReader();
            default:
                return null;
        }
    }

    private IWriter getWriter(Parameters params) {
        switch(params.writerType) {
            case WriterType.MEMORY:
                return new MemoryWriter();
            case WriterType.CONSOLE:
                return new ConsoleWriter();
            default:
                return null;
        }
    }

    private static IPlayer getPlayer(Parameters params) {
        char role = params.roleType == RoleType.X ? 'X' : 'O';
        switch(params.playerType) {
            case PlayerType.RANDOM:
                return new RandomPlayer(role);
            case PlayerType.OPTIMAL:
                return new OptimalPlayer(role);
            default:
                return null;
        }
    }
   
    private void playMove() {
        char[3][3] input = reader.getConfiguration();
        player.play(input);
        writer.print(input);
    }



}