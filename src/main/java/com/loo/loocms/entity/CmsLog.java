package com.loo.loocms.entity;

public class CmsLog {
	private Integer id;
	
	private String url;
	
	private String method;
	
	private String adminName;
	
	private String createTime;
	
	private String queryString;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}
	
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method == null ? null : method.trim();
	}
	
	public String getAdminName() {
		return adminName;
	}
	
	public void setAdminName(String adminName) {
		this.adminName = adminName == null ? null : adminName.trim();
	}
	
	public String getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(String createTime) {
		this.createTime = createTime == null ? null : createTime.trim();
	}
	
	public String getQueryString() {
		return queryString;
	}
	
	public void setQueryString(String queryString) {
		this.queryString = queryString == null ? null : queryString.trim();
	}
}