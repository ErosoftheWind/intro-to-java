
public class Math {
	
	private int X;
	private int Y;

	public Math(){
		this.X = 1;
		this.Y = 2;
	}
	
	public Math(int a, int b){
		this.X = a;
		this.Y = b;
	}
	
	public int getX(){
		return X;
	}
	public int getY(){
		return Y;
	}
	public void setX(int X){
		this.X = X;
	}
	public void setY(int Y){
		this.Y = Y;
	}
	public void print(){
		System.out.println(this.Y + " " + this.X);
	}
	/*
	 * Method that returns the sum of X and Y
	 */
	public int add(){
		return this.X + this.Y;
	}
	public int subtract(){
		return this.X - this.Y;
	}
}
