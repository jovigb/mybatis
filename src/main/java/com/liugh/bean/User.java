package com.liugh.bean;

public class User {

    private String id;
    private String nickname;
    private String passwd;
    
	@Override
	public String toString() {
		return "User [id=" + id + ", nickname=" + nickname + ", passwd=" + passwd + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return nickname;
	}
	public void setUsername(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return passwd;
	}
	public void setPassword(String passwd) {
		this.passwd = passwd;
	}
    

}
