import java.util.*;
public class TwoPlayers
{
//this class contains methods and attributes related to "2-player version of the game".
	private String[] board;
	private int turn;
	public TwoPlayers()
	{
		this.board = new String[9]; 
		this.turn=1;
		for (int i=0;i<9;i++) 
		{
			this.board[i]=Integer.toString(i+1);
		}
	}
	public void printboard()
	{
		System.out.println();
		System.out.println("| " + this.board[0] + " | "+ this.board[1] + " | " + this.board[2] + " |"); 
		System.out.println();
        System.out.println("| " + this.board[3] + " | "+ this.board[4] + " | " + this.board[5] + " |"); 
        System.out.println();
        System.out.println("| " + this.board[6] + " | "+ this.board[7] + " | " + this.board[8] + " |"); 
        System.out.println();
        
        
	}
	public int getTurn() 
     {
      return this.turn;
     }
     public String getCell(int n) 
     {
      return this.board[n];
     }

    public void setboard(int n,String t)
    {
    	this.board[n]=t;
    }
    public void setTurn(String t)
   {
   if(t.equals("X"))
   	this.turn=1;
   else
   	this.turn=2;
   }
    public String isWinner() 
    { 
        for (int i = 0; i < 8; i++) 
        { 
            String moves = null; 
  
            if(i==0)  
                moves = this.board[0] + this.board[1] + this.board[2]; 
            else if(i==1) 
                moves = this.board[3] + this.board[4] + this.board[5]; 
            else if(i==2)
                moves = this.board[6] + this.board[7] + this.board[8]; 
            else if(i==3) 
                moves = this.board[0] + this.board[3] + this.board[6]; 
            else if(i==4) 
                moves = this.board[1] + this.board[4] + this.board[7]; 
            else if(i==5)
                moves = this.board[2] + this.board[5] + this.board[8]; 
            else if(i==6) 
                moves = this.board[0] + this.board[4] + this.board[8]; 
            else  
                moves = this.board[2] + this.board[4] + this.board[6]; 
  
            if (moves.equals("OOO")) 
            { 
                return "O"; 
            } 

            else if (moves.equals("XXX")) 
            { 
                return "X"; 
            } 
        } 
          int flag=0;
        for (int i = 0; i < 9; i++) 
        { 

            if (this.board[i].equals(Integer.toString(i+1)))
                {
                	flag=1;
                	break;
                }
        } 
        
 		if(flag==1)
 		{
 			if(this.turn==1)
        	System.out.println("Player 1 (X) turn. Enter a slot number to place X [1-9]");
        	else
        	 System.out.println("Player 2 (O) turn. Enter a slot number to place O [1-9]");
        return "not_end"; 
    	}
    	else if(flag==0)
        	return "tie";
        return "tie";
    }

}
