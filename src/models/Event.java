package models;

public class Event {
	private int id;
	private String event_name;
	private String event_location;
	private String event_date;
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getEvent_location() {
		return event_location;
	}
	public void setEvent_location(String event_location) {
		this.event_location = event_location;
	}
	public String getEvent_date() {
		return event_date;
	}
	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Event(int id, String event_name, String event_location, String event_date, String description) {
		super();
		this.id = id;
		this.event_name = event_name;
		this.event_location = event_location;
		this.event_date = event_date;
		this.description = description;
	}
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
