package june_15;
//we can call one method from another method through this keyword
public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D d1=new D();
		d1.test();
	}
	public void test() {
		this.test2();
	}
	
	public void test2() {
		System.out.println("Hero");
	}

}
