package project.website.objects;

public class Band {
	/*- create table band(
	 * 		  id int,
			- band_name varchar(50),
			- description varchar(200),
			- telephone varchar(12),
			- email varchar(30),
			- facebook varchar(30),
			- twitter varchar(30),
			- soundcloud varchar(50),
			- youtube varchar(50),
			- primary key (id));
	*/
	int id;
	String name;
	String description;
	String telephone;
	String email;
	String facebook;
	String twitter;
	String soundcloud;
	String youtube;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getSoundcloud() {
		return soundcloud;
	}
	public void setSoundcloud(String soundcloud) {
		this.soundcloud = soundcloud;
	}
	public String getYoutube() {
		return youtube;
	}
	public void setYoutube(String youtube) {
		this.youtube = youtube;
	}

	
	
	
}
