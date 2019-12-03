package cn.sq.appinfo.service;

import java.util.List;
import java.util.Map;

import cn.sq.appinfo.entity.AppInfo;
import cn.sq.appinfo.util.Page;

public interface AppInfoService {
	
	//查询片段数据的方法
	public void getByLimit(Map map,Page page);

}
