import java.awt.event.*;
import java.awt.*;
public class Dialog{}

public class AddText extends Dialog implements TextListener{
	TextField tf;
	AddText(){tf=new TextField(" ");
	add(tf);
	tf.addTextListener(this);}
	public void textValueChanged(TextEvent e){
if ((TextField)e.getSource()==tf) System.out.println(tf.getText());}}