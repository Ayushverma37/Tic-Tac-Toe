import java.util.*;
public class Comp
{
//this class contains methods and attributs related to "Player vs Computer" version.
	private String[] board;
	private int turn;
	public Comp()
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
   public int CompMove()
   {
   	//this method makes logical moves by computer. Hence it is optimised
    int c=0;
    for (int i=0;i<9 ;i++ )
     {
        if(this.board[i].equals(Integer.toString(i+1)))
            c++;
     }
     if(c==8)
     {
        if(this.board[4].equals(Integer.toString(5)))
            return 4;
        else
            for (int i=0;i<9 ;i++ ) {
                if(this.board[i].equals(Integer.toString(i+1)))
                    return i;
            }
     }//end of c==1
     else
     {
//cases of winning by computer
        if(this.board[0].equals("O") && this.board[1].equals("O") &&this.board[2].equals(Integer.toString(3)))
            return 2;
        else if(this.board[1].equals("O") && this.board[2].equals("O") &&this.board[0].equals(Integer.toString(1)))
            return 0;
        else if(this.board[0].equals("O") && this.board[3].equals("O") &&this.board[6].equals(Integer.toString(7)))
            return 6;
        else if(this.board[3].equals("O") && this.board[6].equals("O") &&this.board[0].equals(Integer.toString(1)))
            return 0;
        else if(this.board[3].equals("O") && this.board[4].equals("O") &&this.board[5].equals(Integer.toString(6)))
            return 5;
        else if(this.board[4].equals("O") && this.board[5].equals("O") &&this.board[3].equals(Integer.toString(4)))
            return 3;
        else if(this.board[1].equals("O") && this.board[4].equals("O") &&this.board[7].equals(Integer.toString(8)))
            return 7;
        else if(this.board[4].equals("O") && this.board[7].equals("O") &&this.board[1].equals(Integer.toString(2)))
            return 1;
        else if(this.board[6].equals("O") && this.board[7].equals("O") &&this.board[8].equals(Integer.toString(9)))
            return 8;
        else if(this.board[7].equals("O") && this.board[8].equals("O") &&this.board[6].equals(Integer.toString(7)))
            return 6;
        else if(this.board[2].equals("O") && this.board[5].equals("O") &&this.board[8].equals(Integer.toString(9)))
            return 8;
        else if(this.board[5].equals("O") && this.board[8].equals("O") &&this.board[2].equals(Integer.toString(3)))
            return 2;
        else if(this.board[0].equals("O") && this.board[4].equals("O") &&this.board[8].equals(Integer.toString(9)))
            return 8;
        else if(this.board[4].equals("O") && this.board[8].equals("O") &&this.board[0].equals(Integer.toString(1)))
            return 0;
        else if(this.board[2].equals("O") && this.board[4].equals("O") &&this.board[6].equals(Integer.toString(7)))
            return 6;
        else if(this.board[4].equals("O") && this.board[6].equals("O") &&this.board[2].equals(Integer.toString(3)))
            return 2;
        else if(this.board[0].equals("O") && this.board[2].equals("O") &&this.board[1].equals(Integer.toString(2)))
            return 1;
        else if(this.board[0].equals("O") && this.board[6].equals("O") &&this.board[3].equals(Integer.toString(4)))
            return 3;
        else if(this.board[3].equals("O") && this.board[5].equals("O") &&this.board[4].equals(Integer.toString(5)))
            return 4;
        else if(this.board[1].equals("O") && this.board[7].equals("O") &&this.board[4].equals(Integer.toString(5)))
            return 4;
        else if(this.board[6].equals("O") && this.board[8].equals("O") &&this.board[7].equals(Integer.toString(8)))
            return 7;
        else if(this.board[2].equals("O") && this.board[8].equals("O") &&this.board[5].equals(Integer.toString(6)))
            return 5;
        else if(this.board[0].equals("O") && this.board[8].equals("O") &&this.board[4].equals(Integer.toString(5)))
            return 4;
        else if(this.board[2].equals("O") && this.board[6].equals("O") &&this.board[4].equals(Integer.toString(5)))
            return 4;


//cases to block win of player
        else if(this.board[0].equals("X") && this.board[1].equals("X") &&this.board[2].equals(Integer.toString(3)))
            return 2;
        else if(this.board[1].equals("X") && this.board[2].equals("X") &&this.board[0].equals(Integer.toString(1)))
            return 0;
        else if(this.board[0].equals("X") && this.board[3].equals("X") &&this.board[6].equals(Integer.toString(7)))
            return 6;
        else if(this.board[3].equals("X") && this.board[6].equals("X") &&this.board[0].equals(Integer.toString(1)))
            return 0;
        else if(this.board[3].equals("X") && this.board[4].equals("X") &&this.board[5].equals(Integer.toString(6)))
            return 5;
        else if(this.board[4].equals("X") && this.board[5].equals("X") &&this.board[3].equals(Integer.toString(4)))
            return 3;
        else if(this.board[1].equals("X") && this.board[4].equals("X") &&this.board[7].equals(Integer.toString(8)))
            return 7;
        else if(this.board[4].equals("X") && this.board[7].equals("X") &&this.board[1].equals(Integer.toString(2)))
            return 1;
        else if(this.board[6].equals("X") && this.board[7].equals("X") &&this.board[8].equals(Integer.toString(9)))
            return 8;
        else if(this.board[7].equals("X") && this.board[8].equals("X") &&this.board[6].equals(Integer.toString(7)))
            return 6;
        else if(this.board[2].equals("X") && this.board[5].equals("X") &&this.board[8].equals(Integer.toString(9)))
            return 8;
        else if(this.board[5].equals("X") && this.board[8].equals("X") &&this.board[2].equals(Integer.toString(3)))
            return 2;
        else if(this.board[0].equals("X") && this.board[4].equals("X") &&this.board[8].equals(Integer.toString(9)))
            return 8;
        else if(this.board[4].equals("X") && this.board[8].equals("X") &&this.board[0].equals(Integer.toString(1)))
            return 0;
        else if(this.board[2].equals("X") && this.board[4].equals("X") &&this.board[6].equals(Integer.toString(7)))
            return 6;
        else if(this.board[4].equals("X") && this.board[6].equals("X") &&this.board[2].equals(Integer.toString(3)))
            return 2;
        else if(this.board[0].equals("X") && this.board[2].equals("X") &&this.board[1].equals(Integer.toString(2)))
            return 1;
        else if(this.board[0].equals("X") && this.board[6].equals("X") &&this.board[3].equals(Integer.toString(4)))
            return 3;
        else if(this.board[3].equals("X") && this.board[5].equals("X") &&this.board[4].equals(Integer.toString(5)))
            return 4;
        else if(this.board[1].equals("X") && this.board[7].equals("X") &&this.board[4].equals(Integer.toString(5)))
            return 4;
        else if(this.board[6].equals("X") && this.board[8].equals("X") &&this.board[7].equals(Integer.toString(8)))
            return 7;
        else if(this.board[2].equals("X") && this.board[8].equals("X") &&this.board[5].equals(Integer.toString(6)))
            return 5;
        else if(this.board[0].equals("X") && this.board[8].equals("X") &&this.board[4].equals(Integer.toString(5)))
            return 4;
        else if(this.board[2].equals("X") && this.board[6].equals("X") &&this.board[4].equals(Integer.toString(5)))
            return 4;


        else
        {
            for (int i=0;i<9 ;i++ ) 
            {

                if(this.board[i].equals(Integer.toString(i+1)))
                    return i;
            }
        }

     }//end of c==2
     return 0;
   }//end of CompMove()
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
 			{
        	System.out.println("Player 1 (X) turn. Enter a slot number to place X [1-9]");
        	return "not_end";
        	}
        	else
        	{
        	 int i=this.CompMove();
        	 		System.out.println("Computer (O) has chosen "+(i+1));
        	 		this.setboard(i,"O");
        	 		this.setTurn("O");	
        	 		return "comp";
        	 		
        	 
        	}
         
    	}
    	else if(flag==0)
        	return "tie";
        return "tie";
    }//end of isWinner
}//end of class
