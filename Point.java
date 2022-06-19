public class Point{
	public int x;
	public int y;
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setX(int X){
		x=X;
	}
	public void setY(int Y){
		y=Y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void move(int dx,int dy){
		x += dx;
		y += dy;
	}
	public String toString(){
		return("X= "+x+" Y= "+y);
	}
}