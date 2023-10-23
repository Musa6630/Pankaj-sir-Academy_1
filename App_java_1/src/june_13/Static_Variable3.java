package june_13;
//If we do  not initialize static variable default values gets stored in it
public class Static_Variable3 {
	static String x1;   //default value== null
	static int x2;		//default value== 0
	static float x3;	//default value== 0.0
	
	
	public static void main(String[] args) {

		System.out.println(Static_Variable3.x1);  //so output==null 
		System.out.println(Static_Variable3.x2); 
		System.out.println(x3); 
	}

}
