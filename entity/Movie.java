package entity;

import java.util.Date;

public class Movie {
	private int ID;
	private String Title;
	private String Overview;
	private String Poster;
	private float Vote_Average;
	private Date Release_Date;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Movie(int ID, String Title, String Overview, String Poster, float Vote_Average, Date Release_Date) {
		super();
		this.ID = ID;
		this.Title = Title;
		this.Overview = Overview;
		this.Poster = Poster;
		this.Vote_Average = Vote_Average;
		this.Release_Date = Release_Date;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getOverview() {
		return Overview;
	}

	public void setOverview(String overview) {
		Overview = overview;
	}

	public String getPoster() {
		return Poster;
	}

	public void setPoster(String poster) {
		Poster = poster;
	}

	public float getVote_Average() {
		return Vote_Average;
	}

	public void setVote_Average(float vote_Average) {
		Vote_Average = vote_Average;
	}

	public Date getRelease_Date() {
		return Release_Date;
	}

	public void setRelease_Date(Date release_Date) {
		Release_Date = release_Date;
	}
	
}