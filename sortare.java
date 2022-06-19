//3. Se citeste un numar n si un vector cu n componente numere reale. 
//Sa se afiseze elementele vectorului sortate crescator. Se va utiliza metoda sortarii prin interschimbare.

import java.io.*;
	public class Vector2 {
	 public static void main(String[] args)throws IOException
	 {
	 int n;
	 System.out.print ("Introduceti numarul de elemente n = ");
	 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	 n = Integer.valueOf(reader.readLine());
	 double V[]=new double[n];
	 int i,j;
	 double temp;
	 for(i = 0; i < n; i++)
	 {
	 System.out.print("V[" + i + "]=");
	 V[i] = Double.parseDouble(reader.readLine());
	 }
	 for(i = 0; i < n-1 ;i++)
	 for(j = i+1; j < n; j++)
	 if(V[i] > V[j])
	 {
	 temp = V[i];
	 V[i] = V[j];
	 V[j] = temp;
	 }
	 for(i = 0; i < n; i++)
	 System.out.print(V[i] + " ");
	 }
	}