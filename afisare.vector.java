//1. Se citeste un numar n si un vector cu n componente numere intregi. 
//Sa se afiseze continutul componentelor vectorului.

import java.io.*;
	public class Vector {
	 public static void main(String[] args)throws IOException
	 { int n;
	 System.out.println("Primul program in Java care citeste si afiseaza elementele unui vector");
	 System.out.println ("Introduceti numarul de elemente n = ");
	 BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	 n = Integer.parseInt(stdin.readLine());
	 int V[] = new int[n];
	 int i;
	 for(i = n; i < n; i++)
	 {
	 System.out.print("V["+i+"]=");
	 V[i]=Integer.parseInt(stdin.readLine());
	 }
	 for(i = 0; i < n; i++)
	 System.out.println(V[i]);
	 }
	}