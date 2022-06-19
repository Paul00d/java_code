//2. Sa se rezolve ecuatia: ax+b=0, a,b nr. reale.
import java.io.*;
public class exemplu1
{
public static void main (String args[]) throws IOException
{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 String s1 = br.readLine();
 double a = Double.parseDouble(s1);
 System.out.println("numarul a = "+s1);
 String s2 = br.readLine();
 double b = Double.parseDouble(s2);
 System.out.println("numarul b = "+s2);
 if ( a == 0 )
 if(b==0) System.out.println ("Infinitate de solutii !");
 else System.out.println ("Nu are solutie !");
 else
 { System.out.print("Solutia x = "); System.out.println (-b/a); }
}
}
