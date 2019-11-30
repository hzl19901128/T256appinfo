package cn.sq.appinfo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sq.appinfo.entity.AppCategory;
import cn.sq.appinfo.service.AppCategoryService;

@Controller
@RequestMapping("/dev/app")
public class DevAppInfoController {
	
	@Resource
	private AppCategoryService appCategoryService;
	
	//点击APP维护，跳转到查询APP信息列表页面appinfolist.jsp
	@RequestMapping("/beforeList")
	public String beforeList(Model model){
		//查询APP状态
		//查询所属平台
		//查询一级菜单
		List<AppCategory> oneCategory = appCategoryService.getAppCategory(null);
		model.addAttribute("categoryLevel1List", oneCategory);
		return "developer/appinfolist";
	}
	
	//ajax菜单联动加载方法
	@RequestMapping("/categoryLinked")
	@ResponseBody
	public Object categoryLinked(String pid){
		List<AppCategory> categoryList = appCategoryService.getAppCategory(pid==null?null:Integer.parseInt(pid));
		return categoryList;
	}

}
