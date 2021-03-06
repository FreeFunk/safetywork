package com.edgedo.sys.controller;


import java.text.SimpleDateFormat;
import java.util.*;

import com.edgedo.common.base.BaseController;
import com.edgedo.common.shiro.User;
import com.edgedo.sys.entity.BigdataSafetyWarning;
import com.edgedo.sys.entity.BigdataSafetyWarningFile;
import com.edgedo.sys.queryvo.BigdataSafetyWarningQuery;
import com.edgedo.sys.service.BigdataSafetyWarningService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Api(tags = "BigdataSafetyWarning")
@Controller
@RequestMapping("/admin/bigdataSafetyWarning")
public class BigdataSafetyWarningController extends BaseController{
	
	@Autowired
	private BigdataSafetyWarningService service;
	
	/**
	 * 分页查询
	 * @param query
	 * @return
	 */
	@ApiOperation(value = "分页查询BigdataSafetyWarning", notes = "分页查询BigdataSafetyWarning")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/listpage",method = RequestMethod.POST)
	public ModelAndView listpage(@ModelAttribute BigdataSafetyWarningQuery query){
		ModelAndView modelAndView = new ModelAndView();
		User user = getLoginUser();
		String userType = user.getUserType();
		query.setUserType(userType);
		//根据报警日期区间  判断统计月份
		if(query.getQueryObj().getNewEndTime()!=null && query.getQueryObj().getSelectTime()!=null
				&& !query.getQueryObj().getNewEndTime().equals("") && !query.getQueryObj().getSelectTime().equals("")){
			String dateQuJian = query.getQueryObj().getSelectTime();
			String dateEndTime = query.getQueryObj().getNewEndTime();
			if(dateQuJian.equals(dateEndTime)){
				query.getQueryObj().setSelectTime(dateQuJian+" 00:00:00");
				query.getQueryObj().setNewEndTime(dateQuJian+" 23:59:59");
				String[] arr = dateQuJian.split("-");//2019 08 16 2019 08 20
				String countMonth = arr[0]+arr[1];
				query.getQueryObj().setCountMonth(new Integer(countMonth));
			}else {
				String[] arr = dateQuJian.split("-");//2019 08 16 2019 08 20
				String countMonth = arr[0]+arr[1];
				query.getQueryObj().setCountMonth(new Integer(countMonth));
			}
		}else{
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMM");
			String currDateStr = simpleDateFormat.format(new Date());
			query.getQueryObj().setCountMonth(new Integer(currDateStr));
		}
		service.listPage(query);
		buildResponse(modelAndView,query);
		return modelAndView;
	}
	

	/**
	 * 新增修改
	 * @param voObj
	 * @return
	 */
	@ApiOperation(value = "新增修改BigdataSafetyWarning", notes = "新增修改BigdataSafetyWarning")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/saveOrUpdate",method = RequestMethod.POST)
	public ModelAndView saveOrUpdate(BigdataSafetyWarning voObj){
		ModelAndView modelAndView = new ModelAndView();
		String errMsg = "";
		String id = voObj.getId();
		if(id==null || id.trim().equals("")){
			errMsg = service.insert(voObj);
		}else{
			errMsg = service.update(voObj);
		}
		if(errMsg!=null && !errMsg.equals("")){
			buildErrorResponse(modelAndView, errMsg);
		}else{
			buildResponse(modelAndView);
		}
		return modelAndView;
	}
	
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@ApiOperation(value = "根据ID批量删除BigdataSafetyWarning", notes = "根据ID批量删除BigdataSafetyWarning")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/deleteByIds",method = RequestMethod.POST)
	public ModelAndView delete(String ids){
		ModelAndView modelAndView = new ModelAndView();
		String[] arr = ids.split(",");
		List<String> list = new ArrayList<String>();
		for(String str : arr){
			list.add(str);
		}
		service.deleteByIds(list);		
		return buildResponse(modelAndView);
	}
	
	
	/**
	 * 根据主键加载
	 * @param id
	 * @return
	 */
	@ApiOperation(value = "根据ID加载BigdataSafetyWarning", notes = "根据ID加载BigdataSafetyWarning")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/loadById",method = RequestMethod.POST)
	public ModelAndView  loadById(String id){
		ModelAndView modelAndView = new ModelAndView();
		return buildResponse(modelAndView, service.loadById(id));
	}


	/**
	 * 查出报警类型
	 * @return
	 */
	@RequestMapping(value = "/warningTypeList",method = RequestMethod.POST)
	public ModelAndView  warningTypeList(){
		ModelAndView modelAndView = new ModelAndView();
		List list = service.selectwarningTypeList();
		buildResponse(modelAndView,list);
		return modelAndView;
	}

	/**
	 * 根据报警车辆id 和 统计月份  查出附件信息
	 * 图片  视频
	 */
	@RequestMapping(value = "/queryInfoVo",method = RequestMethod.POST)
	public ModelAndView  queryInfoVo(String ids,String countMonth){
		ModelAndView modelAndView = new ModelAndView();
		//1.查出相关附件  list集合
		List<BigdataSafetyWarningFile> list = service.selectByIdsAndCountMonth(ids,countMonth);
		//2.将各个集合的元素分类
		List<BigdataSafetyWarningFile> listPicture = new ArrayList<>();
		List<BigdataSafetyWarningFile> listVideo = new ArrayList<>();
		for(BigdataSafetyWarningFile bigdataSafetyWarningFile : list){
			if(bigdataSafetyWarningFile.getFileType().equals("picture")){
				listPicture.add(bigdataSafetyWarningFile);
			}else if(bigdataSafetyWarningFile.getFileType().equals("video")){
				listVideo.add(bigdataSafetyWarningFile);
			}
		}
		Map<String,List> map = new HashMap<>();
		map.put("listPicture",listPicture);
		map.put("listVideo",listVideo);
		//图片  视频
		return buildResponse(modelAndView,map);
	}


	
}
