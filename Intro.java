
public class Intro {
	private String message;
	private String name;
	
	public Intro(){
		this.message = "hello";
		this.name = "justin";
	}
	
	public Intro(String message, String name){
		this.message = message;
		this.name = name;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void print(){
		System.out.println(this.message + " " + this.name);
	}
	
	public static void main(String args[]){
		Intro x = new Intro();
		x.print();
		Intro y = new Intro("what's up", "derek");
		y.print();
		x.setMessage("Lets have fun");
		x.print();
	}

}
