
public class Math {
	
	private int[] values;
	private int result = 0;

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
	public int getResult(){
		return result;
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
	public int add(){
		this.result = 0;
		for(int i = 0; i < this.values.length; i++){
			this.result = this.result + this.values[i];
		}
		return this.result;
	}
	public int subtract(){
		this.result = 0;
		for(int i = 0; i < this.values.length; i++){
			this.result = this.result - this.values[i];
		}
		return this.result;
	}
}
