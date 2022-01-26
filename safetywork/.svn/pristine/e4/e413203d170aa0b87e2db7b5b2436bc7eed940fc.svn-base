package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.CarMonthOftenrunRoute;
import com.edgedo.sys.queryvo.CarMonthOftenrunRouteQuery;
import com.edgedo.sys.queryvo.CarMonthOftenrunRouteView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface CarMonthOftenrunRouteMapper  extends BaseMapper<CarMonthOftenrunRoute>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<CarMonthOftenrunRouteView> listPage(CarMonthOftenrunRouteQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<CarMonthOftenrunRouteView> listByObj(CarMonthOftenrunRouteQuery query);

	List<CarMonthOftenrunRouteView> selectOftenRunRoute(CarMonthOftenrunRouteQuery query);

}