package com.loo.loocms.service.impl;

import com.loo.loocms.dao.CmsAdminMapper;
import com.loo.loocms.entity.CmsAdmin;
import com.loo.loocms.service.CmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmsAdminServiceImpl implements CmsAdminService {
	
	@Autowired
	private CmsAdminMapper adminMapper;
	
	@Override
	public CmsAdmin selectByPrimaryKey(Integer id) {
		return adminMapper.selectByPrimaryKey(id);
	}
}
