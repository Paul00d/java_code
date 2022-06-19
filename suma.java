//Vom incepe prin a prezenta cateva elemente de baza – structura oricarei aplicatii Java, 
//citirea de la tastatura a datelor, suma a 2 variabile de tip int si afisarea pe ecran.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class JavaBasics
{
   public static void main(String []args) throws IOException
   {
      // Declarare variabile
      int a, b, suma;
      String s;
      // Pregatim citirea datelor de la tastatura
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // Citim valoarea variabilei a
      System.out.print("a = ");
      s = br.readLine();
      a = Integer.parseInt(s);
      // Citim valoarea variabilei b
      System.out.print("b = ");
      s = br.readLine();
      b = Integer.parseInt(s);
      suma = a + b;
      // Afisam suma celor 2 variabile
      System.out.println("Suma a+b este: " + suma);
   }
}