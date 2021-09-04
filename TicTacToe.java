import java.util.*;
public class TicTacToe
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Tic Tac Toe.");
		System.out.println("1. Two Players version");
		System.out.println("2. Player vs Computer version");
		System.out.println("Please enter your choice:-");
		int ch=sc.nextInt();

		if(ch==1)
		{
		TwoPlayers gm=new TwoPlayers();

		System.out.println("Welcome to 2 player Tic Tac Toe.");
		System.out.println("Player 1 (X)  -  Player 2 (O)");

		gm.printboard();

		System.out.println("Player 1 (X) will play first"); 
        System.out.println( "Please enter a slot number to place X in [1-9]");

        

        String champ = "not_end";
        int n;
        while(champ.equalsIgnoreCase("not_end"))
        {
        	
        	n=sc.nextInt();
        	if ((gm.getCell(n-1)).equals(Integer.toString(n))) 
        	{ 
        		if(gm.getTurn()==1)
                gm.setboard(n-1,"X");
            	else
            	gm.setboard(n-1,"O");

                if (gm.getTurn()==2) 
                    gm.setTurn("X"); 
                else
                 { 
                    gm.setTurn("O"); 
                 } 
                gm.printboard(); 
            champ = gm.isWinner();
            }
            else
            	System.out.println("This slot is taken. Kinldy re-enter slot number");
        }
        
            if(champ.equals("X"))
            	System.out.println("Player 1 (X) has won. Game over"); 
            else if (champ.equalsIgnoreCase("tie")) 
          		{ 
            	System.out.println("The game is a tie.  Game over"); 
        		} 
            else
            	System.out.println("Player 2 (O) has won. Game over"); 
         }//end of choice 1



         else if(ch==2)
         {
         	System.out.println("Welcome to Player vs Computer Tic Tac Toe.");
			System.out.println("Player is X  -  Computer is O");

			Comp cm=new Comp();
			cm.printboard();

			System.out.println("You (X) will play first"); 
            System.out.println( "Please enter a slot number to place X in [1-9]");
            int num;
            String win = "not_end";
            while(win.equalsIgnoreCase("not_end") ||win.equalsIgnoreCase("comp"))
            {
            	if(win.equalsIgnoreCase("not_end"))
            	{
            	num=sc.nextInt();
            	if ((cm.getCell(num-1)).equals(Integer.toString(num))) 
        		{ 
        		if(cm.getTurn()==1)
                cm.setboard(num-1,"X");
            	else
            	cm.setboard(num-1,"O");

                if (cm.getTurn()==2) 
                    cm.setTurn("X"); 
                else
                 { 
                    cm.setTurn("O"); 
                 } 

                cm.printboard(); 
            	win = cm.isWinner();
            	}
            	else
            	System.out.println("This slot is taken. Kinldy re-enter slot number");
        	}
        	else if(win.equalsIgnoreCase("comp"))
        	{
        		if (cm.getTurn()==2) 
                    cm.setTurn("X"); 
                else
                 { 
                    cm.setTurn("O"); 
                 } 
                  cm.printboard(); 
            	win = cm.isWinner();
        	}
            }//end of while
            if(win.equals("X"))
            	System.out.println("You (X) have won. Game over"); 
            else if (win.equalsIgnoreCase("tie")) 
          		{ 
            	System.out.println("The game is a tie.  Game over"); 
        		} 
            else
            	System.out.println("Computer (O) has won. Game over");
         }//endof choice 2

		
		
	}//end of main
}//end of class
