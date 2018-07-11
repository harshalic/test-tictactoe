public static class GameComplete {
    public static boolean didWin(char[3][3] configuration, char player) {
        // check if 3 in row for player (x, o)
        return true;
    }

    public static boolean isDraw(char[3][3] configuration) {
        for (int i = 0 ; i < 3; i ++ ) {
            for (int j = 0 ;  j < 3 ; j ++ ) {
                if (configuration[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}