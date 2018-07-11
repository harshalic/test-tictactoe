public class Parameters {
    public enum ReaderType {
        MEMORY = 0,
        CONSOLE = 1, 
        FILE = 2,
        IMAGE = 3,
    };

    public enum WriterType {
        MEMORY = 0,
        CONSOLE = 1,
    }

    public enum PlayerType {
        RANDOM = 0,
        OPTIMAL = 1,
    }

    public enum RoleType {
        X = 0,
        O = 1,
    }

    public ReaderType readerType;
    public WriterType writerType;
    public PlayerType playerType;
    public RoleType roleType;

    public Parameters(ReaderType readerType, WriterType writerType, PlayerType playerType, RoleType roleType) {
        this.readerType = readerType;
        this.writerType = writerType;
        this.playerType = playerType;
        this.roleType = roleType;
    }


}