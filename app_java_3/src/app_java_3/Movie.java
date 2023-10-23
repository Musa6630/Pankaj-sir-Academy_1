package app_java_3;

public class Movie {
	
	private double rating;
	private String name;
	private int year;
	
	
	
	public double getRating() {
		return rating;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	
	//constructor
	public Movie( String nm,double rt, int yr) {
		this.rating = rt;
		this.name = nm;
		this.year = yr;
	}
	
	public static void main(String[] args) {
		
		
	}
	

	
}
