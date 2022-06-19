//2. Se citeste un numar n si un vector cu n componente numere intregi. 
//Sa se afiseze valoarea maxima continuta in vector.

import java.io.*;
	public class Vector1 {
	 public static void main(String[] args)throws IOException
	 {
	 int n;
	 System.out.print ("Introduceti numarul de elemente n = ");
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 n = Integer.valueOf(reader.readLine());
	 int V[] = new int[n];
	 int i;
	 for(i = 0;i < n; i++)
	 {
	 System.out.print("V["+i+"]=");
	 V[i]=Integer.valueOf(reader.readLine());
	 }
	 int max = V[0];
	 for(i = 1;i < n; i++)
	 if(max < V[i]) max = V[i];
	 System.out.println("Valoarea maxima este " + max);
	 }
	}