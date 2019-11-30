package cn.sq.appinfo.service;

import java.util.List;

import cn.sq.appinfo.entity.AppCategory;

public interface AppCategoryService {
	//根据父级id查询对应的分类
	public List<AppCategory> getAppCategory(Integer parentId);
}
