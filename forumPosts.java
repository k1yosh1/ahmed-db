package fk_lesson;

import java.util.Date;

public class forumPosts {
	private int id;
	private int idSubcategory;
	private int idUser;
	private int parentPost;
	private String title;
	private String content;
	private boolean isPoll;
	private Date date;
	private String ip;
	private forumSubcategories forumSubCat;
	private users users;
	
	public forumPosts(int id, int idSubcategory, int idUser, int parentPost, String title, String content,
			boolean isPoll, Date date, String ip, forumSubcategories forumSubCat, fk_lesson.users users) {
		super();
		this.id = id;
		this.idSubcategory = idSubcategory;
		this.idUser = idUser;
		this.parentPost = parentPost;
		this.title = title;
		this.content = content;
		this.isPoll = isPoll;
		this.date = date;
		this.ip = ip;
		this.forumSubCat = forumSubCat;
		this.users = users;
	}
	
	
}
