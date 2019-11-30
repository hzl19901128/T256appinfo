package cn.sq.appinfo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

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
		List<AppCategory> categoryList = appCategoryService.getAppCategory(pid==""?null:Integer.parseInt(pid));
		return categoryList;
	}
	
	//点击新增APP基础信息，跳转到APP新增页面aappinfoadd.jsp
	@RequestMapping("beforeAppAdd")
	public String beforeAppAdd(Model model){
		//查询所属平台
		//查询一级菜单
		List<AppCategory> oneCategory = appCategoryService.getAppCategory(null);
		model.addAttribute("categoryLevel1List", oneCategory);
		return "developer/appinfoadd";
	}
	
	//保持新增的APP信息
	@RequestMapping("/appAdd")
	@ResponseBody
	public String appAdd(MultipartFile mf,HttpServletRequest req){
		//获取上传的文件名
		String fileName = mf.getOriginalFilename();
		String softName = req.getParameter("softwareName");
		return fileName+"---"+softName;
	}

}
