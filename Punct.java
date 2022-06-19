package java.applet;
package java.awt.dnd;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.applet.Applet.*;


public class Punct extends Applet{
	int x;
	Color colPunct=Color.black;
	Color colCerc=Color.red;
	boolean deseneaza=true;

 void punct(int x){
	this.x=x;
 }

public void mouseDragged(MouseEvent e) {
	}
}