import java.applet.*;
import  java.awt.*;

public class arie_triunghi{
	
	static double a, b, c,p,A;
	
	public static void main(String[]args){

        try{a = Double.valueOf(args[0]).doubleValue();}
        catch(Exception e){return;}
        try{b = Double.valueOf(args[1]).doubleValue();}
        catch(Exception e){return;}  
        try{c = Double.valueOf(args[2]).doubleValue();}
        catch(Exception e){return;}           	
	new arie_triunghi(a, b, c);
	}
	
	public arie_triunghi(double a, double b, double c){
		if(a>0 && b>0 && c>0)
		{
			p=(a+b+c)/2;
			A = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}
        else
				System.out.println("Numerele nu formeaza un triunghi!");
		write(a,b,c,A);
	}
	
	public void write(double a,double b,double c, double A){
	System.out.println("<HTML>");
	System.out.println("<CENTER>");
	System.out.println("<H2>Aria triunghiului</H2>");
	System.out.println("<HR>");
	System.out.println("A&#355;i introdus parametrii: a = " + a + ",  b = " + b + ",  c = " + c);
	System.out.println("<BR>");
	String b1, c1;
	if(b<0) b1 = "- " + (-b); else b1 = "+ " + b;
	if(c<0) c1 = "- " + (-c); else c1 = "+ " + c;
	System.out.println("Aria este:  " +A );
	System.out.println("<HR>");
	
	System.out.println("</BODY>");
	System.out.println("</HTML>");	
	openOutputDataFile();	
}


}