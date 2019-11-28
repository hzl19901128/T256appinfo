package cn.sq.appinfo.service;

import cn.sq.appinfo.entity.DevUser;

public interface DevUserService {
	//开发者登陆验证
	public DevUser login(String devCode,String devPassword);
}
