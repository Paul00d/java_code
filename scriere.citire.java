//1. In fisierul text date.in se afla un numar natural n. Se cere sa se scrie in fisierul date.out patratul si
//cubul numarului n.

import java.io.*;
import java.util.*;
class fisier1
{
public static void main(String[] args) throws IOException
{
int n;
FileInputStream f=new FileInputStream("date1.in");
InputStreamReader fchar=new InputStreamReader(f);
BufferedReader buf=new BufferedReader(fchar);
n=Integer.parseInt(buf.readLine());
FileOutputStream g=new FileOutputStream("date1.out");
PrintStream gchar=new PrintStream(g);
gchar.println(n*n);
gchar.println(n*n*n);
}
}
