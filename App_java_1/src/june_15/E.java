package june_15;
//This keyword points to the current object running in the program
public class E {

	public static void main(String[] args) {
		E e1=new E();
		e1.test();
		
		E e2=new E();
		e2.test();
		e1.test();
		
		E e3=new E();
		e2.test();
		e3.test();
		e1.test();
	}
	public void test() {
		System.out.println(this);
	}
}
