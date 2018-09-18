package com.loo.loocms.dao;

import com.loo.loocms.entity.CmsAdmin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsAdminMapper {
	int deleteByPrimaryKey(Integer id);
	
	int insert(CmsAdmin record);
	
	int insertSelective(CmsAdmin record);
	
	CmsAdmin selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(CmsAdmin record);
	
	int updateByPrimaryKeyWithBLOBs(CmsAdmin record);
	
	int updateByPrimaryKey(CmsAdmin record);
}