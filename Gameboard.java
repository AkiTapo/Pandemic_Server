package gameboardpackage;
import java.util.ArrayList;


public class Gameboard 
{		
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public Gameboard()
	{	
		
	}
	
	

	//A 2dimensionel array of objects with 'Cellcontent' class as the object
	public Cellcontent[][] gameboard  = new Cellcontent [4][4];

	for (int row = 0; row < gameboard.length; row++) 
	{

		for (int col = 0; col < gameboard.length; col++) 
		{
		
			
			gameboard[row][col] = new Cellcontent(row col);
		}
	}

}
