package gameboardpackage;

public class Gameboard 
{
		
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