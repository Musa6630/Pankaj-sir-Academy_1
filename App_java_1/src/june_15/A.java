package june_15;
//Constructor overloading same name but different arguments
public class A {

	public static void main(String[] args) {
		A a1=new A();
		A a2=new A(100);
		A a3=new A(200,"hero");
		
	}
	A(){
		System.out.println("No Method Arguments "+"null");
	}
	A(int x){
		System.out.println("One Method Arguments x="+x);
	}
	A(int x,String y){
		System.out.println("Two Method Arguments " +"x="+ x +" y="+ y);
	}

}
