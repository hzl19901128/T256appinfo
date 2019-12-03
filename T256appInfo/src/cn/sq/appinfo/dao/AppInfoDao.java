package cn.sq.appinfo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cn.sq.appinfo.entity.AppInfo;
import cn.sq.appinfo.util.Page;

public interface AppInfoDao {
	//分页查询所有app的信息
	public List<AppInfo> getByLimit(Map map);
	
	//查询总记录数
	public Integer getCounts(Map map);
}
