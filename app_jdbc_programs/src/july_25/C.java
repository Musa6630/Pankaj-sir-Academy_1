package july_25;

public class C {
	int x=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Integer.parseInt("heuhdjgjhsj");
		} catch (ArithmeticException e) {
			System.out.println(1);
		}catch (NullPointerException e) {
			System.out.println(2);
		}catch (Exception e) {
			System.out.println(3);
		}
	}

}
