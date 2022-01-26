package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.BigdataConfigLine;
import com.edgedo.sys.queryvo.BigdataConfigLineQuery;
import com.edgedo.sys.queryvo.BigdataConfigLineView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface BigdataConfigLineMapper  extends BaseMapper<BigdataConfigLine>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataConfigLineView> listPage(BigdataConfigLineQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataConfigLineView> listByObj(BigdataConfigLineQuery query);
	
	

}