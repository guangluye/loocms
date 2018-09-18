package com.loo.loocms.entity;

public class CmsAdmin {
	private Integer id;
	
	private String user;
	
	private String pwd;
	
	private Integer sex;
	
	private String nickName;
	
	private String headImg;
	
	private String email;
	
	private String phone;
	
	private Integer role;
	
	private Integer delSt;
	
	private String remarks;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user == null ? null : user.trim();
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}
	
	public Integer getSex() {
		return sex;
	}
	
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName == null ? null : nickName.trim();
	}
	
	public String getHeadImg() {
		return headImg;
	}
	
	public void setHeadImg(String headImg) {
		this.headImg = headImg == null ? null : headImg.trim();
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}
	
	public Integer getRole() {
		return role;
	}
	
	public void setRole(Integer role) {
		this.role = role;
	}
	
	public Integer getDelSt() {
		return delSt;
	}
	
	public void setDelSt(Integer delSt) {
		this.delSt = delSt;
	}
	
	public String getRemarks() {
		return remarks;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks == null ? null : remarks.trim();
	}
}