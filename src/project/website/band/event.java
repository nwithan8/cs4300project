package project.website.band;

import java.util.Vector;

public class event {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVenue_id() {
		return venue_id;
	}

	public void setVenue_id(int venue_id) {
		this.venue_id = venue_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimeandplace() {
		return timeandplace;
	}

	public void setTimeandplace(String timeandplace) {
		this.timeandplace = timeandplace;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public int getBand_id() {
		return band_id;
	}

	public void setBand_id(int band_id) {
		this.band_id = band_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int id;
	public int venue_id;
	public String title;
	public String timeandplace;
	public boolean isFilled;
	public int band_id;
	public String description;
	public Vector<String> getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Vector<String> signedUp) {
		this.signedUp = signedUp;
	}

	public Vector<String> signedUp;
	
	public event(int id, int venue_id, String title, String timeandplace, boolean isFilled, int band_id, String description){
		this.id = id;
		this.venue_id = venue_id;
		this.title = title;
		this.timeandplace = timeandplace;
		this.isFilled = isFilled;
		this.band_id = band_id;
		this.description = description;
	}
}
