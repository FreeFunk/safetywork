package com.edgedo.sys.mapper;

import java.math.BigDecimal;
import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.BigdataTimeCarDayRec;
import com.edgedo.sys.queryvo.BigdataTimeCarDayRecQuery;
import com.edgedo.sys.queryvo.BigdataTimeCarDayRecView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface BigdataTimeCarDayRecMapper  extends BaseMapper<BigdataTimeCarDayRec>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataTimeCarDayRecView> listPage(BigdataTimeCarDayRecQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataTimeCarDayRecView> listByObj(BigdataTimeCarDayRecQuery query);

	BigDecimal searchMileageByCarInfo(BigdataTimeCarDayRecQuery query);


	BigDecimal searchSpeedByCarInfo(BigdataTimeCarDayRecQuery query);
}