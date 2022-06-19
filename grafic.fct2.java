import java.awt.*;
import java.applet.Applet;
public class grafic extends Applet{//clasa publica numita grafic acare extinde clasa Applet 
	Image bkg;
	int ww,hh;
	double a,b,c;//coeficientii
	Color colAxe=Color.black,colGrafic=Color.red;
	boolean deseneaza=true;//controleaza daca afisam sau nu graficul
	public void init(){
		ww=size().width;
		hh=size().height;
		String s=getParameter("background");
		if(s!=null)loadImages(s);
		s=getParameter("a");
		if(s!=null)a=Double.valueOf(s).doubleValue();else deseneaza=false;
		s=getParameter("b");
		if(s!=null)b=Double.valueOf(s).doubleValue();else deseneaza=false;
		s=getParameter("c");
		if(s!=null)c=Double.valueOf(s).doubleValue();else deseneaza=false;
		repaint();
		
	}
	public void update(Graphics g){
		if(bkg!=null)//daca e nenul
			for(int i=0;i<=(int)(ww/bkg.getWidth(this));i++)//desenam rand dupa rand ww-latimea appletului ,impartim latimea appletului la latimea pozei
				for(int j=0;j<=(int)(hh/bkg.getHeight(this));j++)
					g.drawImage(bkg,i*bkg.getWidth(this),j*bkg.getHeight(this),this);//latimea pozei inmultita de trei ori,ultimii doi parametrii repezinta colturile imaginii
				if(deseneaza){axe(g);trace(g);}
	}
public void paint(Graphics g){update(g);}
void loadImages(String nume){
MediaTracker mt=new MediaTracker(this);
bkg=getImage(getDocumentBase(),nume);
mt.addImage(bkg,0);
try{mt.waitForAll();}
catch(InterruptedException e){}
}
public void axe(Graphics g){//primeste un oiect de tipul graphics
	g.setColor(colAxe);
	g.drawLine(10,hh/2,ww-10,hh/2);//primii doi primul punct ultimii doi al doilea punct rezulta un segment,axa orizontala
	g.drawLine(ww/2,10,ww/2,hh-10);//axa verticala
	for(int i=20;i<ww-20;i+=10)g.drawLine(i,hh/2-2,i,hh/2+2);//gradatiile pe cele  2 axe
	for(int j=20;j<hh-20;j+=10)g.drawLine(ww/2-2,j,ww/2+2,j);
}
public void trace(Graphics g){//deseneaza graficul functiei de gradul 2
	g.setColor(colGrafic);//se seteaza culoare in contextul grafic
	for(int x=20;x<ww-20;x++)//deseneaza graficul ,1-pixel
		g.drawLine(x,(int)functie(x-ww/2)+hh/2,x+1,(int)functie(x-ww/2+1)+hh/2);//facem translatii
	int x=(int)(-b/(2*a));//vaful
	int y=(int)functie(x);
	g.drawLine(x+ww/2,hh/2,x+ww/2,y+hh/2);
	g.drawLine(ww/2,y+hh/2,x+ww/2,y+hh/2);
	}
	double functie(double x){return -(a*x*x+b*x+c);}//valarea functiei am pus minus pentru a rasturna graicul
}