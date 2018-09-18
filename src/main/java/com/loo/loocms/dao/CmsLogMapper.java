package com.loo.loocms.dao;

import com.loo.loocms.entity.CmsLog;

public interface CmsLogMapper {
	int deleteByPrimaryKey(Integer id);
	
	int insert(CmsLog record);
	
	int insertSelective(CmsLog record);
	
	CmsLog selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(CmsLog record);
	
	int updateByPrimaryKeyWithBLOBs(CmsLog record);
	
	int updateByPrimaryKey(CmsLog record);
}