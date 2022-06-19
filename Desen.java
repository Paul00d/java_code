import java.awt.*;

public class Desen extends Frame{
	Toolkit tool;
	int ww,hh;
	Font f = new Font("TimesRoman",10,15);
	Button b;
	
	Desen(){
		
		tool = getToolkit();
		Dimension dim = tool.getScreenSize();
		ww = dim.width;
		hh = dim.height;
		setTitle("Desen");
		b = new Button("Apasa");
		b.setBounds(475,55,60,20);
		add(b);
		
		TextField tf=new TextField(" "); // creaza un nou obiect de tip textfield ce contine valoarea 100 la deschiderea programului
		tf.setForeground(Color.black); // al doilea strat din background
		tf.setFont(f); // seteaza fontul
		tf.requestFocus(); //ducem focalizarea in caseta de text
		add(tf); // adauga la acest cointainer al ferestrei (adaugarea unei componente grafice)
		tf.setBounds(240,55,60,20); // pozitionare si dimensionare
		
		
		setVisible(true);
		resize(ww,hh);
	}
	
	public void paint(Graphics g){
		g.setColor(Color.pink);
		g.fillOval(150,150,200,200);
	}
	
	public boolean handleEvent(Event e){
		if(e.id == Event.WINDOW_DESTROY){System.exit(0);}
		return super.handleEvent(e);
	}
	
	public static void main(String[] args){
		new Desen();
		
	}
}