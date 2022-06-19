class Complex{
	private double real;
	private double imag;
	
	public Complex(double real, double imag){
		this.real=real;
		this.imag=imag;
	}
	public Complex(){
		this(1,0);
	}
	public boolean equals(Object obj){
		if(obj==null) return false;
		if(!(obj instanceof Complex)) return false;
		
		Complex comp = (Complex) obj;
		return ( comp.real== real && comp.imag==imag);
	}
	public Object clone(){
		return new Complex(real,imag);
	}
	public String toString(){
		String semn = (imag>0 ? "+" : "-");
		return real + semn + imag + "i";
	}
	public Complex aduna(Complex comp){
		Complex suma =  new Complex(0,0);
		suma.real = this.real + comp.real;
		suma.imag = this.imag + comp.imag;
		return suma;
	}
}
public class TestComplex{
	public static void main(String c[]){
		Complex c1 = new Complex(1,2);
		Complex c2 = new Complex(2,3);
		Complex c3 = (Complex) c1.clone();
		System.out.println(c1.aduna(c2)) ; // 3.0 + 5.0 i
		System.out.println(c1.equals(c2)) ; // false
		System.out.println(c1.equals(c3)) ; // true
	}
}