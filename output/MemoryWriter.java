public class MemoryWriter implements IWriter {
    private char[3][3] output; 

    MemoryWriter() {
        this.output = new char[3][3];
    }

    public void print(char[3][3] out) {
        for(int i = 0 ; i < 3; i ++ ) { 
            for ( int j = 0; j < 3; j ++ ) {
                this.output[i][j]  = out[i][j];
            }
        }
    }

    public char[3][3] getOutput() {
        return this.output;
    }
}