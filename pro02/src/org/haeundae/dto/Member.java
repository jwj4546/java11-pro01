package org.haeundae.dto;

public class Member {
	private String id;
	private String pw;
	private String birth;
	private String email;
	private String tel;
	public Member() {}
	public Member(String id, String pw, String birth, String email, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.email = email;
		this.tel = tel;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", birth=" + birth + ", email=" + email + ", tel=" + tel + "]";
	}
}

