import javax.swing.JFrame;
import java.awt.*;

public class DrawShapes extends JFrame{
	
	private int framewidth= 700, frameheight=500;
	
	public DrawShapes(){
		setBounds(100,100,framewidth,frameheight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0,0,framewidth,frameheight);
		
		g.setColor(Color.white);
		g.fillRect(50,70,100,50);
		
		g.setColor(Color.cyan);
		g.fillOval(150,150,200,200);
	}
	
	public static void main(String[] args){
		new DrawShapes();
	}
}