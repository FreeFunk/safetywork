package com.edgedo.sys.controller;


import java.util.ArrayList;
import java.util.List;

import com.edgedo.common.base.BaseController;
import com.edgedo.common.base.annotation.Pass;
import com.edgedo.sys.entity.CarMonthOftenrunRoute;
import com.edgedo.sys.queryvo.CarMonthOftenrunRouteQuery;
import com.edgedo.sys.queryvo.CarMonthOftenrunRouteView;
import com.edgedo.sys.service.CarMonthOftenrunRouteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Api(tags = "CarMonthOftenrunRoute")
@Controller
@RequestMapping("/admin/carMonthOftenrunRoute")
public class CarMonthOftenrunRouteController extends BaseController{
	
	@Autowired
	private CarMonthOftenrunRouteService service;
	
	/**
	 * 分页查询
	 * @param query
	 * @return
	 */
	@ApiOperation(value = "分页查询CarMonthOftenrunRoute", notes = "分页查询CarMonthOftenrunRoute")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/listpage",method = RequestMethod.POST)
	public ModelAndView listpage(@ModelAttribute CarMonthOftenrunRouteQuery query){
		ModelAndView modelAndView = new ModelAndView();
		service.listPage(query);
		buildResponse(modelAndView,query);
		return modelAndView;
	}
	

	/**
	 * 新增修改
	 * @param voObj
	 * @return
	 */
	@ApiOperation(value = "新增修改CarMonthOftenrunRoute", notes = "新增修改CarMonthOftenrunRoute")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/saveOrUpdate",method = RequestMethod.POST)
	public ModelAndView saveOrUpdate(CarMonthOftenrunRoute voObj){
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
	@ApiOperation(value = "根据ID批量删除CarMonthOftenrunRoute", notes = "根据ID批量删除CarMonthOftenrunRoute")
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
	@ApiOperation(value = "根据ID加载CarMonthOftenrunRoute", notes = "根据ID加载CarMonthOftenrunRoute")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/loadById",method = RequestMethod.POST)
	public ModelAndView  loadById(String id){
		ModelAndView modelAndView = new ModelAndView();
		return buildResponse(modelAndView, service.loadById(id));
	}


	@RequestMapping(value = "/selectOftenRunRoute",method = RequestMethod.POST)
	@Pass
	public ModelAndView selectOftenRunRoute(@ModelAttribute CarMonthOftenrunRouteQuery query){
		ModelAndView modelAndView = new ModelAndView();
		List<CarMonthOftenrunRouteView> carOftenrunRouteList = service.selectOftenRunRoute(query);
		buildResponse(modelAndView,carOftenrunRouteList);
		return modelAndView;
	}
}
