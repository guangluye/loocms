package com.loo.loocms.entity;

public class CmsConfigWeb {
	private Integer id;
	
	private String cmsName;
	
	private String author;
	
	private String homePage;
	
	private String servicer;
	
	private String dataBase;
	
	private String powerby;
	
	private String record;
	
	private String description;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCmsName() {
		return cmsName;
	}
	
	public void setCmsName(String cmsName) {
		this.cmsName = cmsName == null ? null : cmsName.trim();
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author == null ? null : author.trim();
	}
	
	public String getHomePage() {
		return homePage;
	}
	
	public void setHomePage(String homePage) {
		this.homePage = homePage == null ? null : homePage.trim();
	}
	
	public String getServicer() {
		return servicer;
	}
	
	public void setServicer(String servicer) {
		this.servicer = servicer == null ? null : servicer.trim();
	}
	
	public String getDataBase() {
		return dataBase;
	}
	
	public void setDataBase(String dataBase) {
		this.dataBase = dataBase == null ? null : dataBase.trim();
	}
	
	public String getPowerby() {
		return powerby;
	}
	
	public void setPowerby(String powerby) {
		this.powerby = powerby == null ? null : powerby.trim();
	}
	
	public String getRecord() {
		return record;
	}
	
	public void setRecord(String record) {
		this.record = record == null ? null : record.trim();
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}