package it.elijah.bestoftheyear.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import it.elijah.bestoftheyear.data.MoviesData;
import it.elijah.bestoftheyear.data.SongsData;
import it.elijah.bestoftheyear.model.Movie;
import it.elijah.bestoftheyear.model.Song;

@Controller
public class MovieSongController {
	
	@GetMapping("/")
	public String root() {
		return "root";
	}
	
	@GetMapping("/movies")
	public String moviesEndpoint(Model model) {
		
		model.addAttribute("movies", getBestMovies());

		return "movies";
	}
	
	@GetMapping("/songs")
	public String songsEndpoint(Model model) {
		
		model.addAttribute("songs", getBestSongs());

		return "songs";
	}
	
	@GetMapping("/movies/{id}")
	public String moviesIdEndpoint(@PathVariable int id,  Model model) {
		model.addAttribute("movie", getBestMovies().get(id));

		return "movie";
	}
	
	@GetMapping("/songs/{id}")
	public String songsIdEndpoint(@PathVariable int id,  Model model) {
		model.addAttribute("song", getBestSongs().get(id));

		return "song";
	}
	
	
	private List<Movie> getBestMovies() {
		return MoviesData.getList();
	}
	
	private List<Song> getBestSongs() {
		SongsData songs = new SongsData();
		return songs.getList();
	}
}

