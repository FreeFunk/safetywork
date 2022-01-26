package com.edgedo.timedtask;


import com.edgedo.common.util.HttpRequestUtil;
import com.edgedo.common.util.JsonUtils;
import com.edgedo.sys.entity.BigdataBeidouSafetyCarInfo;
import com.edgedo.sys.entity.JsonData;

import com.edgedo.sys.entity.TransitCarInfoList;
import com.edgedo.sys.entity.TransitCarInfoXiangxi;
import com.edgedo.sys.queryvo.BigdataBeidouSafetyCarInfoQuery;
import com.edgedo.sys.queryvo.BigdataBeidouSafetyCarInfoView;
import org.json.JSONArray;
import org.json.JSONObject;
import springfox.documentation.spring.web.json.Json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BigPlatFormCar {

    /**
     * 根据条件查询车辆数据
     * @param carPlateNum
     * @param jyCertNumber
     * @param carFrameNum
     * @param contactPerson
     * @return
     */
    public static List<JsonData> bigPlatFormCarData(String carPlateNum,String jyCertNumber,String carFrameNum,String contactPerson ) {
        List<JsonData> JsonDataList = new ArrayList<>();
        if ((carPlateNum != null) && (jyCertNumber != null) && (carFrameNum != null) && (contactPerson != null)) {
            String changeNetUrl = "http://data.qhd12328.com/transitCarBaseinfoController!getAllTransitCarInfoForAdmin.action";
            Map<String, String> params = new HashMap<>();
            params.put("queryBean.carPlateNum", carPlateNum);
            params.put("queryBean.jyCertNumber", jyCertNumber);
            params.put("queryBean.carFrameNum", carFrameNum);
            params.put("queryBean.contactPerson", contactPerson);
            Map<String, String> header = new HashMap<>();
            header.put("Cookie", "JSESSIONID=5F864F425299AF60604E32910A80011D");
            String s = "";
            try {
                s = HttpRequestUtil.sendPostRequest(changeNetUrl, params, header);
                System.out.println(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //解析json
            //一层数据
            JSONObject jsonObject = new JSONObject(s);
            //二层数据
            JSONArray jsonArray = jsonObject.optJSONArray("data");
            for (int i = 0; i < jsonArray.length(); i++) {
                JsonData jsonData = new JsonData();
                JSONObject jsonDataObject = jsonArray.optJSONObject(i);
                //车辆数量
                String carNum = jsonDataObject.optString("carNum");
                Integer newCarNum = Integer.valueOf(carNum);
                jsonData.setCarNum(newCarNum);
                //企业名称
                String teamName = jsonDataObject.optString("teamName");
                jsonData.setTeamName(teamName);
                //许可证号
                String jingxingNum = jsonDataObject.optString("jingxingNum");
                jsonData.setJingxingNum(jingxingNum);
                //三层数据
                String transitCarInfoList = jsonDataObject.optString("transitCarInfoList");
                //System.out.println(transitCarInfoList);
                List<TransitCarInfoList> transitCarInfoLists = new ArrayList<>();
                //解析车辆详细信息
                transitCarInfoLists = JsonUtils.parseList(transitCarInfoList, TransitCarInfoList.class);
                //System.out.println(transitCarInfoLists);
                jsonData.setTransitCarInfoList(transitCarInfoLists);
                JsonDataList.add(jsonData);

            }
        }
        System.out.println(JsonDataList);
        return JsonDataList;
    }

    /**
     * 根据ID查车辆详细信息
     *
     * @param id
     * @return
     */
    public static List<TransitCarInfoXiangxi> selectBigPlatCarById(String id) {//List<TransitCarInfoList>
        List<TransitCarInfoXiangxi> transitCarInfoXiangxiList = new ArrayList<>();

        String s = "";
        if (id != null) {
            String changeNetUrl = "http://data.qhd12328.com/transitCarBaseinfoController!getById.action";
            Map<String, String> params = new HashMap<>();
            params.put("queryBean.id", id);//
            Map<String, String> header = new HashMap<>();
            header.put("Cookie", "JSESSIONID=925D803CE9420B985EAB7EA70B960734");
            try {
                s = HttpRequestUtil.sendPostRequest(changeNetUrl, params, header);
                System.out.println(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        JSONObject jsonObject = new JSONObject(s);
        JSONArray transitCarInfoXiangxiArr = jsonObject.optJSONArray("data");

        for (int i = 0; i < transitCarInfoXiangxiArr.length(); i++) {
            TransitCarInfoXiangxi transitCarInfoXiangxi = new TransitCarInfoXiangxi();
            JSONObject transitCarInfoXiangxiJson = transitCarInfoXiangxiArr.optJSONObject(i);
            //id
            String carId = transitCarInfoXiangxiJson.optString("id");
            transitCarInfoXiangxi.setCarId(carId);
            //车牌号码
            String carPlateNum = transitCarInfoXiangxiJson.optString("carPlateNum");
            transitCarInfoXiangxi.setCarPlateNum(carPlateNum);
            //车架号码
            String carFrameNum = transitCarInfoXiangxiJson.optString("carFrameNum");
            transitCarInfoXiangxi.setCarFrameNum(carFrameNum);


            //道路运输证号
            String transitLicenceNum = transitCarInfoXiangxiJson.optString("transitLicenceNum");
            transitCarInfoXiangxi.setTransitLicenceNum(transitLicenceNum);
            //业户名称
            String contactPerson = transitCarInfoXiangxiJson.optString("contactPerson");
            transitCarInfoXiangxi.setContactPerson(contactPerson);
            //许可证号
            String jyCertNumber = transitCarInfoXiangxiJson.optString("jyCertNumber");
            transitCarInfoXiangxi.setJyCertNumber(jyCertNumber);
            //联系电话
            String contactPhone = transitCarInfoXiangxiJson.optString("contactPhone");
            transitCarInfoXiangxi.setContactPhone(contactPhone);
            //地理位置
            String cityName = transitCarInfoXiangxiJson.optString("cityName");
            String provinceName = transitCarInfoXiangxiJson.optString("provinceName");
            String xianquName = transitCarInfoXiangxiJson.optString("xianquName");
            String city = provinceName + cityName + xianquName;
            transitCarInfoXiangxi.setCity(city);
            //车辆品牌
            String carBrandsName = transitCarInfoXiangxiJson.optString("carBrandsName");
            transitCarInfoXiangxi.setCarBrandsName(carBrandsName);
            //下一次检测定级日期
            String nextTestLevelDate = transitCarInfoXiangxiJson.optString("nextTestLevelDate");
            transitCarInfoXiangxi.setNextTestLevelDate(nextTestLevelDate);
            //车辆型号
            String carProductCode = transitCarInfoXiangxiJson.optString("carProductCode");
            transitCarInfoXiangxi.setCarProductCode(carProductCode);
            //车辆类型
            String carFunType = transitCarInfoXiangxiJson.optString("carFunType");
            transitCarInfoXiangxi.setCarFunType(carFunType);

            String operatingStopDate = transitCarInfoXiangxiJson.optString("operatingStopDate");
            if (operatingStopDate.equals("否") || operatingStopDate.equals("是") && !operatingStopDate.equals("")) {
                transitCarInfoXiangxi.setOperatingStopDateYN(operatingStopDate);//所有车辆年审时间是否超期
            } else {
                if(transitCarInfoXiangxi.getOperatingStopDate()==null){
                    transitCarInfoXiangxi.setOperatingStopDate(operatingStopDate);//年审截止日期
                }
            }
            //许可证截止日期
            String licenseValidDate = transitCarInfoXiangxiJson.optString("licenseValidDate");
            transitCarInfoXiangxi.setLicenseValidDate(licenseValidDate);
            //车辆照片
            String carPhoto = transitCarInfoXiangxiJson.optString("carPhoto");
            transitCarInfoXiangxi.setCarPhoto(carPhoto);
            //运输企业名称
            String teamName = transitCarInfoXiangxiJson.optString("teamName");
            transitCarInfoXiangxi.setTeamName(teamName);
            //经营许可证号
            String teamAdminCode = transitCarInfoXiangxiJson.optString("teamAdminCode");
            transitCarInfoXiangxi.setTeamAdminCode(teamAdminCode);
            //业户分类
            String companyLevel = transitCarInfoXiangxiJson.optString("companyLevel");
            transitCarInfoXiangxi.setCompanyLevel(companyLevel);
            //法人代表
            String legalRepresentName = transitCarInfoXiangxiJson.optString("legalRepresentName");
            transitCarInfoXiangxi.setLegalRepresentName(legalRepresentName);
            //联系人
            String teamAdminName = transitCarInfoXiangxiJson.optString("teamAdminName");
            transitCarInfoXiangxi.setTeamAdminName(teamAdminName);
            //联系电话
            String teamAdminPhone = transitCarInfoXiangxiJson.optString("teamAdminPhone");
            transitCarInfoXiangxi.setTeamAdminPhone(teamAdminPhone);
            //所有车辆技术档案填写情况，图片及内容是否完整
            String carInfo = transitCarInfoXiangxiJson.optString("carInfo");
            transitCarInfoXiangxi.setCarInfo(carInfo);
            //基本资料及制度录入情况是否合格
            String zhidu = transitCarInfoXiangxiJson.optString("zhidu");
            transitCarInfoXiangxi.setZhidu(zhidu);
            //安全台账上传情况是否按周期上传合格
            String safeFile = transitCarInfoXiangxiJson.optString("safeFile");
            transitCarInfoXiangxi.setSafeFile(safeFile);
            //安全文件接收回复情况是否回复完成
            String ledger = transitCarInfoXiangxiJson.optString("ledger");
            transitCarInfoXiangxi.setLedger(ledger);
            //从业人员培训情况是否符合要求
            String emp = transitCarInfoXiangxiJson.optString("emp");
            transitCarInfoXiangxi.setEmp(emp);
            transitCarInfoXiangxiList.add(transitCarInfoXiangxi);

            //车牌颜色
            String newCarPlateColor = "";
            String carPlateColor = transitCarInfoXiangxiJson.optString("carPlateColor");
            if (carPlateColor.equals("2")) {
                newCarPlateColor = "黄";
            } else {
                newCarPlateColor = "黄";
            }
            transitCarInfoXiangxi.setCarPlateColor(newCarPlateColor);


        }

        return transitCarInfoXiangxiList;
        //System.out.println(transitCarInfoXiangxiList);

    }
}
