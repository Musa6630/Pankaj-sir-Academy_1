package encapsulation;

import java.io.BufferedReader;
import java.io.FileReader;

public class C {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("C:\\Users\\devil\\Desktop\\Pankaj sir Academy\\Encapsulation\\src\\A.txt");
			BufferedReader br=new BufferedReader(fr);
			String password=br.readLine();
			B b1=new B();
			b1.setPassword(password);
			System.out.println(b1.getPassword());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
