public class Salut{
	public static void main(String args[]){
		if(args.length == 0){
			System.out.println("Nr insuficient de argumente!");
			System.exit(-1); // term aplicatia
		}
		String nume = args[0];
		String prenume;
		if(args.length >= 1)
			prenume = args[1];
		else
			prenume = ""; // val implicita
		System.out.println("Salut "+ nume +" "+ prenume);
	}
}
