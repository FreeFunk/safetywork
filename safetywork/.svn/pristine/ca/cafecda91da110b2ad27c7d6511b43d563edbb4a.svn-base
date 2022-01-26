package com.edgedo.sys.mapper;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.BigdataBeidouSafetyCarInfo;
import com.edgedo.sys.queryvo.BigdataBeidouSafetyCarInfoQuery;
import com.edgedo.sys.queryvo.BigdataBeidouSafetyCarInfoView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface BigdataBeidouSafetyCarInfoMapper  extends BaseMapper<BigdataBeidouSafetyCarInfo>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataBeidouSafetyCarInfoView> listPage(BigdataBeidouSafetyCarInfoQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataBeidouSafetyCarInfoView> listByObj(BigdataBeidouSafetyCarInfoQuery query);


    List<BigdataBeidouSafetyCarInfo> selectByTeamId(String teamId);


	BigdataBeidouSafetyCarInfo selectByCarPlateNumNew(String carPlateNum);

	List<BigdataBeidouSafetyCarInfo> selectByCarPlateNum(Map<String, String> map);
}