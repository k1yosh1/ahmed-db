package fk_lesson;

import java.sql.Date;

public class forumCategories {
	private int id;
	private String title;
	private String description;
	private Date date;
	private String ip;
	
	public forumCategories(int id, String title, String description, Date date, String ip) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.date = date;
		this.ip = ip;
	}
	
}
