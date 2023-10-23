package july_25;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=10/0;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		System.out.println(10);

	}

} 
