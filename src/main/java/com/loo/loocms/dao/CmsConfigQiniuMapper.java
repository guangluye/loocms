package com.loo.loocms.dao;

import com.loo.loocms.entity.CmsConfigQiniu;

public interface CmsConfigQiniuMapper {
	int deleteByPrimaryKey(Integer id);
	
	int insert(CmsConfigQiniu record);
	
	int insertSelective(CmsConfigQiniu record);
	
	CmsConfigQiniu selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(CmsConfigQiniu record);
	
	int updateByPrimaryKey(CmsConfigQiniu record);
}