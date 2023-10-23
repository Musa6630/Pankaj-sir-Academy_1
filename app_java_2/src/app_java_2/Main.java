package app_java_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Movie m1=new Movie("Force Awakens", 10.9, 2023 );
		Movie m2=new Movie("The avenger infinity war", 9.9, 2018 );
		Movie m3=new Movie("The avengers end game", 9.5, 2019 );
		
		List<Movie> data=new ArrayList<Movie>();
		data.add(m1);
		data.add(m2);
		data.add(m3);
		
		Collections.sort(data);
		
		System.out.println(data);
		
		for (Movie movie : data) {
			System.out.println(movie.getName());
			System.out.println(movie.getRating());
			System.out.println(movie.getYear());
		}
	}

}
