package june_13;
//In non static also default values gets stored in variable if we don't initialize the variable
public class NonStatic_Variable {
	int x;
	float f;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStatic_Variable n1= new NonStatic_Variable();
		System.out.println(n1.x);
		System.out.println(n1.f);

	}

}
