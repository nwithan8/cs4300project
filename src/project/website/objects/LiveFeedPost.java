package project.website.objects;

public class LiveFeedPost {
	
	/*- create table band_post(id int,
			- band_id int,
			- post_title varchar(50),
			- post_content varchar(200),
			- date_posted DATETIME,
			- primary key (id));*/
	
	String bandorvenue;
	int id;
	int poster_id;
	String post_title;
	String post_content;
	String date_posted;
	public String getBandorvenue() {
		return bandorvenue;
	}
	public void setBandorvenue(String bandorvenue) {
		this.bandorvenue = bandorvenue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPoster_id() {
		return poster_id;
	}
	public void setPoster_id(int poster_id) {
		this.poster_id = poster_id;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_content() {
		return post_content;
	}
	public void setPost_content(String post_content) {
		this.post_content = post_content;
	}
	public String getDate_posted() {
		return date_posted;
	}
	public void setDate_posted(String date_posted) {
		this.date_posted = date_posted;
	}
	

}
