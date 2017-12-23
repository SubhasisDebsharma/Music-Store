package main;

import java.util.ArrayList;

public class User {
	private String name;
	private int id;
	private ArrayList<Song> songs = new ArrayList<Song>();
	
	public User(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public boolean addSong(Song song) throws SongException{
		if(!songs.contains(song)){
			songs.add(song);
			return true;
		}
		throw new SongException("Song already Exists.");
	}
	
	public Song playSong(Song song) throws SongException{
		if(songs.contains(song)) return song;
		throw new SongException("Song does not exists.");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Song> getSongs() {
		return songs;
	}
	public void setSongs(ArrayList<Song> songs) {
		this.songs = songs;
	}
	
	
}
