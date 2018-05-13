import java.util.ArrayList;

public class Board 
{
	public static Hexagon[][] gBoard = new Hexagon[11][11];
	
	public static void main(String[] args) 
	{
		for(int r = 0 ; r < 11; r++) 
		{
			for(int c = 0 ; c < 11; c++) 
			{
				Hexagon obj = new Hexagon(r,c);
				gBoard[r][c] = obj;
			}
		}
	}
	
	public static Hexagon[][] retList()
	{
		return gBoard;
	}
}
