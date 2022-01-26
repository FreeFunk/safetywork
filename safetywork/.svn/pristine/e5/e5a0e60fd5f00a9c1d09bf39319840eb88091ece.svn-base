package com.edgedo.sys.controller;


import java.util.ArrayList;
import java.util.List;

import com.edgedo.common.base.BaseController;
import com.edgedo.sys.entity.BigdataBeidouTeamInfo;
import com.edgedo.sys.entity.SysOrg;
import com.edgedo.sys.queryvo.BigdataBeidouTeamInfoQuery;
import com.edgedo.sys.queryvo.SysOrgViewTree;
import com.edgedo.sys.service.BigdataBeidouTeamInfoService;
import com.edgedo.sys.service.SysOrgService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Api(tags = "BigdataBeidouTeamInfo")
@Controller
@RequestMapping("/admin/bigdataBeidouTeamInfo")
public class BigdataBeidouTeamInfoController extends BaseController{
	
	@Autowired
	private BigdataBeidouTeamInfoService service;
	@Autowired
	private SysOrgService sysOrgService;
	
	/**
	 * 分页查询
	 * @param query
	 * @return
	 */
	@ApiOperation(value = "分页查询BigdataBeidouTeamInfo", notes = "分页查询BigdataBeidouTeamInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/listpage",method = RequestMethod.POST)
	public ModelAndView listpage(@ModelAttribute BigdataBeidouTeamInfoQuery query){
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
	@ApiOperation(value = "新增修改BigdataBeidouTeamInfo", notes = "新增修改BigdataBeidouTeamInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/saveOrUpdate",method = RequestMethod.POST)
	public ModelAndView saveOrUpdate(BigdataBeidouTeamInfo voObj){
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
	@ApiOperation(value = "根据ID批量删除BigdataBeidouTeamInfo", notes = "根据ID批量删除BigdataBeidouTeamInfo")
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
	@ApiOperation(value = "根据ID加载BigdataBeidouTeamInfo", notes = "根据ID加载BigdataBeidouTeamInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/loadById",method = RequestMethod.POST)
	public ModelAndView  loadById(String id){
		ModelAndView modelAndView = new ModelAndView();
		return buildResponse(modelAndView, service.loadById(id));
	}



	/**
	 * 根据主键加载
	 * @param orgId
	 * @return
	 */
	@ApiOperation(value = "根据ID加载BigdataBeidouTeamInfo", notes = "根据ID加载BigdataBeidouTeamInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/selectByOrgId",method = RequestMethod.POST)
	public ModelAndView  selectByOrgId(String orgId){
		ModelAndView modelAndView = new ModelAndView();
		//
		SysOrg sysOrg = sysOrgService.loadById(orgId);
		String xianquId = sysOrg.getXianquId();
		//跟县区ID查询企业信息
		List<BigdataBeidouTeamInfo> bigdataBeidouTeamInfoList = service.selectByXianquId(xianquId);
		List<SysOrgViewTree> sysOrgViewTreeList = new ArrayList<>();
		for(BigdataBeidouTeamInfo teamInfo:bigdataBeidouTeamInfoList){
			SysOrgViewTree sysOrgViewTree = new SysOrgViewTree();
			sysOrgViewTree.setId(teamInfo.getId());
			sysOrgViewTree.setTitle1(teamInfo.getTeamName());
			sysOrgViewTree.setCheckArr("0");
			sysOrgViewTree.setLast(false);
			sysOrgViewTree.setParentId(orgId);
			sysOrgViewTreeList.add(sysOrgViewTree);
		}
		return buildResponse(modelAndView, sysOrgViewTreeList);
	}


}
