package main;

import java.util.ArrayList;
import java.util.List;

public class MusicStore {
	public static List<Song> songStore = new ArrayList<Song>();
	
	public static Song buySong(float price, Song song) throws SongException{
		if(song.getPrice()> price) throw new SongException("You need to pay more for this song.");
		if(songStore.contains(song)){
			return song;
		}
		throw new SongException("Song is not Present in songStore.");
	}
	
	public static void main(String[] args) throws SongException{
		Song s = new Song("title", "singer","gener",2015);
		songStore.add(s);
		User user = new User("name", 101);
		user.addSong(buySong(8, s));	// for condition should throw exception on invalid input
		System.out.println(s.calculatePrice());	// Should print appropriate 
		System.out.println(user.playSong(s));	// Should print the song to toString
	}
}
