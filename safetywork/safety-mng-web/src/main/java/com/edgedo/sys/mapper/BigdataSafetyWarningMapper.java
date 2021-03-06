package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.BigdataSafetyWarning;
import com.edgedo.sys.queryvo.BigdataSafetyWarningQuery;
import com.edgedo.sys.queryvo.BigdataSafetyWarningView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface BigdataSafetyWarningMapper  extends BaseMapper<BigdataSafetyWarning>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataSafetyWarningView> listPage(BigdataSafetyWarningQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataSafetyWarningView> listByObj(BigdataSafetyWarningQuery query);


    List selectwarningTypeList();
}