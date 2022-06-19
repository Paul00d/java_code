import java.awt.*;

public class Interfata1 extends Frame{
Toolkit tool;
Button start;
TextField tf,tf2,tf3,tf4;
Label l1,l2;
public Image backg, info;
Font f=new Font("TimesRoman", 1, 14);
int ww, hh; // dimiensiunile display-ului
String s1,s2,s4;
double s3;

public static void main (String args[]){new Interfata1 ();}

public Interfata1(){
	tool=getToolkit();
	Dimension res=tool.getScreenSize(); // ne da rezolutia care contine lungimea si inaltimea
	ww=res.width; // res e de tip dimension
	hh=res.height; // lunginea si latimea
	setResizable(true); // fereastra nu poate fi redimensionata cu mouse-ul
	
	setTitle("Suma a doua numere"); // seteaza titlul din bara de titlu a ferestrei
	setIconImage(tool.getImage(GetResources("images/ico.gif"))); // seteaza pictograma din bara de titlu a ferestrei
	setBackground(new Color(125,125,125)); // mostenita din clasa component , seteaza culoarea de background
	setLayout(null); // distruge managerul de proiect din acest cointainer al ferestrei pentru a le aranja asa cum dorim
	
	// crearea componentelor grafice
	tf=new TextField(" "); // creaza un nou obiect de tip textfield ce contine valoarea 100 la deschiderea programului
	tf.setForeground(Color.black); // al doilea strat din background
	tf.setFont(f); // seteaza fontul
	tf.requestFocus(); //ducem focalizarea in caseta de text
	add(tf); // adauga la acest cointainer al ferestrei (adaugarea unei componente grafice)
	tf.setBounds(240,55,60,20); // pozitionare si dimensionare
	
	
	
	l1=new Label("+");
	add(l1);
	l1.setBounds(225,55,60,20); 
	

	
	// crearea componentelor grafice
	tf2=new TextField(); // creaza un nou obiect de tip textfield ce contine valoarea 100 la deschiderea programului
	tf2.setForeground(Color.black); // al doilea strat din background
	tf2.setFont(f); // seteaza fontul
	 
	add(tf2); // adauga la acest cointainer al ferestrei (adaugarea unei componente grafice)
	tf2.setBounds(175,55,60,20); // pozitionare si dimensionare
	
	l2=new Label("=");
	
	add(l2);
	l2.setBounds(300,55,60,20); 
	
	
	// crearea componentelor grafice
	tf3=new TextField(); // creaza un nou obiect de tip textfield ce contine valoarea 100 la deschiderea programului
	
	tf3.setForeground(Color.black); // al doilea strat din background
	tf3.setFont(f); // seteaza fontul
	
	
	 
	add(tf3); // adauga la acest cointainer al ferestrei (adaugarea unei componente grafice)
	tf3.setBounds(360,55,60,20); // pozitionare si dimensionare
		
	start=new Button("Calculeaza");// creat un nou buton , adaugat si pozitionat
	add(start);
	start.setBounds(475,55,60,20);
	resize(ww,hh);
	setVisible(true);
}
public java.net.URL GetResources(String s) {return this.getClass().getResource(s);}
public boolean handleEvent(Event e){
	if(e.id == Event.WINDOW_DESTROY){System.exit(0);}
	if(e.id == Event.ACTION_EVENT){
		if((e.target).equals(start)){
			s1=tf2.getText();
			s2=tf.getText();
			s3=Double.parseDouble(s1)+Double.parseDouble(s2);
			s4 = ""+s3;
			tf3.setText(s4);
		}
	}
	return super.handleEvent(e);
}
}