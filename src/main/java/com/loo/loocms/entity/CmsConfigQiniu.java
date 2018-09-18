package com.loo.loocms.entity;

public class CmsConfigQiniu {
	private Integer id;
	
	private String accessKey;
	
	private String secretKey;
	
	private String bucketName;
	
	private String bucketUrl;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getAccessKey() {
		return accessKey;
	}
	
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey == null ? null : accessKey.trim();
	}
	
	public String getSecretKey() {
		return secretKey;
	}
	
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey == null ? null : secretKey.trim();
	}
	
	public String getBucketName() {
		return bucketName;
	}
	
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName == null ? null : bucketName.trim();
	}
	
	public String getBucketUrl() {
		return bucketUrl;
	}
	
	public void setBucketUrl(String bucketUrl) {
		this.bucketUrl = bucketUrl == null ? null : bucketUrl.trim();
	}
}