import java.util.*;

public class Game{
    
    private int mv;  //count of the total no of mv played
    
    //constructor
    public Game(){
        this.mv = 0;
    }
    
    public void startGame(){

	    System.out.println("1. Two Players version");
		System.out.println("2. Player vs Computer version");
		System.out.println("Please enter your choice:-");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
	
	    Player currentPlayer = new Player();    //Human Type
	    Computer Opponent = new Computer();     //Computer(AI) Type

        if(ch == 1)
            {
				System.out.println("Welcome to 2 player Tic Tac Toe.");
				System.out.println("Player 1 (X)  -  Player 2 (O)");
			}
        else
            {
				System.out.println("Welcome to Player vs Computer Tic Tac Toe.");
				System.out.println("Player is X  -  Computer is O");
        
			}

        GameBoard board = new GameBoard();
        System.out.println("New Game, Board Numbers are as folllows:");
	    board.printIndexBoard();

	    while(mv < 9 && board.Win() == 0){
	        int index=0;
	        if(ch == 1 || currentPlayer.getType() == 1)
	            index = currentPlayer.makeMove();
	        else
		    index = Opponent.makeMove(board);
	    
            if(board.registerMove(currentPlayer.getType(), index) == 1){    //move registered on the Game Board
			this.mv++;
			currentPlayer.changePlayer();
		    }
	        else
		        System.out.println("Enter a valid index.");     //invalid index, move not registered
		    board.printBoard();
	    
	    }   //end while
	    
	    if(this.mv < 9){      //not a Draw
	        if(board.Win() == 1)
	            System.out.println("Player1 Wins!");
	        else{           //player2
	            if(ch == 2)
		            System.out.println("Computer Wins!");
	            else if(ch==1)
		            System.out.println("Player2 Wins!");
	        }
	    }   
	
	    if(this.mv == 9 && board.Win() == 0)      //Draw
	        System.out.println("It's a Draw!");
    }
    
}
