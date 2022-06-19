//3. Se citeste un numar natural n. Sa se calculeze 1+2+ . . . + n.
import java.io.*;
public class exemplu2
{
public static void main (String args[]) throws IOException
{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 System.out.println("numarul n = ");
 String s1 = br.readLine();
 int n = Integer.parseInt(s1);
 String s2 = br.readLine();
 int s=0,i;
 for(i=1;i<=n;i++) s+=i;
 System.out.println ("Suma este = "+s);
}
}