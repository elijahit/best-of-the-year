package it.elijah.bestoftheyear.data;

import java.util.ArrayList;
import java.util.List;

import it.elijah.bestoftheyear.model.Song;

public class SongsData {
	public SongsData() {
		// TODO Auto-generated constructor stub
	}
	
	List<Song> lista = new ArrayList<>();
	
	Song song1 = new Song(0, "I'm albratos");
	Song song2 = new Song(1, "Gangam Style");
	Song song3 = new Song(2, "Nel blu");
	Song song4 = new Song(3, "Canzone di Giuseppe Pedullà");
	Song song5 = new Song(4, "Canzone di Alessio Vetri");
	
	public List<Song> getList() {
		lista.add(song1);
		lista.add(song2);
		lista.add(song3);
		lista.add(song4);
		lista.add(song5);
		return lista;
		
	}

}
