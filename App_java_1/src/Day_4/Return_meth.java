package Day_4;

public class Return_meth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return_meth n1=new Return_meth();
		n1.test();

	}
	public void test() {
		return;
//		System.out.println(100);  //Error: Unreachable code because return will give control back to method calling statement 
	}

}
