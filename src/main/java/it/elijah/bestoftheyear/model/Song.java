package it.elijah.bestoftheyear.model;

public class Song {
	private int id;
	private String titolo;
	
	public Song(int id, String titolo) {
		this.id = id;
		this.titolo = titolo;
	}

	public int getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}
	
	public String toString() {
		return String.format("%s", titolo);
	}
}
