package cn.sq.appinfo.dao;

import org.apache.ibatis.annotations.Param;

import cn.sq.appinfo.entity.DevUser;

public interface DevUserDao {
	
	//通过用户名和密码获取对应的开发者信息
	public DevUser getByDevCodeAndDevPassword(@Param("devCode") String devCode,@Param("devPassword") String devPassword);

}
