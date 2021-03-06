package com.edgedo.sys.service;
		
import java.util.List;

import com.edgedo.common.util.Guid;
import com.edgedo.sys.entity.BigdataSafetyWarning;
import com.edgedo.sys.entity.BigdataSafetyWarningFile;
import com.edgedo.sys.mapper.BigdataSafetyWarningFileMapper;
import com.edgedo.sys.mapper.BigdataSafetyWarningMapper;
import com.edgedo.sys.queryvo.BigdataSafetyWarningQuery;
import com.edgedo.sys.queryvo.BigdataSafetyWarningView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
public class BigdataSafetyWarningService {
	
	
	@Autowired
	private BigdataSafetyWarningMapper mapper;

	@Autowired
	private BigdataSafetyWarningFileMapper bigdataSafetyWarningFileMapper;

	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public List<BigdataSafetyWarningView> listPage(BigdataSafetyWarningQuery query){
		List list = mapper.listPage(query);
		query.setList(list);
		return list;
	}
	
	/***
	 * 新增方法
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String insert(BigdataSafetyWarning voObj) {
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
	public String update(BigdataSafetyWarning voObj) {
		mapper.updateById(voObj);
		return "";
	}
	
	/***
	 * 全修改
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updateAll(BigdataSafetyWarning voObj) {
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
	public BigdataSafetyWarning loadById(String id) {
		return mapper.selectById(id);
	}


	public List<BigdataSafetyWarningFile> selectByIdsAndCountMonth(String ids, String countMonth) {
		return bigdataSafetyWarningFileMapper.selectByIdsAndCountMonth(ids,countMonth);
	}

	public List selectwarningTypeList() {
		return mapper.selectwarningTypeList();
	}
}
