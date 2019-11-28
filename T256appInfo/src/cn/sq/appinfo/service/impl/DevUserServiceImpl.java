package cn.sq.appinfo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sq.appinfo.dao.DevUserDao;
import cn.sq.appinfo.entity.DevUser;
import cn.sq.appinfo.service.DevUserService;

@Service
public class DevUserServiceImpl implements DevUserService{
	
	@Resource
	private DevUserDao devUserDao;

	@Override
	public DevUser login(String devCode, String devPassword) {
		return devUserDao.getByDevCodeAndDevPassword(devCode, devPassword);
	}

}
