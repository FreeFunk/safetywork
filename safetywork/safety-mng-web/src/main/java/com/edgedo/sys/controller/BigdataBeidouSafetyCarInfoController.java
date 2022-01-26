package com.edgedo.sys.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edgedo.common.base.BaseController;
import com.edgedo.common.shiro.User;
import com.edgedo.common.util.HttpRequestUtil;
import com.edgedo.common.util.JsonUtils;
import com.edgedo.sys.entity.*;
import com.edgedo.sys.queryvo.BigdataBeidouSafetyCarInfoQuery;
import com.edgedo.sys.queryvo.BigdataBeidouSafetyCarInfoView;
import com.edgedo.sys.queryvo.*;
import com.edgedo.sys.service.BigdataBeidouCompService;
import com.edgedo.sys.service.BigdataBeidouSafetyCarInfoService;
import com.edgedo.sys.service.BigdataBeidouTeamInfoService;
import com.edgedo.sys.service.SysOrgService;
import com.edgedo.timedtask.BigPlatFormCar;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Api(tags = "BigdataBeidouSafetyCarInfo")
@Controller
@RequestMapping("/admin/bigdataBeidouSafetyCarInfo")
public class BigdataBeidouSafetyCarInfoController extends BaseController{
	
	@Autowired
	private BigdataBeidouSafetyCarInfoService service;
	@Autowired
	private SysOrgService sysOrgService;
	@Autowired
	private BigdataBeidouTeamInfoService bigdataBeidouTeamInfoService;
	@Autowired
	private BigdataBeidouCompService bigdataBeidouCompService;

	/**
	 * 分页查询
	 * @param query
	 * @return
	 */
	@ApiOperation(value = "分页查询BigdataBeidouSafetyCarInfo", notes = "分页查询BigdataBeidouSafetyCarInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/listpage",method = RequestMethod.POST)
	public ModelAndView listpage(@ModelAttribute BigdataBeidouSafetyCarInfoQuery query){
		ModelAndView modelAndView = new ModelAndView();
		if(query.getQueryObj().getSelectTime() != null && !query.getQueryObj().getSelectTime().equals("")){
			String dateSection = query.getQueryObj().getSelectTime();
			String dateSectionStr = dateSection.replaceAll(" "," ");//去掉所有空格
			String[] dateSectionArr = dateSectionStr.split("-");//切割
			String selectTime = dateSectionArr[0]+"-"+dateSectionArr[1]+"-"+dateSectionArr[2];
			String endTime = dateSectionArr[3]+"-"+dateSectionArr[4]+"-"+dateSectionArr[5];
			query.getQueryObj().setSelectTime(selectTime);//开始时间
			query.getQueryObj().setEndTime(endTime);//结束时间
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
	@ApiOperation(value = "新增修改BigdataBeidouSafetyCarInfo", notes = "新增修改BigdataBeidouSafetyCarInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/saveOrUpdate",method = RequestMethod.POST)
	public ModelAndView saveOrUpdate(BigdataBeidouSafetyCarInfo voObj){
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
	@ApiOperation(value = "根据ID批量删除BigdataBeidouSafetyCarInfo", notes = "根据ID批量删除BigdataBeidouSafetyCarInfo")
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
	@ApiOperation(value = "根据ID加载BigdataBeidouSafetyCarInfo", notes = "根据ID加载BigdataBeidouSafetyCarInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/loadById",method = RequestMethod.POST)
	public ModelAndView  loadById(String id){
		ModelAndView modelAndView = new ModelAndView();
		return buildResponse(modelAndView, service.loadById(id));
	}


	/**
	 * 车辆查询
	 * @param carPlateNum
	 * @param jyCertNumber
	 * @param carFrameNum
	 * @param contactPerson
	 * @return
	 */
	@RequestMapping(value = "/bigPlatformCar",method = RequestMethod.POST)
	public ModelAndView bigPlatformCar(String carPlateNum,String jyCertNumber,String carFrameNum,String contactPerson ){
		ModelAndView modelAndView = new ModelAndView();
		List<JsonData> transitCarInfoList = BigPlatFormCar.bigPlatFormCarData(carPlateNum,jyCertNumber,carFrameNum,contactPerson);
		buildResponse(modelAndView,transitCarInfoList);
		return modelAndView;
	}


	/**
	 * 车辆ID查找车辆详细信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/selectBigPlatCarById",method = RequestMethod.POST)
	public ModelAndView selectBigPlatCarById(String id){
		ModelAndView modelAndView = new ModelAndView();
		List<TransitCarInfoXiangxi> transitCarInfoXiangxiList = BigPlatFormCar.selectBigPlatCarById(id);
		buildResponse(modelAndView,transitCarInfoXiangxiList);
		return modelAndView;
	}


	/**
	 * 根据车队ID查询车
	 * @param teamId
	 * @return
	 */
	@ApiOperation(value = "根据ID加载BigdataBeidouSafetyCarInfo", notes = "根据ID加载BigdataBeidouSafetyCarInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/selectByTeamId",method = RequestMethod.POST)
	public ModelAndView  selectByTeamId(String teamId){
		ModelAndView modelAndView = new ModelAndView();
		List<BigdataBeidouSafetyCarInfo> bigdataBeidouSafetyCarInfoList = service.selectByTeamId(teamId);
		List<SysOrgViewTree> sysOrgViewTreeList = new ArrayList<>();
		for(BigdataBeidouSafetyCarInfo carInfo:bigdataBeidouSafetyCarInfoList){
			SysOrgViewTree sysOrgViewTree = new SysOrgViewTree();
			sysOrgViewTree.setId(carInfo.getId());
			sysOrgViewTree.setTitle1(carInfo.getCarPlateNum());
			sysOrgViewTree.setCheckArr("0");
			sysOrgViewTree.setLast(true);
			sysOrgViewTree.setParentId(teamId);
			sysOrgViewTreeList.add(sysOrgViewTree);
		}
		return buildResponse(modelAndView, sysOrgViewTreeList);
	}

	/**
	 * 根据车队ID查询车
	 * @param carPlateNum
	 * @return
	 */
	@ApiOperation(value = "根据ID加载BigdataBeidouSafetyCarInfo", notes = "根据ID加载BigdataBeidouSafetyCarInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/selectByCarPlateNum",method = RequestMethod.POST)
	public ModelAndView  selectByCarPlateNum(String carPlateNum){
		ModelAndView modelAndView = new ModelAndView();
		User user = getLoginUser();
		String userType = user.getUserType();
		List<BigdataBeidouSafetyCarInfo> bigdataBeidouSafetyCarInfoList = service.selectByCarPlateNum(carPlateNum,userType);
		BigdataBeidouSafetyCarInfoQuery query = new BigdataBeidouSafetyCarInfoQuery();
		query.setList(bigdataBeidouSafetyCarInfoList);
		return buildResponse(modelAndView,query);
	}

	//获取所有的车辆信息组装树
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/getCarTree",method = RequestMethod.POST)
	public ModelAndView  getCarTree(){
		ModelAndView modelAndView = new ModelAndView();
		User user = getLoginUser();
		SysOrgViewTree sysOrgViewTree = new SysOrgViewTree ();
		sysOrgViewTree.setId("ROOT");
		sysOrgViewTree.setTitle();
		sysOrgViewTree.setCheckArr("0");
		List<SysOrgViewTree> childList = sysOrgService.selectByPreantIDNew("ROOT");
		sysOrgViewTree.setChildren(childList);
		recursiveNew(childList);
		//查新车队信息
		BigdataBeidouTeamInfoQuery bigdataBeidouTeamInfoQuery = new BigdataBeidouTeamInfoQuery();
		bigdataBeidouTeamInfoQuery.setUserType(user.getUserType());
		List<BigdataBeidouTeamInfoView> bigdataBeidouTeamInfoViewList = bigdataBeidouTeamInfoService.listByObj(bigdataBeidouTeamInfoQuery);
		List<SysOrgViewTree> sysOrgViewTreeList = new ArrayList<>();
		for(BigdataBeidouTeamInfoView teamInfoView:bigdataBeidouTeamInfoViewList){
			SysOrgViewTree sysOrgViewTree1 = new SysOrgViewTree();
			sysOrgViewTree1.setId(teamInfoView.getId());
			sysOrgViewTree1.setTitle1(teamInfoView.getTeamName());
			sysOrgViewTree1.setCheckArr("0");
			sysOrgViewTree1.setLast(false);
			sysOrgViewTree1.setParentId(teamInfoView.getXianquId());
			sysOrgViewTreeList.add(sysOrgViewTree1);
		}
		//查询车辆信息
		BigdataBeidouSafetyCarInfoQuery bigdataBeidouSafetyCarInfoQuery = new BigdataBeidouSafetyCarInfoQuery();
		bigdataBeidouSafetyCarInfoQuery.setUserType(user.getUserType());
		List<BigdataBeidouSafetyCarInfoView> bigdataBeidouSafetyCarInfoList = service.listByObj(bigdataBeidouSafetyCarInfoQuery);
		for(BigdataBeidouSafetyCarInfoView carInfoView:bigdataBeidouSafetyCarInfoList){
			for (SysOrgViewTree tree:sysOrgViewTreeList){
				if(tree.getId().equals(carInfoView.getTeamId())){
					SysOrgViewTree sysOrgViewTree1 = new SysOrgViewTree();
					sysOrgViewTree1.setId(carInfoView.getId());
					sysOrgViewTree1.setTitle1(carInfoView.getCarPlateNum());
					sysOrgViewTree1.setCheckArr("0");
					sysOrgViewTree1.setLast(true);
					sysOrgViewTree1.setParentId(tree.getId());
					tree.getChildren().add(sysOrgViewTree1);
				}
			}
		}
		for(SysOrgViewTree tree:childList){
			List<SysOrgViewTree> ygzList = tree.getChildren();
			for (SysOrgViewTree t:sysOrgViewTreeList){
				for(SysOrgViewTree t1:ygzList){
					if(t.getParentId().equals(t1.getXianquId())){
						t1.getChildren().add(t);
					}
				}
			}
		}
		return buildResponse(modelAndView, childList);
	}

	private void recursiveNew(List<SysOrgViewTree> list){

		for(SysOrgViewTree pmv : list){
			if(pmv==null){
				return;
			}
			pmv.setTitle();
			pmv.setCheckArr("0");
			pmv.setLast(false);
			List<SysOrgViewTree> childList = sysOrgService.selectByPreantIDNew(pmv.getId());
			pmv.setChildren(childList);
			recursiveNew(pmv.getChildren());
		}
	}

	@ApiOperation(value = "根据ID加载BigdataBeidouSafetyCarInfo", notes = "根据ID加载BigdataBeidouSafetyCarInfo")
	@ApiImplicitParam(name = "access-token", value = "用户登录秘钥", paramType = "header", required = true, dataType = "String")
	@RequestMapping(value = "/loadByIdForVideo",method = RequestMethod.POST)
	public ModelAndView  loadByIdForVideo(String id){
		ModelAndView modelAndView = new ModelAndView();
		CarInfoForVideo carInfoForVideo = new CarInfoForVideo();
		BigdataBeidouSafetyCarInfo bigdataBeidouSafetyCarInfo = service.loadById(id);
		carInfoForVideo.setCarPlateNum(bigdataBeidouSafetyCarInfo.getCarPlateNum());
		carInfoForVideo.setCarPlateColor(bigdataBeidouSafetyCarInfo.getCarPlateColor());
		carInfoForVideo.setSim(bigdataBeidouSafetyCarInfo.getSim());
		carInfoForVideo.setDeviceType(bigdataBeidouSafetyCarInfo.getDeviceType());
		carInfoForVideo.setChannelEnable(bigdataBeidouSafetyCarInfo.getChannelEnable());

		BigdataBeidouComp bigdataBeidouComp = bigdataBeidouCompService.loadById(bigdataBeidouSafetyCarInfo.getCompId());
		carInfoForVideo.setLiveIp(bigdataBeidouComp.getLiveIp());
		carInfoForVideo.setLivePort(bigdataBeidouComp.getLivePort());
		carInfoForVideo.setLiveType(bigdataBeidouComp.getLiveType());
		return buildResponse(modelAndView, carInfoForVideo);
	}

}
