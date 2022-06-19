import java.awt.*;
import java.net.*;
import java.io.*;

class Bara extends Frame {     
   
public static void main (String args[]){new Bara();}


Bara(){
    //Dimension res=getToolkit().getScreenSize();
    //setBackground(new Color(38, 104, 165));
    //setForeground(new Color(255,255,0));    
    //setResizable(false);       
    adaugaMenuBar(); 
    setTitle("Exemplu");                  
    resize(400,400);
    //move((int)((res.width-400)/2),(int)((res.height-400)/2));
	
	TextArea ta=new TextArea();
	add(ta);
	
    show();     	
}

void adaugaMenuBar(){
    MenuBar men=new MenuBar();    
    Menu f = new Menu("Edit");
    f.add("Cut");
    f.add("Copy");
    f.add("Paste");
    f.add("Delete");  
    men.add(f);
    setMenuBar(men); 
	
	
}

}