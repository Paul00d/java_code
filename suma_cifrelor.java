//1. Se citeste un numar n natural. Sa se calculeze suma cifrelor lui.
//Exemplu: Pentru n=124 obtinem s=7.
import java.io.*;
public class l2_1
{
public static void main (String args[]) throws IOException
{
 int i;
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 System.out.println("numarul n = ");
 String s1 = br.readLine();
 int n = Integer.parseInt(s1);
 int s=0;
 while(n!=0)
{
 s+=n%10;
 n/=10;
}
 System.out.println ("Suma cifrelor numarului date este egala
cu = "+s);
}
}
