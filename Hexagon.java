
public class Hexagon 
{
	int row;
	int col;
	
	public Hexagon(int myRow, int myCol) 
	{
		row = myRow;
		col = myCol;
	}
	
	public int getRow() 
	{
		return this.row;
	}
	public int getCol() 
	{
		return this.col;
	}
	
	public int getX() 
	{
		if(this.row % 2 == 0) 
		{
			return this.row + 35;
		}
		return 0;
	}
}
