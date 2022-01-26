package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.BigdataSafetyWarningFile;
import com.edgedo.sys.queryvo.BigdataSafetyWarningFileQuery;
import com.edgedo.sys.queryvo.BigdataSafetyWarningFileView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface BigdataSafetyWarningFileMapper  extends BaseMapper<BigdataSafetyWarningFile>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataSafetyWarningFileView> listPage(BigdataSafetyWarningFileQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<BigdataSafetyWarningFileView> listByObj(BigdataSafetyWarningFileQuery query);


    List<BigdataSafetyWarningFile> selectByIdsAndCountMonth(String ids, String countMonth);
}