package com.edgedo.sys.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.edgedo.sys.entity.Emp;
import com.edgedo.sys.entity.EmpQuery;
import com.edgedo.sys.entity.TransitCarBaseinfo;
import com.edgedo.sys.entity.TransitCarInfoQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ZhygDataMapper extends BaseMapper<TransitCarBaseinfo> {

    TransitCarBaseinfo selectCarBaseinfo(TransitCarInfoQuery query);

    List<Emp> selectEmpByCarInfo(EmpQuery query);
}
