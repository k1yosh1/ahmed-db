package fk_lesson;

import java.util.Date;

public class users {
	private int id;
	private String nick;
	private String password;
	private String email;
	private Date date;
	private float karma;
	private String ip;
	
	public users(int id, String nick, String password, String email, Date date, float karma, String ip) {
		super();
		this.id = id;
		this.nick = nick;
		this.password = password;
		this.email = email;
		this.date = date;
		this.karma = karma;
		this.ip = ip;
	}
}
