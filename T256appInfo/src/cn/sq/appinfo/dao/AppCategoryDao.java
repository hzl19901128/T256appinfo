package cn.sq.appinfo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.sq.appinfo.entity.AppCategory;

public interface AppCategoryDao {
	//根据父级id查询对应的分类
	public List<AppCategory> getAppCategory(@Param("parentId") Integer parentId);
}
