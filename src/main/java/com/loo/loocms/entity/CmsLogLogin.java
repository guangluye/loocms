package com.loo.loocms.entity;

public class CmsLogLogin {
	private Integer id;
	
	private String loginIp;
	
	private Integer loginAdminId;
	
	private String loginTime;
	
	private String loginAddress;
	
	private String loginAdminName;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLoginIp() {
		return loginIp;
	}
	
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp == null ? null : loginIp.trim();
	}
	
	public Integer getLoginAdminId() {
		return loginAdminId;
	}
	
	public void setLoginAdminId(Integer loginAdminId) {
		this.loginAdminId = loginAdminId;
	}
	
	public String getLoginTime() {
		return loginTime;
	}
	
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime == null ? null : loginTime.trim();
	}
	
	public String getLoginAddress() {
		return loginAddress;
	}
	
	public void setLoginAddress(String loginAddress) {
		this.loginAddress = loginAddress == null ? null : loginAddress.trim();
	}
	
	public String getLoginAdminName() {
		return loginAdminName;
	}
	
	public void setLoginAdminName(String loginAdminName) {
		this.loginAdminName = loginAdminName == null ? null : loginAdminName.trim();
	}
}