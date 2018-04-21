package fk_lesson;

import java.sql.Date;

public class forumSubcategories {
	private long id;
	private long idCategory;
	private String title;
	private String description;
	private Date date;
	private String ip;
	private forumCategories forumCat;
	
	public forumSubcategories(long id, long idCategory, String title, String description, Date date, String ip,
			forumCategories forumCat) {
		super();
		this.id = id;
		this.idCategory = idCategory;
		this.title = title;
		this.description = description;
		this.date = date;
		this.ip = ip;
		this.forumCat = forumCat;
	}
}
