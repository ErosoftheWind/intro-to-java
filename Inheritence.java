
public class Inheritence extends Intro {
	public int times;
	
	public Inheritence(){
		super();
		this.times = 1;
	}
	
	public Inheritence(String name, String message, int times){
		super(name, message);
		this.times = times;
	}
	
	public void print(){
		for(int i = 0; i < this.times; i++){
			System.out.println(this.getMessage() + " " + this.getName() + ": times " + i);
		}
	}
}
