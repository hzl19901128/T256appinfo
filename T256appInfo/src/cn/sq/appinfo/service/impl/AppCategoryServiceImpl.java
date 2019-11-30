package cn.sq.appinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.AppCategoryDao;
import cn.sq.appinfo.entity.AppCategory;
import cn.sq.appinfo.service.AppCategoryService;

@Service
public class AppCategoryServiceImpl implements AppCategoryService{
	@Resource
	private AppCategoryDao appCategoryDao;

	@Override
	public List<AppCategory> getAppCategory(Integer parentId) {
		return appCategoryDao.getAppCategory(parentId);
	}

}
