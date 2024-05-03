package org.haeundae.dto;

public class Member {
	private String id;
	private String pw;
	private String birth;
	private String email;
	private String tel;
	private String addr;
	private String postcode;
	public Member() {}
	
	public Member(String id, String pw, String birth, String email, String tel, String addr, String postcode) {
		super();
		this.id = id;
		this.pw = pw;
		this.birth = birth;
		this.email = email;
		this.tel = tel;
		this.addr = addr;
		this.postcode = postcode;
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
	
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", birth=" + birth + ", email=" + email + ", tel=" + tel + ", addr="
				+ addr + ", postcode=" + postcode + "]";
	}
}
