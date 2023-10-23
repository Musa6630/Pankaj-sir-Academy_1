package june_13;

public class Static_Variable {
	static int x1=10;
	

	public static void main(String[] args) {
		int x2=100;
		System.out.println(x2);  //correct
		System.out.println(Static_Variable.x1);   //correct
	}
	public void test() {
		System.out.println(Static_Variable.x1);   //correct
//		System.out.println(x2);   //error as i x2 has local instance and i am calling it outside it instance
	}

}
