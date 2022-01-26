package com.edgedo.sys.service;
		
import java.util.List;

import com.edgedo.common.util.Guid;
import com.edgedo.sys.entity.BigdataBeidouTeamInfo;
import com.edgedo.sys.mapper.BigdataBeidouTeamInfoMapper;
import com.edgedo.sys.queryvo.BigdataBeidouTeamInfoQuery;
import com.edgedo.sys.queryvo.BigdataBeidouTeamInfoView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
public class BigdataBeidouTeamInfoService {
	
	
	@Autowired
	private BigdataBeidouTeamInfoMapper mapper;

	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public List<BigdataBeidouTeamInfoView> listPage(BigdataBeidouTeamInfoQuery query){
		List list = mapper.listPage(query);
		query.setList(list);
		return list;
	}
	
	/***
	 * 新增方法
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String insert(BigdataBeidouTeamInfo voObj) {
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
	public String update(BigdataBeidouTeamInfo voObj) {
		mapper.updateById(voObj);
		return "";
	}
	
	/***
	 * 全修改
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updateAll(BigdataBeidouTeamInfo voObj) {
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
	public BigdataBeidouTeamInfo loadById(String id) {
		return mapper.selectById(id);
	}


	public List<BigdataBeidouTeamInfo> selectByXianquId(String xianquId) {
		return mapper.selectByXianquId(xianquId);
	}

	public List<BigdataBeidouTeamInfoView> listByObj(BigdataBeidouTeamInfoQuery query) {
		return mapper.listByObj(query);
	}
}
