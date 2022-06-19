import java.awt.*;
import java.applet.Applet;

public class Hexagon extends Applet{
	//Points[] p;
	Image im;
	Graphics g2,g,img;
	Button start;
	//public InfoPanel1 InfoPanel1;
	TextField tf;
	int raza=50;
	int c;
		public void init(){
	im = createImage(size().width, size().height);
		img = im.getGraphics();}
		
	/*tf=new TextField("50");
		tf.setForeground(Color.blue);
		//tf.setFont(f);
		tf.requestFocus();
		add(tf);
		tf.setBounds(275,55,80,20);
		
	start= new Button("START");
		add(start);
		start.setBounds(470,55,80,20);
		}
	
	public boolean handleEvent(Event e){
	if(e.id==Event.WINDOW_DESTROY){System.exit(0);}
	switch(e.id){
		default: break;
		case 1001: 
		if(e.target==start){
			tf.requestFocus();
			
			parse(tf.getText());
			repaint();
		}
		break;
	}
	return super.handleEvent(e);
}
	public void parse(String tf){
		
		 int c=Integer.parseInt(tf);
	
	}
	
	*/
					   
	public void paint(Graphics g){
		Graphics2D g2=(Graphics2D )g;
		
		 setBackground(Color.white);
  g.setColor(Color.red);
  
  //String d= tf.getText();
	//int c=Integer.parseInt(d);
	//g.drawLine(10,10,30,30);
  g.fillOval(10,10,raza*2,raza*2);
  g2.setColor(Color.yellow);
	g2.drawRect(10,10,raza*2,raza*2);	
	g.drawLine(10,10,raza,raza);
	g.drawLine(50,50,2*raza,2*raza);
	//g.fillPolygon(xPoints,yPoints,3);
	//g.drawPolygon(Color.black,curvePoints);
	
	}
	
	
	
}

