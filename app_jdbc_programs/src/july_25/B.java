package july_25;

public class B {

	public static void main(String[] args) {

		try {
			int x=10/0;
		} finally {
			System.out.println("finally");
		}
		System.out.println(100);
	}

}
