package june_18;
//Using this keyword we can access static variable as well but it is not recommended to do for good coding practices.
public class A {

	static int x =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1=new A();
		a1.test();
	}
	public void test() {
		System.out.println(this.x);
	}

}
