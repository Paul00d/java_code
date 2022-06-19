import java.io.*;

public class ScriereInFisier{
	
	public static void main(String[] args){
	String fileName = "citeste.txt";
	
	try{
		FileWriter fr = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fr);
		
		bw.write("Aceasta este prima linie din fisier.");
		bw.write("\nAceasta este a treia linie din fisier.");
		bw.write("\nNu stiu ce sa mai scriu :)");
		bw.write("\nCam atat, ajunge sigur :) ");
		
		bw.close();
		
	}
	
	catch(IOException e){
		System.out.println("Eroare la scriere in fisier");
	}
	
	
	}
}