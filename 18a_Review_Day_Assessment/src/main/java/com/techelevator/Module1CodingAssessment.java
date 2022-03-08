package com.techelevator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Module1CodingAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Module1CodingAssessment app = new Module1CodingAssessment();

		MovieRental movie1 = new MovieRental("Gone With the Wind", "DVD", true);
		MovieRental movie2 = new MovieRental("Avatar","Blu-ray",false);
		MovieRental movie3 = new MovieRental("The Lion King", "DVD", true);

		List<MovieRental> movies = new ArrayList<>();
		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);

		app.printMovieList(movies);
		app.printDate(movies);

	}


	public void printMovieList(List<MovieRental> movies) {
		for(MovieRental movie: movies) {
			System.out.println(movie.toString());
		}
	}

	public void printDate(List<MovieRental> movies) {
		try(PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("src/test/resources/movieDate.txt",true)))) {
			for(MovieRental movie: movies) {
				file.println(movie);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
