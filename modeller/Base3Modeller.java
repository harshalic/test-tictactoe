public class Base3Modller {
    private HashMap<char, int> mapper = new HashMap<char, int>();

    public Base3Modller() {
        mapper['X'] = 2;
        mapper['O']= 1;
        mapper[' '] = 0;
    }
    public int toInteger(char[3][3] input) {
        int ans = 0;
        for (int i = 0 ; i < 3; i ++ ) {
            for (int j = 0 ; j < 3; j ++ ) { 
                ans = 3 * ans + mapper[input[i][j]];
            }
        }
        return ans;
    }

    public char[3][3] toGrid(int input) {
        char[3][3] out = new char[3][3];
        for (int i = 2 ; i >= 0; i -- ) {
            for (int j = 2; j >= 0; j -- ) { 
                out[i][j] = ans % 3;
                ans = ans / 3;
            }
        }
        return out;
    }
}