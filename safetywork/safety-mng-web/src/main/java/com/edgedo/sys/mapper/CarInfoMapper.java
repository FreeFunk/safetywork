package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.CarInfo;
import com.edgedo.sys.queryvo.CarInfoQuery;
import com.edgedo.sys.queryvo.CarInfoView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface CarInfoMapper  extends BaseMapper<CarInfo>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<CarInfoView> listPage(CarInfoQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<CarInfoView> listByObj(CarInfoQuery query);


    List<CarInfo> selectByCarPlateNum(String[] carArr);
}