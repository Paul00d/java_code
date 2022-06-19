import java.awt.*;
import javax.swing.*;


public class panouCuButoane extends Frame
{
    public Panel[] panou;
    int x=0,y=0, w=400,h=300, n=4;
	
public static void main(String args[]){
    new panouCuButoane();}

public panouCuButoane()
{	
	setBackground(Color.white);
    panou=new Panel[n];
    // setLayout(null);
    setLayout( null );  
    int i=0;
    for (Panel var : panou) {
        Button b=new Button();
        b.setBounds(100, 100, 90, 40);
        b.setBackground(Color.green);
        
        panou[i]=new Panel();
        panou[i].setLayout(null);
        panou[i].setBounds(x, y, w, h);
        panou[i].setBackground(Color.RED);

        panou[i].add(b);
        add(panou[i]);
        y+=h+1;
        if(y/h==2){x+=w+1; y=0;}
        i++;
    }
 resize(800, 600);
 move(200, 200);

 setVisible(true);
}
}