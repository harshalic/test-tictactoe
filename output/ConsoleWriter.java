public class ConsoleWriter {
    public void print(char[3][3] matrix) {
        for (int row = 0 ; row < 3; row ++ ) {
            String line = String.format("{0} | {1} | {2}", matrix[row][0], matrix[row][1], matrix[row][2]);
            System.out.println(line);
        }
    }
}