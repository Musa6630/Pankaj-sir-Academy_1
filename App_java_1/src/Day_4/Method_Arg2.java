package Day_4;

public class Method_Arg2 {

	public static void main(String[] args) {

		Method_Arg2 m2=new Method_Arg2();
		m2.test(2000, "Abid Chutiya", 200.5f);
	}
	public void test(int x, String y, float f) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(f);
	}

}
