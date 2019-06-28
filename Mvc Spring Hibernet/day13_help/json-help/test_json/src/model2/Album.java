package model2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Album {
	private String band;
	private String name;
	private String[] links;
	private List<String> songs;
	//HAS A
	private Artist artist;
	public Album() {
		// TODO Auto-generated constructor stub
	}
	public Album(String band, String name, String[] links,
			List<String> songs) {
		super();
		this.band = band;
		this.name = name;
		this.links = links;
		this.songs = songs;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getLinks() {
		return links;
	}
	public void setLinks(String[] links) {
		this.links = links;
	}
	public List<String> getSongs() {
		return songs;
	}
	public void setSongs(List<String> songs) {
		this.songs = songs;
	}
	
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	@Override
	public String toString() {
		return "Album band=" + band + ", name=" + name + "\n links="
				+ Arrays.toString(links) + "\n songs=" + songs+"\nBy artist "+artist;
	}
	

}
