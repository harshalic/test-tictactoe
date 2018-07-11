public class RandomPlayer implements IPlayer {
    // X or O
    private char role;

    public RandomPlayer(char role) {
        this.role = role;
    }

    public void  play(char[3][3] configuration) {
        Random random = new Random();
        List<Tuple<int,int>> choices = new List();
        for (int i =  0; i < 3; i ++ ) { 
            for (int j = 0 ; j < 3; j ++ ) { 
                if (configuration[i][j] == ' ') {
                    choices.add(new Tuple<int,int>(i,j));
                }
            }
        }
        Tuple<int,int> choice = choices[random.nextInt(0, choices.length())];
        configuration[choice.first][choice.second] = role;
    }
}