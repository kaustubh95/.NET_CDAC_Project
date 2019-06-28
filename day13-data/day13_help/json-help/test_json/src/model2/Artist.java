package model2;

import java.sql.Date;

public class Artist {
	
	private String name;
	private Date dob;
	public Artist() {
		// TODO Auto-generated constructor stub
	}
	public Artist(String name, Date dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + ", dob=" + dob + "]";
	}
	
	

}
