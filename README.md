# Tic-Tac-Toe
Here's a link to the game https://ayushverma37.github.io/Tic-Tac-Toe/ (For 2 player version)

For Command Line:

INSTRUCTIONS:-
In the terminal window type the following commands to compile
javac TwoPlayers.java
javac Comp.java
javac TicTacToe.java
java TicTacToe




WHILE RUN-TIME
then choose option accordingly: 1 for two-player version and 2 for player vs computer.
then choose any one of the un-entered cells(from 1 to 9) to make your move.




"TwoPlayers.java" contains the class of 2-player version of the game. "Comp.java" contains the class of player vs computer version of the game. "TicTacToe.java" contains the main fxn






EXAMPLE FOR TWO PLAYERS VERSION
javac TwoPlayers.java
$ javac TicTacToe.java
$ java TicTacToe
Welcome to Tic Tac Toe.
1. Two Players version
2. Player vs Computer version
Please enter your choice:-
1
Welcome to 2 player Tic Tac Toe.
Player 1 (X)  -  Player 2 (O)

| 1 | 2 | 3 |

| 4 | 5 | 6 |

| 7 | 8 | 9 |

Player 1 (X) will play first
Please enter a slot number to place X in [1-9]
3

| 1 | 2 | X |

| 4 | 5 | 6 |

| 7 | 8 | 9 |

Player 2 (O) turn. Enter a slot number to place O [1-9]
5

| 1 | 2 | X |

| 4 | O | 6 |

| 7 | 8 | 9 |

Player 1 (X) turn. Enter a slot number to place X [1-9]
6

| 1 | 2 | X |

| 4 | O | X |

| 7 | 8 | 9 |

Player 2 (O) turn. Enter a slot number to place O [1-9]
1

| O | 2 | X |

| 4 | O | X |

| 7 | 8 | 9 |

Player 1 (X) turn. Enter a slot number to place X [1-9]
9

| O | 2 | X |

| 4 | O | X |

| 7 | 8 | X |

Player 1 (X) has won. Game over



EXAMPLE FOR PLAYER VS COMP VERSION
$ javac Comp.java
$ javac TicTacToe.java
$ java TicTacToe
Welcome to Tic Tac Toe.
1. Two Players version
2. Player vs Computer version
Please enter your choice:-
2
Welcome to Player vs Computer Tic Tac Toe.
Player is X  -  Computer is O

| 1 | 2 | 3 |

| 4 | 5 | 6 |

| 7 | 8 | 9 |

You (X) will play first
Please enter a slot number to place X in [1-9]
5

| 1 | 2 | 3 |

| 4 | X | 6 |

| 7 | 8 | 9 |

Computer (O) has chosen 1

| O | 2 | 3 |

| 4 | X | 6 |

| 7 | 8 | 9 |

Player 1 (X) turn. Enter a slot number to place X [1-9]
7

| O | 2 | 3 |

| 4 | X | 6 |

| X | 8 | 9 |

Computer (O) has chosen 3

| O | 2 | O |

| 4 | X | 6 |

| X | 8 | 9 |

Player 1 (X) turn. Enter a slot number to place X [1-9]
2

| O | X | O |

| 4 | X | 6 |

| X | 8 | 9 |

Computer (O) has chosen 8

| O | X | O |

| 4 | X | 6 |

| X | O | 9 |

Player 1 (X) turn. Enter a slot number to place X [1-9]
9

| O | X | O |

| 4 | X | 6 |

| X | O | X |

Computer (O) has chosen 4

| O | X | O |

| O | X | 6 |

| X | O | X |

Player 1 (X) turn. Enter a slot number to place X [1-9]
6

| O | X | O |

| O | X | X |

| X | O | X |

The game is a tie.  Game over


