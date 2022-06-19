import java.awt.*;
import java.util.Random;


public class Panouri extends Frame{
	private static Panou[][] panouri;
	
	public static void main(String[] args){
		new Panouri();
				
	}
	public Panouri(){
		setVisible(true);
		setSize(600,600);
		panouri = new Panou[3][3];
		int rW=200;
		int rH=200;
		setLayout(new GridLayout(3,3));
		for( int i =0;i<3;i++)
			for(int j=0;j<3;j++)
			{
			panouri[i][j] = new Panou();
			add(panouri[i][j]);
			//panouri[i][j].setBounds(i*rW,j*rH,rW,rH);
			}					
	}	
	public boolean handleEvent(Event e){
		if(e.id==Event.WINDOW_DESTROY){
			System.exit(0);
		}
		return super.handleEvent(e);		
	}
}
class Panou extends Panel{
	Image img;
	int ww, hh;
	Panou(){
		ww= this.getWidth();
		hh=this.getHeight();
		img= createImage(ww,hh);
		setVisible(true);
		Color col= new Color(new Random().nextInt(255)%127 +127, new Random().nextInt(255)%127 +127,new Random().nextInt(255)%127 +127);
		setBackground(col);
		setForeground(Color.black);
	}
	public void paint (Graphics g){


	}
	public void traseazaDiagonale(){
			Graphics g = getGraphics();
			//g.drawLine(
		
	}
}
