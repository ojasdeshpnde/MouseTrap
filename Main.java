import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame
{
	JFrame frame;
	JPanel panel;
	Board mB;
	private Image image;
	
	public Main() 
	{
		panel = new JPanel();
		this.setSize(500, 500);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(null);
		this.add(panel);
		this.setTitle("Mouse Trap");
		mB = new Board();
		image = Toolkit.getDefaultToolkit().getImage("hexagon_tuerkis.png");
		repaint();
	}
	
	public void paint(Graphics g) 
	{
		super.paintComponents(g);
		Graphics2D g2d = (Graphics2D)g;
		for(int i = 0; i < Board.retList().length; i = i + 2) 
		{
			for(int j = 0; j < Board.retList()[0].length; j = j +2) 
			{
				if(i == 0 && j == 0) 
				{
					g2d.drawImage(image, 100, 100, 50, 50, this);
				}
				else if(j == 0)
				{
					g2d.drawImage(image,(i*50),(100), 50,50,this);
				} 
				g2d.drawImage(image,(i*50),(j*50), 50,50,this);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		new Main();
	}
}
