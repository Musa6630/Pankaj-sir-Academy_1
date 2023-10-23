package app_java_3;

import java.util.Comparator;

public class Movie_Rating implements Comparator<Movie> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Movie m1, Movie m2) {
		if(m1.getRating() < m2.getRating())
			return -1;
		if(m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
		
	}

}
