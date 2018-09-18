package com.loo.loocms.dao;

import com.loo.loocms.entity.CmsConfigWeb;

public interface CmsConfigWebMapper {
	int deleteByPrimaryKey(Integer id);
	
	int insert(CmsConfigWeb record);
	
	int insertSelective(CmsConfigWeb record);
	
	CmsConfigWeb selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(CmsConfigWeb record);
	
	int updateByPrimaryKeyWithBLOBs(CmsConfigWeb record);
	
	int updateByPrimaryKey(CmsConfigWeb record);
}