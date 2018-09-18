package com.loo.loocms.controller;

import com.loo.loocms.entity.CmsAdmin;
import com.loo.loocms.service.CmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Autowired
	private CmsAdminService adminService;
	
	@RequestMapping("test")
	public CmsAdmin test(Integer id) {
		
		return adminService.selectByPrimaryKey(id);
	}
	
}
