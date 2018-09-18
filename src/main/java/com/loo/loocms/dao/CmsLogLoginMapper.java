package com.loo.loocms.dao;

import com.loo.loocms.entity.CmsLogLogin;

public interface CmsLogLoginMapper {
	int deleteByPrimaryKey(Integer id);
	
	int insert(CmsLogLogin record);
	
	int insertSelective(CmsLogLogin record);
	
	CmsLogLogin selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(CmsLogLogin record);
	
	int updateByPrimaryKey(CmsLogLogin record);
}