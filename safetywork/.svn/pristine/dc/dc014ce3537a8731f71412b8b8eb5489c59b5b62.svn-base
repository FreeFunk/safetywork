package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.BigdataAlarmRecord;
import com.edgedo.sys.queryvo.BigdataAlarmRecordQuery;
import com.edgedo.sys.queryvo.BigdataAlarmRecordView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface BigdataAlarmRecordMapper  extends BaseMapper<BigdataAlarmRecord>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataAlarmRecordView> listPage(BigdataAlarmRecordQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataAlarmRecordView> listByObj(BigdataAlarmRecordQuery query);

	List selectAlarmRecordByCar(BigdataAlarmRecordQuery query);
	
	

}