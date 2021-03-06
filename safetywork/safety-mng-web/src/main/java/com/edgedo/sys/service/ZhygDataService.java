package com.edgedo.sys.service;

import com.edgedo.sys.entity.Emp;
import com.edgedo.sys.entity.EmpQuery;
import com.edgedo.sys.entity.TransitCarBaseinfo;
import com.edgedo.sys.entity.TransitCarInfoQuery;
import com.edgedo.sys.mapper.ZhygDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName ZhygDataService
 * @Description TODO
 * @Author 床前明月光
 * @Date 2019/9/5 20:56
 **/
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor=Exception.class)
public class ZhygDataService {

    @Autowired
    private ZhygDataMapper zhygDataMapper;

    public TransitCarBaseinfo selectCarBaseinfo(TransitCarInfoQuery query) {
        return zhygDataMapper.selectCarBaseinfo(query);
    }

    public List<Emp> selectEmpByCarInfo(EmpQuery query){
        return zhygDataMapper.selectEmpByCarInfo(query);
    }
}
