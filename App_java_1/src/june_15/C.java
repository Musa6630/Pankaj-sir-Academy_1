package june_15;
//we can access non static variable through this keyword
public class C {

	int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		c1.test();

	}
	public void test() {
		System.out.println(this.x);
	}

}
