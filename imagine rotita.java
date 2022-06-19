import java.awt.*;
import java.applet.Applet;
import java.net.URL;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
import java.io.IOException;

public class Exam extends Applet{
	
	MediaTracker mt;
	BufferedImage sunset;
		Toolkit tool;
		Graphics g;

	public void init(){
		
		   // sunset = ImageIO.read(new File("sunset.jpg"));

	sunset=getImage(getDocumentBase(),"sunset.jpg");
	/* public URL GetResources(String s) {return this.getClass().getResource(s);}
	public void Exam(){
		tool=getToolkit();
	sunset=tool.getImage(GetResources("images/sunset.jpg"));
	mt.addImage(sunset,1);
	*/
	}
							
	public static BufferedImage rotate(BufferedImage img) {  
      int w = img.getWidth();  
      int h = img.getHeight();  
      BufferedImage newImage = new BufferedImage(w, h, img.getType());
      Graphics2D g2 = newImage.createGraphics();
      g2.rotate(Math.toRadians(90), w/2, h/2);  
      g2.drawImage(img,null,0,0);
      return newImage;  
  }
	 public void paint(Graphics g){
        int ww = size().width, hh = size().height;
		rotate(sunset);
    	/*for(int i = 0; i <= (int)(ww/176); i++)
    		for(int j = 0; j <= (int)(hh/136); j++) 
    		//	g.drawImage(ex.backg, i*176, j*136, this);*/
        /*g.drawImage(sunset, (ww-sunset.getWidth(this))/2, (hh-sunset.getHeight(this))/2, this);
				int source_x = 0;
                int source_y = 0;
                int source_width = sunset.getWidth(this);
                int source_height = sunset.getHeight(this);
                int dx = sunset.getWidth(this);
                int dy = 0;
                 
                //copy horizontally
             /*   for(int i = 0; i < 3; i++){
                    g.copyArea(
                        source_x,
                        source_y,
                        source_width,
                        source_height,
                        dx,
                        dy);
                    dx += source_width;
                }*/
			/*	source_x = 0;
                source_y = 0;
                source_width = sunset.getWidth(this) * 4;
                source_height = sunset.getHeight(this);
                dx = 0;
                dy = sunset.getHeight(this);
                g.copyArea(
                        source_x,
                        source_y,
                        source_width,
                        source_height,
                        dx,
                        dy);*/

				
    }

	
	
	
	
}