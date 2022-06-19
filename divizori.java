//4. Se citeste un numar n natural. Sa se afiseze toti divizorii numarului dat.
//Exemplu: Pentru n=12 obtinem {1,2,3,4,6,12}.
import java.io.*;
public class l2_4
{
public static void main (String args[]) throws IOException
{
 InputStreamReader isr = new
 InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(isr);
 System.out.println("numarul n = ");
 String s1 = br.readLine();
 int n = Integer.parseInt(s1);
 int i=1;
 while(i<=n)
 {
 if(n%i==0) System.out.print(i+", ");
 i++;
 }
 }
}