package Day_4;

import app_java_1.A;

public class Regular_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Regular_Int a1=new Regular_Int();
		a1.test(1000, 2000,3000, 4000);

	}
	
	public void test(int ... x) {
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
	}

}
