//5. Se citeste un numar n natural. Sa se verifice daca este numar prim sau nu.
//Exemplu: Pentru n=12 obtinem NU ESTE numar PRIM, iar pentru n=11 obtinem ESTE
//numar PRIM.
import java.io.*;
public class l2_5
{
public static void main (String args[]) throws IOException
{
 InputStreamReader isr = new
InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 System.out.println("numarul n = ");
 String s1 = br.readLine();
 int n = Integer.parseInt(s1);
 int i=2;
 boolean prim=true;
 while(i<=n/2)
 {
 if(n%i==0) prim=false;
 i++;
 }
 if(prim==true) System.out.println(n+" ESTE numar PRIM!");
 else System.out.println(n+" NU ESTE numar PRIM! ");
 }
}