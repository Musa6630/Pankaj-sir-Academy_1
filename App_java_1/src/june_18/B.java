package june_18;
//we can access static method also through this keyword but it is no recommended to do
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		b1.test();

	}
	
	public void test() {
		this.test2();
	}
	
	public void test2() {
		System.out.println("HA PATA HAI");
	}

}
