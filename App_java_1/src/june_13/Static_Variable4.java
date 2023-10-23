package june_13;

public class Static_Variable4 {

	static int x1=27;
	public static void main(String[] args) {

		//three ways to call static variable
		System.out.println(Static_Variable4.x1);  //className.static variable
		System.out.println(x1);			//static variable
		
		
		//wrong calling method but will work
		Static_Variable4 s1=new Static_Variable4();
		System.out.println(s1.x1);    //internally compiler convert s1.x1 to className.static variable
		
	}

}
