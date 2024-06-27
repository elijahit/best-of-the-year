package it.elijah.bestoftheyear.data;

import java.util.ArrayList;
import java.util.List;

import it.elijah.bestoftheyear.model.Movie;

public class MoviesData {
	
	static List<Movie> lista = new ArrayList<>();
	
	static Movie film1 = new Movie(0, "Jack Sparrow");
	static Movie film2 = new Movie(1, "La Fabbrica di Cioccolato");
	static Movie film3 = new Movie(2, "Mery Poppins");
	static Movie film4 = new Movie(3, "Biografia di Giuseppe Pedullà");
	static Movie film5 = new Movie(4, "Biografia di Alessio Vetri");
	
	public static List<Movie> getList() {
		lista.add(film1);
		lista.add(film2);
		lista.add(film3);
		lista.add(film4);
		lista.add(film5);
		return lista;
		
	}

}
