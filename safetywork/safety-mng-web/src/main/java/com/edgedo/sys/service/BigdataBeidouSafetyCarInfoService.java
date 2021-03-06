package com.edgedo.sys.service;
		
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.edgedo.common.util.Guid;
import com.edgedo.sys.entity.BigdataBeidouSafetyCarInfo;
import com.edgedo.sys.mapper.BigdataBeidouSafetyCarInfoMapper;
import com.edgedo.sys.queryvo.BigdataBeidouSafetyCarInfoQuery;
import com.edgedo.sys.queryvo.BigdataBeidouSafetyCarInfoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
public class BigdataBeidouSafetyCarInfoService {
	
	
	@Autowired
	private BigdataBeidouSafetyCarInfoMapper mapper;

	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public List<BigdataBeidouSafetyCarInfoView> listPage(BigdataBeidouSafetyCarInfoQuery query){
		List<BigdataBeidouSafetyCarInfoView> bigdataBeidouSafetyCarInfoList = mapper.listPage(query);
		for(BigdataBeidouSafetyCarInfoView bigdataBeidouSafetyCarInfoView:bigdataBeidouSafetyCarInfoList){
			if(bigdataBeidouSafetyCarInfoView.getCarPlateColor().equals("2")){
				bigdataBeidouSafetyCarInfoView.setCarPlateColor("黄");
			}else{
				bigdataBeidouSafetyCarInfoView.setCarPlateColor("蓝");
			}
		}
		query.setList(bigdataBeidouSafetyCarInfoList);
		return bigdataBeidouSafetyCarInfoList;
	}
	
	/***
	 * 新增方法
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String insert(BigdataBeidouSafetyCarInfo voObj) {
		voObj.setId(Guid.guid());
		mapper.insert(voObj);
		return "";
	}
	
	/***
	 * 动态修改方法
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String update(BigdataBeidouSafetyCarInfo voObj) {
		mapper.updateById(voObj);
		return "";
	}
	
	/***
	 * 全修改
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updateAll(BigdataBeidouSafetyCarInfo voObj) {
		mapper.updateAllColumnById(voObj);
		return "";
	}
	
	
	
	/**
	 * 单个删除
	 * @param id
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public int delete(String id) {
		
		return mapper.deleteById(id);
	}
	
	/**
	 * 批量删除
	 * @param ids
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public int deleteByIds(List<String> ids) {
		
		return mapper.deleteBatchIds(ids);
	}
	
	
	
	/**
	 * 加载单个
	 * @param id
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public BigdataBeidouSafetyCarInfo loadById(String id) {
		return mapper.selectById(id);
	}


	public List<BigdataBeidouSafetyCarInfo> selectByTeamId(String teamId) {
		return mapper.selectByTeamId(teamId);
	}

	public List<BigdataBeidouSafetyCarInfo> selectByCarPlateNum(String carPlateNum,String userType) {
		Map<String,String> map = new HashMap<>();
		map.put("carPlateNum",carPlateNum);
		map.put("userType",userType);
		return mapper.selectByCarPlateNum(map);
	}

	public BigdataBeidouSafetyCarInfo selectByCarPlateNumNew(String carPlateNum) {
		return mapper.selectByCarPlateNumNew(carPlateNum);
	}
	public List<BigdataBeidouSafetyCarInfoView> listByObj(BigdataBeidouSafetyCarInfoQuery query) {
		return mapper.listByObj(query);
	}
}
