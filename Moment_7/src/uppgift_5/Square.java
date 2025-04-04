package uppgift_5;
import java.awt.*;

public class Square {

	private int xPos;
	private int yPos;
	private int side; 
	private Color color;

	public Square(int xPos, int yPos, int side, Color color){   	
		this.xPos = xPos;
		this.yPos = yPos;
		this.side = side;
		this.color = color;
	}

	public void setColor(Color color){
		this.color = color;
	}

	public void setPos(int XPos, int YPos) {
		this.xPos = XPos;
		this.yPos = YPos;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public void draw(Graphics g){
		g.setColor(color);
		g.fillRect(xPos,yPos,side,side);
	}
}
