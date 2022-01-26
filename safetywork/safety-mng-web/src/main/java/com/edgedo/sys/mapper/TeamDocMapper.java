package com.edgedo.sys.mapper;

import java.util.List;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.TeamDoc;
import com.edgedo.sys.queryvo.TeamDocQuery;
import com.edgedo.sys.queryvo.TeamDocView;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface TeamDocMapper  extends BaseMapper<TeamDoc>{
	
	/**
	 * 分页条件查询
	 * @param query
	 * @return
	 */
	public List<TeamDocView> listPage(TeamDocQuery query);
	
	/**
	 * 不分页条件查询
	 * @param query
	 * @return
	 */
	public List<TeamDocView> listByObj(TeamDocQuery query);
	
	

}