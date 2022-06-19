import java.awt.*;
public class Triunghi{
	public Point p1;
	public Point p2;
	public Point p3;
	
	public Triunghi(){
		p1 = new Point(100,100);
		p2 = new Point(250,200);
		p3 = new Point(300,350);
	}
	
	public void moveTriangle(int dx,int dy)
	{
		p1.move(dx,dy);
		p2.move(dx,dy);
		p2.move(dx,dy);
	}
	
	public void drawTriangle(Graphics g){
		
		g.drawLine(p1.getX(),p1.getY(),p2.getX(),p2.getY());
		g.drawLine(p2.getX(),p2.getY(),p3.getX(),p3.getY());
		g.drawLine(p3.getX(),p3.getY(),p1.getX(),p1.getY());
	}
}
