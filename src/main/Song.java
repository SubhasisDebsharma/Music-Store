package main;
import java.sql.Date;
import java.util.Calendar;

public class Song{
	private String songtitle,singer;
	private int releaseYear;
	private float price;
	
	public Song(String title,String singer,String gener,int year) {
		this.songtitle = title;
		this.singer = singer;
		this.releaseYear = year;
		this.price = calculatePrice();
	}
	
	@SuppressWarnings("deprecation")
	public float calculatePrice(){
		/*
		Calendar now = Calendar.getInstance();   // Gets the current date and time
		int year = now.get(Calendar.YEAR);
		int songAge = year - this.releaseYear;
		return songAge>5 ? 5 : 10-songAge;
		*/
		// This Style would be more apt. But In the question They asked to use java.sql.Date . So the bellow code.
		
		Date now = new Date(Calendar.getInstance().getTimeInMillis());
		Date songdate = new Date(this.releaseYear,1,1);
		int songAge = now.getYear() - (songdate.getYear() - 1900);
		return songAge>5 ? 5 : 10-songAge;
		
	}
	
	@Override
	public String toString() {
		return this.songtitle;
	}
	
	
	public String getSongtitle() {
		return songtitle;
	}
	public void setSongtitle(String songtitle) {
		this.songtitle = songtitle;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
		this.price = calculatePrice();
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
