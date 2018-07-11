# TicTacToe
TicTacToe is an application which computes the best move given current game configuration.
It does by constructing a tree representing all possible moves and tries to find if a configuration is a winning or losing one.

- A configuration is called winning if the current player wins even if the opponent plays most optimal game.
- A configuration is called losing if the current player will lose from this configuration given optimal play from the opponent.

# Representation 
TicTacToe board is a 3x3 square, with each square either of 'X', 'O' or ' '.  There are total of 9 cells, each cell can have one of the possible 3 values, thus total configurations will be at max 3 ** 9.

We can represent the 3x3 matrix as 9x1 linear array. 'X', 'O' and ' ' being represented as 2, 1, 0 respectively. Giving us a 9 digit base 3 number which can have leading 0s.





