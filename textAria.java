

import java.awt.*;
import java.net.*;
import javafx.scene.text.Font;
import java.io.*;
import javax.swing.*;


class textAria extends Frame {                 
    String data;  
    TextArea text_Aria;

public static void main (String args[]){new textAria();}


textAria(){
    
    setBackground(new Color(38, 104, 165));
    setForeground(new Color(255,255,0));
    setTitle("Text Aria");                  
    resize(1000, 600);
    
    adugaTextAria();
    adaugaMenuBar(); 
    

    show();     	
}

void adaugaMenuBar(){
    MenuBar men=new MenuBar();    
    Menu f = new Menu("Edit");
    f.add("Copy");
    f.add("-");
    f.add("Cut");
    f.add("-");
    f.add("Paste");
    f.add("-");
    f.add("Delete");
    f.add("-");
    f.add("Exit");    
    men.add(f);
    setMenuBar(men);    
}

void adugaTextAria()
{
     text_Aria=new TextArea(10, 10);  
    add(text_Aria);
    text_Aria.setForeground(Color.BLACK);

}
public boolean handleEvent(Event e){
    if(e.id==Event.WINDOW_DESTROY){
    	System.exit(0);
    }else if(e.id==Event.ACTION_EVENT && e.target instanceof MenuItem){
        if("Exit".equals(e.arg)){
            System.exit(0);
        }else if("Copy".equals(e.arg)){data=text_Aria.getText(); }
        else if("Cut".equals(e.arg)){  data=text_Aria.getText(); text_Aria.setText(""); }
        else if("Paste".equals(e.arg)){  text_Aria.setText( text_Aria.getText()+data); }
        else if("Delete".equals(e.arg)){  text_Aria.setText(""); data=""; }             	
    }
    else return false;	
    return super.handleEvent(e);
}

}