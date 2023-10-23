package app_java_3;

import java.util.Comparator;

public class Movie_Name implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
