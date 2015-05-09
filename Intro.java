
public class Intro {
	private String message;
	
	public Intro(){
		this.message = "hello";
	}
	
	public Intro(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public void print(){
		
	}
	
	public static void main(String args[]){
		Intro x = new Intro();
		System.out.println(x.getMessage());
		Intro y = new Intro("what's up");
		System.out.println(y.getMessage());
		x.setMessage("Lets have fun");
		System.out.println(x.getMessage());
		
	}

}
