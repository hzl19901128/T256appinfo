package cn.sq.appinfo.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.AppInfoDao;
import cn.sq.appinfo.entity.AppInfo;
import cn.sq.appinfo.service.AppInfoService;
import cn.sq.appinfo.util.Page;

@Service
public class AppInfoServiceImpl implements AppInfoService{
	
	@Resource
	private AppInfoDao appInfoDao;

	@Override
	public void getByLimit(Map map,Page page) {
		int rows = appInfoDao.getCounts(map);
		page.setRecords(rows);
		List<AppInfo> list = appInfoDao.getByLimit(map);
		page.setList(list);
	}

}
