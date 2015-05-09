
public class Math {
	
	private int[] values;
	private double result = 0;

	public Math(){
		this.values = new int[5];
		for(int i = 0; i < values.length; i++){
			values[i] = i;
		}
	}
	
	public Math(int[] a){
		this.values = a;
	}
	
	public int[] getValues(){
		return values;
	}
	public double getResult(){
		return result;
	}
	public int getValue(int pos){
		try {
			return values[pos];
		} catch (Exception e){
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	public void setValue(int pos, int newValue){
		this.values[pos] = newValue;
	}
	
	public void setValues(int[] x){
		this.values = x;
	}

	public void print(){
		for(int i = 0; i < this.values.length; i++){
			System.out.print(this.values[i] + " ");
		}
		System.out.println("\n" + this.result);
	}
	/*
	 * Method that returns the sum of X and Y
	 */
	public double add(){
		this.result = 0;
		for(int i = 0; i < this.values.length; i++){
			this.result += this.values[i];
		}
		return this.result;
	}
	public double subtract(){
		this.result = 0;
		for(int i = 0; i < this.values.length; i++){
			this.result -= this.values[i];
		}
		return this.result;
	}
	public double multiply(){
		this.result = this.values[0];
		for(int i = 1; i < this.values.length; i++){
			this.result *= this.values[i];
		}
		return this.result;
	}
	public double divide(){
		this.result = this.values[0];
		try {
			for(int i = 1; i < this.values.length; i++){
				this.result /= this.values[i];
			}
			return this.result;
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return this.result = 0;
		}
	}
}
