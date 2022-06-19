import java.awt.*;
import java.awt.event.*;

public class Exemplu extends Frame implements TextListener{
	TextField tf;
	
public Exemplu(){
		tf=new TextField(" ");
	add(tf);
	setLayout(null);
	tf.setBounds(100,100,300,25);
	tf.addTextListener(this);
	resize(500,500);
	show();
	
}
public void textValueChanged(TextEvent e){
	if((TextField) e.getSource()==tf)
		System.out.println( tf.getText());
}
public static void main(String[] args){
	new Exemplu();
	
	
}
}
	
