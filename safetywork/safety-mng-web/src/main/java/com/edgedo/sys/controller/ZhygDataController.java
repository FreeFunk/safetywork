package com.edgedo.sys.controller;

import com.edgedo.common.base.BaseController;
import com.edgedo.common.base.annotation.Pass;
import com.edgedo.sys.entity.*;
import com.edgedo.sys.service.BigdataBeidouSafetyCarInfoService;
import com.edgedo.sys.service.ZhygDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName ZhygDataController
 * @Description TODO
 * @Author 床前明月光
 * @Date 2019/9/2 17:14
 **/
@Controller
@RequestMapping("/admin/zhygData")
public class ZhygDataController  extends BaseController {

    @Autowired
    private ZhygDataService zhygDataService;
    @Autowired
    private BigdataBeidouSafetyCarInfoService bigdataBeidouSafetyCarInfoService;

    @RequestMapping("/selectCarBaseinfo")
    public ModelAndView selectCarBaseinfo(@ModelAttribute TransitCarInfoQuery carInfoQuery){
        ModelAndView modelAndView = new ModelAndView();
        BigdataBeidouSafetyCarInfo bigdataBeidouSafetyCarInfo  = bigdataBeidouSafetyCarInfoService.selectByCarPlateNumNew(carInfoQuery.getCarPlateNum());
        if(bigdataBeidouSafetyCarInfo!=null){
            carInfoQuery.setCarFrameNum(bigdataBeidouSafetyCarInfo.getCarFrameNum());
        }
        TransitCarBaseinfo transitCarBaseinfo = zhygDataService.selectCarBaseinfo(carInfoQuery);
        buildResponse(modelAndView,transitCarBaseinfo);
        return modelAndView;
    }


    /**
     * @author Zcc
     * @Description 根据车辆信息查询从业人员
     * @date 2019/4/3
     * @param
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/listPageEmpByCarInfo")
    public ModelAndView listPageEmpByCarInfo(@ModelAttribute EmpQuery query) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        List<Emp> empList = zhygDataService.selectEmpByCarInfo(query);
        buildResponse(modelAndView,empList);
        return modelAndView;
    }

}
