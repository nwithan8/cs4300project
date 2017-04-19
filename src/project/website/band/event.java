package project.website.band;

public class event {
	public int id;
	public int venue_id;
	public String title;
	public String timeandplace;
	public boolean isFilled;
	public int band_id;
	public String description;
	
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
