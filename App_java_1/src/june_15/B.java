package june_15;
//this keyword is special reference variable that gets created automatically when object is created in your program
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B a1=new B();
		
		System.out.println(a1);
		a1.test();
	}
	public void test(){
		System.out.println(this);
	}

}
