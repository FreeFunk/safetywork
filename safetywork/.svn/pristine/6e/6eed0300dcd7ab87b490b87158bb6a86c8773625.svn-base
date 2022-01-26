package com.edgedo.sys.service;
		
import java.math.BigDecimal;
import java.util.List;

import com.edgedo.common.util.Guid;
import com.edgedo.sys.entity.BigdataTimeCarDayRec;
import com.edgedo.sys.mapper.BigdataTimeCarDayRecMapper;
import com.edgedo.sys.queryvo.BigdataTimeCarDayRecQuery;
import com.edgedo.sys.queryvo.BigdataTimeCarDayRecView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
public class BigdataTimeCarDayRecService {
	
	
	@Autowired
	private BigdataTimeCarDayRecMapper mapper;

	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class,readOnly = true)
	public List<BigdataTimeCarDayRecView> listPage(BigdataTimeCarDayRecQuery query){
		List list = mapper.listPage(query);
		query.setList(list);
		return list;
	}
	
	/***
	 * 新增方法
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String insert(BigdataTimeCarDayRec voObj) {
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
	public String update(BigdataTimeCarDayRec voObj) {
		mapper.updateById(voObj);
		return "";
	}
	
	/***
	 * 全修改
	 * @param
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updateAll(BigdataTimeCarDayRec voObj) {
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
	public BigdataTimeCarDayRec loadById(String id) {
		return mapper.selectById(id);
	}

	public BigDecimal searchMileageByCarInfo(BigdataTimeCarDayRecQuery query) {
		return mapper.searchMileageByCarInfo(query);
	}

	public BigDecimal searchSpeedByCarInfo(BigdataTimeCarDayRecQuery query) {
		return  mapper.searchSpeedByCarInfo(query);
	}
}
