
public class IntroTest {
	public static void main(String args[]){
		Math test = new Math();
		test.setX(7);
		test.setY(8);
		int add;
		add = test.add();
		System.out.println(add);
		Math test2 = new Math(10 , 9);
		int sub;
		sub = test2.subtract();
		System.out.println(sub);
	}
}
