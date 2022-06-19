class Dreptunghi {
double x, y, w, h;
Dreptunghi(double x1, double y1, double w1, double h1) {
// Cel mai general constructor
x=x1; y=y1; w=w1; h=h1;
System.out.println("Instantiere dreptunghi");
}
Dreptunghi(double w1, double h1) {
// Constructor cu doua argumente
x=0; y=0; w=w1; h=h1;
System.out.println("Instantiere dreptunghi");
}
Dreptunghi() {
// Constructor fara argumente
x=0; y=0; w=0; h=0;
System.out.println("Instantiere dreptunghi");
}

public static void main(String[] args){
	Dreptunghi dreptunghi = new Dreptunghi(1,2,1,2);
}
}

