package com.edgedo.sys.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

@TableName("car_info")
public class CarInfo implements Serializable{
	
		
	/**
	 * 属性描述:主键
	 */
	@TableField(value="ID",exist=true)
	java.lang.String id;
	
	/**
	 * 属性描述:创建时间
	 */
	@TableField(value="CREATE_TIME",exist=true)
	java.util.Date createTime;
	
	/**
	 * 属性描述:省ID
	 */
	@TableField(value="PROVINCE_ID",exist=true)
	java.lang.String provinceId;
	
	/**
	 * 属性描述:省名
	 */
	@TableField(value="PROVINCE_NAME",exist=true)
	java.lang.String provinceName;
	
	/**
	 * 属性描述:城市ID
	 */
	@TableField(value="CITY_ID",exist=true)
	java.lang.String cityId;
	
	/**
	 * 属性描述:城市名
	 */
	@TableField(value="CITY_NAME",exist=true)
	java.lang.String cityName;
	
	/**
	 * 属性描述:县区ID
	 */
	@TableField(value="XIANQU_ID",exist=true)
	java.lang.String xianquId;
	
	/**
	 * 属性描述:县区名
	 */
	@TableField(value="XIANQU_NAME",exist=true)
	java.lang.String xianquName;
	
	/**
	 * 属性描述:车牌号
	 */
	@TableField(value="CAR_PLATE_NUM",exist=true)
	java.lang.String carPlateNum;
	
	/**
	 * 属性描述:车牌颜色
	 */
	@TableField(value="CAR_PLATE_COLOUR",exist=true)
	java.lang.String carPlateColour;
	
	/**
	 * 属性描述:车架号
	 */
	@TableField(value="CAR_FRAME_NUM",exist=true)
	java.lang.String carFrameNum;
	
	/**
	 * 属性描述:许可证号
	 */
	@TableField(value="LICENSE_CODE",exist=true)
	java.lang.String licenseCode;
	
	/**
	 * 属性描述:业户名称
	 */
	@TableField(value="OWNER_NAME",exist=true)
	java.lang.String ownerName;
	
	/**
	 * 属性描述:联系电话
	 */
	@TableField(value="OWNER_PHONE_NUM",exist=true)
	java.lang.String ownerPhoneNum;
	
	/**
	 * 属性描述:车辆类型
	 */
	@TableField(value="CAR_TYPE",exist=true)
	java.lang.String carType;
	
	/**
	 * 属性描述:车辆品牌
	 */
	@TableField(value="CAR_BRAND",exist=true)
	java.lang.String carBrand;
	
	/**
	 * 属性描述:车辆型号
	 */
	@TableField(value="CAR_MODEL",exist=true)
	java.lang.String carModel;
	
	/**
	 * 属性描述:外廓尺寸-长
	 */
	@TableField(value="OUTSIZE_LENGTH",exist=true)
	java.math.BigDecimal outsizeLength;
	
	/**
	 * 属性描述:外廓尺寸-宽
	 */
	@TableField(value="OUTSIZE_WIDTH",exist=true)
	java.math.BigDecimal outsizeWidth;
	
	/**
	 * 属性描述:外廓尺寸-高
	 */
	@TableField(value="OUTSIZE_HEIGHT",exist=true)
	java.math.BigDecimal outsizeHeight;
	
	/**
	 * 属性描述:北斗运营商
	 */
	@TableField(value="BEIDOU_OPERATOR",exist=true)
	java.lang.String beidouOperator;
	
	/**
	 * 属性描述:所属车队ID
	 */
	@TableField(value="OWNER_TEAM_ID",exist=true)
	java.lang.String ownerTeamId;
	
	/**
	 * 属性描述:所属车队名
	 */
	@TableField(value="OWNER_TEAM_NAME",exist=true)
	java.lang.String ownerTeamName;
	
	/**
	 * 属性描述:行驶状态
	 */
	@TableField(value="RUN_STATE",exist=true)
	java.lang.String runState;
	
	/**
	 * 属性描述:车辆来源
	 */
	@TableField(value="CAR_SOURCE",exist=true)
	java.lang.String carSource;
	
	/**
	 * 属性描述:经度
	 */
	@TableField(value="LONGITUDE",exist=true)
	java.math.BigDecimal longitude;
	
	/**
	 * 属性描述:纬度
	 */
	@TableField(value="LATITUDE",exist=true)
	java.math.BigDecimal latitude;
	
	/**
	 * 属性描述:当前省ID
	 */
	@TableField(value="CURRENT_PROVINCE_ID",exist=true)
	java.lang.String currentProvinceId;
	
	/**
	 * 属性描述:当前省名
	 */
	@TableField(value="CURRENT_PROVINCE_NAME",exist=true)
	java.lang.String currentProvinceName;
	
	/**
	 * 属性描述:当前城市ID
	 */
	@TableField(value="CURRENT_CITY_ID",exist=true)
	java.lang.String currentCityId;
	
	/**
	 * 属性描述:当前城市名
	 */
	@TableField(value="CURRENT_CITY_NAME",exist=true)
	java.lang.String currentCityName;
	
	/**
	 * 属性描述:当前县区ID
	 */
	@TableField(value="CURRENT_XIANQU_ID",exist=true)
	java.lang.String currentXianquId;
	
	/**
	 * 属性描述:当前县区名
	 */
	@TableField(value="CURRENT_XIANQU_NAME",exist=true)
	java.lang.String currentXianquName;
	
	/**
	 * 属性描述:地理位置信息
	 */
	@TableField(value="LOCALTION_INFO",exist=true)
	java.lang.String localtionInfo;
	
	/**
	 * 属性描述:数据状态
	 */
	@TableField(value="DATA_STATE",exist=true)
	java.lang.String dataState;
	
	/**
	 * 属性描述:sortNum
	 */
	@TableField(value="SORT_NUM",exist=true)
	java.lang.Integer sortNum;
	
	/**
	 * 属性描述:onlineState
	 */
	@TableField(value="ONLINE_STATE",exist=true)
	java.lang.String onlineState;
	
	/**
	 * 属性描述:operatFlag
	 */
	@TableField(value="OPERAT_FLAG",exist=true)
	java.lang.String operatFlag;
	
	/**
	 * 属性描述:carPlateColorText
	 */
	@TableField(value="CAR_PLATE_COLOR_TEXT",exist=true)
	java.lang.String carPlateColorText;
	
	/**
	 * 属性描述:totalTakeMass
	 */
	@TableField(value="total_take_mass",exist=true)
	java.math.BigDecimal totalTakeMass;
	
	/**
	 * 属性描述:totalPullMass
	 */
	@TableField(value="total_pull_mass",exist=true)
	java.math.BigDecimal totalPullMass;
	
	/**
	 * 属性描述:sitPeopleNum
	 */
	@TableField(value="sit_people_num",exist=true)
	java.lang.Integer sitPeopleNum;
	
	/**
	 * 属性描述:isSynCar
	 */
	@TableField(value="IS_SYN_CAR",exist=true)
	java.lang.String isSynCar;
	
	/**
	 * 属性描述:todayTimeTotal
	 */
	@TableField(value="TODAY_TIME_TOTAL",exist=true)
	java.math.BigDecimal todayTimeTotal;
	
	/**
	 * 属性描述:todayMileageTotal
	 */
	@TableField(value="TODAY_MILEAGE_TOTAL",exist=true)
	java.math.BigDecimal todayMileageTotal;
	
	/**
	 * 属性描述:morningMinuteNum
	 */
	@TableField(value="MORNING_MINUTE_NUM",exist=true)
	java.math.BigDecimal morningMinuteNum;
	
	/**
	 * 属性描述:noonMinuteNum
	 */
	@TableField(value="NOON_MINUTE_NUM",exist=true)
	java.math.BigDecimal noonMinuteNum;
	
	/**
	 * 属性描述:duskMinuteNum
	 */
	@TableField(value="DUSK_MINUTE_NUM",exist=true)
	java.math.BigDecimal duskMinuteNum;
	
	/**
	 * 属性描述:lingchenMinuteNum
	 */
	@TableField(value="LINGCHEN_MINUTE_NUM",exist=true)
	java.math.BigDecimal lingchenMinuteNum;
	
	/**
	 * 属性描述:midnightMinuteNum
	 */
	@TableField(value="MIDNIGHT_MINUTE_NUM",exist=true)
	java.math.BigDecimal midnightMinuteNum;
	
	/**
	 * 属性描述:morningMileage
	 */
	@TableField(value="MORNING_MILEAGE",exist=true)
	java.math.BigDecimal morningMileage;
	
	/**
	 * 属性描述:noonMileage
	 */
	@TableField(value="NOON_MILEAGE",exist=true)
	java.math.BigDecimal noonMileage;
	
	/**
	 * 属性描述:duskMileage
	 */
	@TableField(value="DUSK_MILEAGE",exist=true)
	java.math.BigDecimal duskMileage;
	
	/**
	 * 属性描述:midnightMileage
	 */
	@TableField(value="MIDNIGHT_MILEAGE",exist=true)
	java.math.BigDecimal midnightMileage;
	
	/**
	 * 属性描述:lingchenMileage
	 */
	@TableField(value="LINGCHEN_MILEAGE",exist=true)
	java.math.BigDecimal lingchenMileage;
	
	/**
	 * 属性描述:empId
	 */
	@TableField(value="EMP_ID",exist=true)
	java.lang.String empId;
	
	/**
	 * 属性描述:empName
	 */
	@TableField(value="EMP_NAME",exist=true)
	java.lang.String empName;
	
	/**
	 * 属性描述:empCode
	 */
	@TableField(value="EMP_CODE",exist=true)
	java.lang.String empCode;
	
	/**
	 * 属性描述:empPhone
	 */
	@TableField(value="EMP_PHONE",exist=true)
	java.lang.String empPhone;
	
	/**
	 * 属性描述:areaUpTime
	 */
	@TableField(value="AREA_UP_TIME",exist=true)
	java.util.Date areaUpTime;
	
	/**
	 * 属性描述:lastPositionTime
	 */
	@TableField(value="LAST_POSITION_TIME",exist=true)
	java.util.Date lastPositionTime;
	
	/**
	 * 属性描述:comId
	 */
	@TableField(value="COM_ID",exist=true)
	java.lang.String comId;
	
	/**
	 * 属性描述:comName
	 */
	@TableField(value="COM_NAME",exist=true)
	java.lang.String comName;
	
	
	
	
	
	
	public java.lang.String getId(){
		return this.id;
	}
	
	public void setId(java.lang.String id){
		this.id=id;
	}
	
	
	public java.util.Date getCreateTime(){
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date createTime){
		this.createTime=createTime;
	}
	
	
	public java.lang.String getProvinceId(){
		return this.provinceId;
	}
	
	public void setProvinceId(java.lang.String provinceId){
		this.provinceId=provinceId;
	}
	
	
	public java.lang.String getProvinceName(){
		return this.provinceName;
	}
	
	public void setProvinceName(java.lang.String provinceName){
		this.provinceName=provinceName;
	}
	
	
	public java.lang.String getCityId(){
		return this.cityId;
	}
	
	public void setCityId(java.lang.String cityId){
		this.cityId=cityId;
	}
	
	
	public java.lang.String getCityName(){
		return this.cityName;
	}
	
	public void setCityName(java.lang.String cityName){
		this.cityName=cityName;
	}
	
	
	public java.lang.String getXianquId(){
		return this.xianquId;
	}
	
	public void setXianquId(java.lang.String xianquId){
		this.xianquId=xianquId;
	}
	
	
	public java.lang.String getXianquName(){
		return this.xianquName;
	}
	
	public void setXianquName(java.lang.String xianquName){
		this.xianquName=xianquName;
	}
	
	
	public java.lang.String getCarPlateNum(){
		return this.carPlateNum;
	}
	
	public void setCarPlateNum(java.lang.String carPlateNum){
		this.carPlateNum=carPlateNum;
	}
	
	
	public java.lang.String getCarPlateColour(){
		return this.carPlateColour;
	}
	
	public void setCarPlateColour(java.lang.String carPlateColour){
		this.carPlateColour=carPlateColour;
	}
	
	
	public java.lang.String getCarFrameNum(){
		return this.carFrameNum;
	}
	
	public void setCarFrameNum(java.lang.String carFrameNum){
		this.carFrameNum=carFrameNum;
	}
	
	
	public java.lang.String getLicenseCode(){
		return this.licenseCode;
	}
	
	public void setLicenseCode(java.lang.String licenseCode){
		this.licenseCode=licenseCode;
	}
	
	
	public java.lang.String getOwnerName(){
		return this.ownerName;
	}
	
	public void setOwnerName(java.lang.String ownerName){
		this.ownerName=ownerName;
	}
	
	
	public java.lang.String getOwnerPhoneNum(){
		return this.ownerPhoneNum;
	}
	
	public void setOwnerPhoneNum(java.lang.String ownerPhoneNum){
		this.ownerPhoneNum=ownerPhoneNum;
	}
	
	
	public java.lang.String getCarType(){
		return this.carType;
	}
	
	public void setCarType(java.lang.String carType){
		this.carType=carType;
	}
	
	
	public java.lang.String getCarBrand(){
		return this.carBrand;
	}
	
	public void setCarBrand(java.lang.String carBrand){
		this.carBrand=carBrand;
	}
	
	
	public java.lang.String getCarModel(){
		return this.carModel;
	}
	
	public void setCarModel(java.lang.String carModel){
		this.carModel=carModel;
	}
	
	
	public java.math.BigDecimal getOutsizeLength(){
		return this.outsizeLength;
	}
	
	public void setOutsizeLength(java.math.BigDecimal outsizeLength){
		this.outsizeLength=outsizeLength;
	}
	
	
	public java.math.BigDecimal getOutsizeWidth(){
		return this.outsizeWidth;
	}
	
	public void setOutsizeWidth(java.math.BigDecimal outsizeWidth){
		this.outsizeWidth=outsizeWidth;
	}
	
	
	public java.math.BigDecimal getOutsizeHeight(){
		return this.outsizeHeight;
	}
	
	public void setOutsizeHeight(java.math.BigDecimal outsizeHeight){
		this.outsizeHeight=outsizeHeight;
	}
	
	
	public java.lang.String getBeidouOperator(){
		return this.beidouOperator;
	}
	
	public void setBeidouOperator(java.lang.String beidouOperator){
		this.beidouOperator=beidouOperator;
	}
	
	
	public java.lang.String getOwnerTeamId(){
		return this.ownerTeamId;
	}
	
	public void setOwnerTeamId(java.lang.String ownerTeamId){
		this.ownerTeamId=ownerTeamId;
	}
	
	
	public java.lang.String getOwnerTeamName(){
		return this.ownerTeamName;
	}
	
	public void setOwnerTeamName(java.lang.String ownerTeamName){
		this.ownerTeamName=ownerTeamName;
	}
	
	
	public java.lang.String getRunState(){
		return this.runState;
	}
	
	public void setRunState(java.lang.String runState){
		this.runState=runState;
	}
	
	
	public java.lang.String getCarSource(){
		return this.carSource;
	}
	
	public void setCarSource(java.lang.String carSource){
		this.carSource=carSource;
	}
	
	
	public java.math.BigDecimal getLongitude(){
		return this.longitude;
	}
	
	public void setLongitude(java.math.BigDecimal longitude){
		this.longitude=longitude;
	}
	
	
	public java.math.BigDecimal getLatitude(){
		return this.latitude;
	}
	
	public void setLatitude(java.math.BigDecimal latitude){
		this.latitude=latitude;
	}
	
	
	public java.lang.String getCurrentProvinceId(){
		return this.currentProvinceId;
	}
	
	public void setCurrentProvinceId(java.lang.String currentProvinceId){
		this.currentProvinceId=currentProvinceId;
	}
	
	
	public java.lang.String getCurrentProvinceName(){
		return this.currentProvinceName;
	}
	
	public void setCurrentProvinceName(java.lang.String currentProvinceName){
		this.currentProvinceName=currentProvinceName;
	}
	
	
	public java.lang.String getCurrentCityId(){
		return this.currentCityId;
	}
	
	public void setCurrentCityId(java.lang.String currentCityId){
		this.currentCityId=currentCityId;
	}
	
	
	public java.lang.String getCurrentCityName(){
		return this.currentCityName;
	}
	
	public void setCurrentCityName(java.lang.String currentCityName){
		this.currentCityName=currentCityName;
	}
	
	
	public java.lang.String getCurrentXianquId(){
		return this.currentXianquId;
	}
	
	public void setCurrentXianquId(java.lang.String currentXianquId){
		this.currentXianquId=currentXianquId;
	}
	
	
	public java.lang.String getCurrentXianquName(){
		return this.currentXianquName;
	}
	
	public void setCurrentXianquName(java.lang.String currentXianquName){
		this.currentXianquName=currentXianquName;
	}
	
	
	public java.lang.String getLocaltionInfo(){
		return this.localtionInfo;
	}
	
	public void setLocaltionInfo(java.lang.String localtionInfo){
		this.localtionInfo=localtionInfo;
	}
	
	
	public java.lang.String getDataState(){
		return this.dataState;
	}
	
	public void setDataState(java.lang.String dataState){
		this.dataState=dataState;
	}
	
	
	public java.lang.Integer getSortNum(){
		return this.sortNum;
	}
	
	public void setSortNum(java.lang.Integer sortNum){
		this.sortNum=sortNum;
	}
	
	
	public java.lang.String getOnlineState(){
		return this.onlineState;
	}
	
	public void setOnlineState(java.lang.String onlineState){
		this.onlineState=onlineState;
	}
	
	
	public java.lang.String getOperatFlag(){
		return this.operatFlag;
	}
	
	public void setOperatFlag(java.lang.String operatFlag){
		this.operatFlag=operatFlag;
	}
	
	
	public java.lang.String getCarPlateColorText(){
		return this.carPlateColorText;
	}
	
	public void setCarPlateColorText(java.lang.String carPlateColorText){
		this.carPlateColorText=carPlateColorText;
	}
	
	
	public java.math.BigDecimal getTotalTakeMass(){
		return this.totalTakeMass;
	}
	
	public void setTotalTakeMass(java.math.BigDecimal totalTakeMass){
		this.totalTakeMass=totalTakeMass;
	}
	
	
	public java.math.BigDecimal getTotalPullMass(){
		return this.totalPullMass;
	}
	
	public void setTotalPullMass(java.math.BigDecimal totalPullMass){
		this.totalPullMass=totalPullMass;
	}
	
	
	public java.lang.Integer getSitPeopleNum(){
		return this.sitPeopleNum;
	}
	
	public void setSitPeopleNum(java.lang.Integer sitPeopleNum){
		this.sitPeopleNum=sitPeopleNum;
	}
	
	
	public java.lang.String getIsSynCar(){
		return this.isSynCar;
	}
	
	public void setIsSynCar(java.lang.String isSynCar){
		this.isSynCar=isSynCar;
	}
	
	
	public java.math.BigDecimal getTodayTimeTotal(){
		return this.todayTimeTotal;
	}
	
	public void setTodayTimeTotal(java.math.BigDecimal todayTimeTotal){
		this.todayTimeTotal=todayTimeTotal;
	}
	
	
	public java.math.BigDecimal getTodayMileageTotal(){
		return this.todayMileageTotal;
	}
	
	public void setTodayMileageTotal(java.math.BigDecimal todayMileageTotal){
		this.todayMileageTotal=todayMileageTotal;
	}
	
	
	public java.math.BigDecimal getMorningMinuteNum(){
		return this.morningMinuteNum;
	}
	
	public void setMorningMinuteNum(java.math.BigDecimal morningMinuteNum){
		this.morningMinuteNum=morningMinuteNum;
	}
	
	
	public java.math.BigDecimal getNoonMinuteNum(){
		return this.noonMinuteNum;
	}
	
	public void setNoonMinuteNum(java.math.BigDecimal noonMinuteNum){
		this.noonMinuteNum=noonMinuteNum;
	}
	
	
	public java.math.BigDecimal getDuskMinuteNum(){
		return this.duskMinuteNum;
	}
	
	public void setDuskMinuteNum(java.math.BigDecimal duskMinuteNum){
		this.duskMinuteNum=duskMinuteNum;
	}
	
	
	public java.math.BigDecimal getLingchenMinuteNum(){
		return this.lingchenMinuteNum;
	}
	
	public void setLingchenMinuteNum(java.math.BigDecimal lingchenMinuteNum){
		this.lingchenMinuteNum=lingchenMinuteNum;
	}
	
	
	public java.math.BigDecimal getMidnightMinuteNum(){
		return this.midnightMinuteNum;
	}
	
	public void setMidnightMinuteNum(java.math.BigDecimal midnightMinuteNum){
		this.midnightMinuteNum=midnightMinuteNum;
	}
	
	
	public java.math.BigDecimal getMorningMileage(){
		return this.morningMileage;
	}
	
	public void setMorningMileage(java.math.BigDecimal morningMileage){
		this.morningMileage=morningMileage;
	}
	
	
	public java.math.BigDecimal getNoonMileage(){
		return this.noonMileage;
	}
	
	public void setNoonMileage(java.math.BigDecimal noonMileage){
		this.noonMileage=noonMileage;
	}
	
	
	public java.math.BigDecimal getDuskMileage(){
		return this.duskMileage;
	}
	
	public void setDuskMileage(java.math.BigDecimal duskMileage){
		this.duskMileage=duskMileage;
	}
	
	
	public java.math.BigDecimal getMidnightMileage(){
		return this.midnightMileage;
	}
	
	public void setMidnightMileage(java.math.BigDecimal midnightMileage){
		this.midnightMileage=midnightMileage;
	}
	
	
	public java.math.BigDecimal getLingchenMileage(){
		return this.lingchenMileage;
	}
	
	public void setLingchenMileage(java.math.BigDecimal lingchenMileage){
		this.lingchenMileage=lingchenMileage;
	}
	
	
	public java.lang.String getEmpId(){
		return this.empId;
	}
	
	public void setEmpId(java.lang.String empId){
		this.empId=empId;
	}
	
	
	public java.lang.String getEmpName(){
		return this.empName;
	}
	
	public void setEmpName(java.lang.String empName){
		this.empName=empName;
	}
	
	
	public java.lang.String getEmpCode(){
		return this.empCode;
	}
	
	public void setEmpCode(java.lang.String empCode){
		this.empCode=empCode;
	}
	
	
	public java.lang.String getEmpPhone(){
		return this.empPhone;
	}
	
	public void setEmpPhone(java.lang.String empPhone){
		this.empPhone=empPhone;
	}
	
	
	public java.util.Date getAreaUpTime(){
		return this.areaUpTime;
	}
	
	public void setAreaUpTime(java.util.Date areaUpTime){
		this.areaUpTime=areaUpTime;
	}
	
	
	public java.util.Date getLastPositionTime(){
		return this.lastPositionTime;
	}
	
	public void setLastPositionTime(java.util.Date lastPositionTime){
		this.lastPositionTime=lastPositionTime;
	}
	
	
	public java.lang.String getComId(){
		return this.comId;
	}
	
	public void setComId(java.lang.String comId){
		this.comId=comId;
	}
	
	
	public java.lang.String getComName(){
		return this.comName;
	}
	
	public void setComName(java.lang.String comName){
		this.comName=comName;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", createTime=").append(createTime);			
			sb.append(", provinceId=").append(provinceId);			
			sb.append(", provinceName=").append(provinceName);			
			sb.append(", cityId=").append(cityId);			
			sb.append(", cityName=").append(cityName);			
			sb.append(", xianquId=").append(xianquId);			
			sb.append(", xianquName=").append(xianquName);			
			sb.append(", carPlateNum=").append(carPlateNum);			
			sb.append(", carPlateColour=").append(carPlateColour);			
			sb.append(", carFrameNum=").append(carFrameNum);			
			sb.append(", licenseCode=").append(licenseCode);			
			sb.append(", ownerName=").append(ownerName);			
			sb.append(", ownerPhoneNum=").append(ownerPhoneNum);			
			sb.append(", carType=").append(carType);			
			sb.append(", carBrand=").append(carBrand);			
			sb.append(", carModel=").append(carModel);			
			sb.append(", outsizeLength=").append(outsizeLength);			
			sb.append(", outsizeWidth=").append(outsizeWidth);			
			sb.append(", outsizeHeight=").append(outsizeHeight);			
			sb.append(", beidouOperator=").append(beidouOperator);			
			sb.append(", ownerTeamId=").append(ownerTeamId);			
			sb.append(", ownerTeamName=").append(ownerTeamName);			
			sb.append(", runState=").append(runState);			
			sb.append(", carSource=").append(carSource);			
			sb.append(", longitude=").append(longitude);			
			sb.append(", latitude=").append(latitude);			
			sb.append(", currentProvinceId=").append(currentProvinceId);			
			sb.append(", currentProvinceName=").append(currentProvinceName);			
			sb.append(", currentCityId=").append(currentCityId);			
			sb.append(", currentCityName=").append(currentCityName);			
			sb.append(", currentXianquId=").append(currentXianquId);			
			sb.append(", currentXianquName=").append(currentXianquName);			
			sb.append(", localtionInfo=").append(localtionInfo);			
			sb.append(", dataState=").append(dataState);			
			sb.append(", sortNum=").append(sortNum);			
			sb.append(", onlineState=").append(onlineState);			
			sb.append(", operatFlag=").append(operatFlag);			
			sb.append(", carPlateColorText=").append(carPlateColorText);			
			sb.append(", totalTakeMass=").append(totalTakeMass);			
			sb.append(", totalPullMass=").append(totalPullMass);			
			sb.append(", sitPeopleNum=").append(sitPeopleNum);			
			sb.append(", isSynCar=").append(isSynCar);			
			sb.append(", todayTimeTotal=").append(todayTimeTotal);			
			sb.append(", todayMileageTotal=").append(todayMileageTotal);			
			sb.append(", morningMinuteNum=").append(morningMinuteNum);			
			sb.append(", noonMinuteNum=").append(noonMinuteNum);			
			sb.append(", duskMinuteNum=").append(duskMinuteNum);			
			sb.append(", lingchenMinuteNum=").append(lingchenMinuteNum);			
			sb.append(", midnightMinuteNum=").append(midnightMinuteNum);			
			sb.append(", morningMileage=").append(morningMileage);			
			sb.append(", noonMileage=").append(noonMileage);			
			sb.append(", duskMileage=").append(duskMileage);			
			sb.append(", midnightMileage=").append(midnightMileage);			
			sb.append(", lingchenMileage=").append(lingchenMileage);			
			sb.append(", empId=").append(empId);			
			sb.append(", empName=").append(empName);			
			sb.append(", empCode=").append(empCode);			
			sb.append(", empPhone=").append(empPhone);			
			sb.append(", areaUpTime=").append(areaUpTime);			
			sb.append(", lastPositionTime=").append(lastPositionTime);			
			sb.append(", comId=").append(comId);			
			sb.append(", comName=").append(comName);			
        sb.append("]");
        return sb.toString();
    }

   
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CarInfo other = (CarInfo) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getCreateTime() == null ? other.getId() == null : this.getCreateTime().equals(other.getCreateTime()))		
				        		&&(this.getProvinceId() == null ? other.getId() == null : this.getProvinceId().equals(other.getProvinceId()))		
				        		&&(this.getProvinceName() == null ? other.getId() == null : this.getProvinceName().equals(other.getProvinceName()))		
				        		&&(this.getCityId() == null ? other.getId() == null : this.getCityId().equals(other.getCityId()))		
				        		&&(this.getCityName() == null ? other.getId() == null : this.getCityName().equals(other.getCityName()))		
				        		&&(this.getXianquId() == null ? other.getId() == null : this.getXianquId().equals(other.getXianquId()))		
				        		&&(this.getXianquName() == null ? other.getId() == null : this.getXianquName().equals(other.getXianquName()))		
				        		&&(this.getCarPlateNum() == null ? other.getId() == null : this.getCarPlateNum().equals(other.getCarPlateNum()))		
				        		&&(this.getCarPlateColour() == null ? other.getId() == null : this.getCarPlateColour().equals(other.getCarPlateColour()))		
				        		&&(this.getCarFrameNum() == null ? other.getId() == null : this.getCarFrameNum().equals(other.getCarFrameNum()))		
				        		&&(this.getLicenseCode() == null ? other.getId() == null : this.getLicenseCode().equals(other.getLicenseCode()))		
				        		&&(this.getOwnerName() == null ? other.getId() == null : this.getOwnerName().equals(other.getOwnerName()))		
				        		&&(this.getOwnerPhoneNum() == null ? other.getId() == null : this.getOwnerPhoneNum().equals(other.getOwnerPhoneNum()))		
				        		&&(this.getCarType() == null ? other.getId() == null : this.getCarType().equals(other.getCarType()))		
				        		&&(this.getCarBrand() == null ? other.getId() == null : this.getCarBrand().equals(other.getCarBrand()))		
				        		&&(this.getCarModel() == null ? other.getId() == null : this.getCarModel().equals(other.getCarModel()))		
				        		&&(this.getOutsizeLength() == null ? other.getId() == null : this.getOutsizeLength().equals(other.getOutsizeLength()))		
				        		&&(this.getOutsizeWidth() == null ? other.getId() == null : this.getOutsizeWidth().equals(other.getOutsizeWidth()))		
				        		&&(this.getOutsizeHeight() == null ? other.getId() == null : this.getOutsizeHeight().equals(other.getOutsizeHeight()))		
				        		&&(this.getBeidouOperator() == null ? other.getId() == null : this.getBeidouOperator().equals(other.getBeidouOperator()))		
				        		&&(this.getOwnerTeamId() == null ? other.getId() == null : this.getOwnerTeamId().equals(other.getOwnerTeamId()))		
				        		&&(this.getOwnerTeamName() == null ? other.getId() == null : this.getOwnerTeamName().equals(other.getOwnerTeamName()))		
				        		&&(this.getRunState() == null ? other.getId() == null : this.getRunState().equals(other.getRunState()))		
				        		&&(this.getCarSource() == null ? other.getId() == null : this.getCarSource().equals(other.getCarSource()))		
				        		&&(this.getLongitude() == null ? other.getId() == null : this.getLongitude().equals(other.getLongitude()))		
				        		&&(this.getLatitude() == null ? other.getId() == null : this.getLatitude().equals(other.getLatitude()))		
				        		&&(this.getCurrentProvinceId() == null ? other.getId() == null : this.getCurrentProvinceId().equals(other.getCurrentProvinceId()))		
				        		&&(this.getCurrentProvinceName() == null ? other.getId() == null : this.getCurrentProvinceName().equals(other.getCurrentProvinceName()))		
				        		&&(this.getCurrentCityId() == null ? other.getId() == null : this.getCurrentCityId().equals(other.getCurrentCityId()))		
				        		&&(this.getCurrentCityName() == null ? other.getId() == null : this.getCurrentCityName().equals(other.getCurrentCityName()))		
				        		&&(this.getCurrentXianquId() == null ? other.getId() == null : this.getCurrentXianquId().equals(other.getCurrentXianquId()))		
				        		&&(this.getCurrentXianquName() == null ? other.getId() == null : this.getCurrentXianquName().equals(other.getCurrentXianquName()))		
				        		&&(this.getLocaltionInfo() == null ? other.getId() == null : this.getLocaltionInfo().equals(other.getLocaltionInfo()))		
				        		&&(this.getDataState() == null ? other.getId() == null : this.getDataState().equals(other.getDataState()))		
				        		&&(this.getSortNum() == null ? other.getId() == null : this.getSortNum().equals(other.getSortNum()))		
				        		&&(this.getOnlineState() == null ? other.getId() == null : this.getOnlineState().equals(other.getOnlineState()))		
				        		&&(this.getOperatFlag() == null ? other.getId() == null : this.getOperatFlag().equals(other.getOperatFlag()))		
				        		&&(this.getCarPlateColorText() == null ? other.getId() == null : this.getCarPlateColorText().equals(other.getCarPlateColorText()))		
				        		&&(this.getTotalTakeMass() == null ? other.getId() == null : this.getTotalTakeMass().equals(other.getTotalTakeMass()))		
				        		&&(this.getTotalPullMass() == null ? other.getId() == null : this.getTotalPullMass().equals(other.getTotalPullMass()))		
				        		&&(this.getSitPeopleNum() == null ? other.getId() == null : this.getSitPeopleNum().equals(other.getSitPeopleNum()))		
				        		&&(this.getIsSynCar() == null ? other.getId() == null : this.getIsSynCar().equals(other.getIsSynCar()))		
				        		&&(this.getTodayTimeTotal() == null ? other.getId() == null : this.getTodayTimeTotal().equals(other.getTodayTimeTotal()))		
				        		&&(this.getTodayMileageTotal() == null ? other.getId() == null : this.getTodayMileageTotal().equals(other.getTodayMileageTotal()))		
				        		&&(this.getMorningMinuteNum() == null ? other.getId() == null : this.getMorningMinuteNum().equals(other.getMorningMinuteNum()))		
				        		&&(this.getNoonMinuteNum() == null ? other.getId() == null : this.getNoonMinuteNum().equals(other.getNoonMinuteNum()))		
				        		&&(this.getDuskMinuteNum() == null ? other.getId() == null : this.getDuskMinuteNum().equals(other.getDuskMinuteNum()))		
				        		&&(this.getLingchenMinuteNum() == null ? other.getId() == null : this.getLingchenMinuteNum().equals(other.getLingchenMinuteNum()))		
				        		&&(this.getMidnightMinuteNum() == null ? other.getId() == null : this.getMidnightMinuteNum().equals(other.getMidnightMinuteNum()))		
				        		&&(this.getMorningMileage() == null ? other.getId() == null : this.getMorningMileage().equals(other.getMorningMileage()))		
				        		&&(this.getNoonMileage() == null ? other.getId() == null : this.getNoonMileage().equals(other.getNoonMileage()))		
				        		&&(this.getDuskMileage() == null ? other.getId() == null : this.getDuskMileage().equals(other.getDuskMileage()))		
				        		&&(this.getMidnightMileage() == null ? other.getId() == null : this.getMidnightMileage().equals(other.getMidnightMileage()))		
				        		&&(this.getLingchenMileage() == null ? other.getId() == null : this.getLingchenMileage().equals(other.getLingchenMileage()))		
				        		&&(this.getEmpId() == null ? other.getId() == null : this.getEmpId().equals(other.getEmpId()))		
				        		&&(this.getEmpName() == null ? other.getId() == null : this.getEmpName().equals(other.getEmpName()))		
				        		&&(this.getEmpCode() == null ? other.getId() == null : this.getEmpCode().equals(other.getEmpCode()))		
				        		&&(this.getEmpPhone() == null ? other.getId() == null : this.getEmpPhone().equals(other.getEmpPhone()))		
				        		&&(this.getAreaUpTime() == null ? other.getId() == null : this.getAreaUpTime().equals(other.getAreaUpTime()))		
				        		&&(this.getLastPositionTime() == null ? other.getId() == null : this.getLastPositionTime().equals(other.getLastPositionTime()))		
				        		&&(this.getComId() == null ? other.getId() == null : this.getComId().equals(other.getComId()))		
				        		&&(this.getComName() == null ? other.getId() == null : this.getComName().equals(other.getComName()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());		
		        result = prime * result + ((getProvinceId() == null) ? 0 : getProvinceId().hashCode());		
		        result = prime * result + ((getProvinceName() == null) ? 0 : getProvinceName().hashCode());		
		        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());		
		        result = prime * result + ((getCityName() == null) ? 0 : getCityName().hashCode());		
		        result = prime * result + ((getXianquId() == null) ? 0 : getXianquId().hashCode());		
		        result = prime * result + ((getXianquName() == null) ? 0 : getXianquName().hashCode());		
		        result = prime * result + ((getCarPlateNum() == null) ? 0 : getCarPlateNum().hashCode());		
		        result = prime * result + ((getCarPlateColour() == null) ? 0 : getCarPlateColour().hashCode());		
		        result = prime * result + ((getCarFrameNum() == null) ? 0 : getCarFrameNum().hashCode());		
		        result = prime * result + ((getLicenseCode() == null) ? 0 : getLicenseCode().hashCode());		
		        result = prime * result + ((getOwnerName() == null) ? 0 : getOwnerName().hashCode());		
		        result = prime * result + ((getOwnerPhoneNum() == null) ? 0 : getOwnerPhoneNum().hashCode());		
		        result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());		
		        result = prime * result + ((getCarBrand() == null) ? 0 : getCarBrand().hashCode());		
		        result = prime * result + ((getCarModel() == null) ? 0 : getCarModel().hashCode());		
		        result = prime * result + ((getOutsizeLength() == null) ? 0 : getOutsizeLength().hashCode());		
		        result = prime * result + ((getOutsizeWidth() == null) ? 0 : getOutsizeWidth().hashCode());		
		        result = prime * result + ((getOutsizeHeight() == null) ? 0 : getOutsizeHeight().hashCode());		
		        result = prime * result + ((getBeidouOperator() == null) ? 0 : getBeidouOperator().hashCode());		
		        result = prime * result + ((getOwnerTeamId() == null) ? 0 : getOwnerTeamId().hashCode());		
		        result = prime * result + ((getOwnerTeamName() == null) ? 0 : getOwnerTeamName().hashCode());		
		        result = prime * result + ((getRunState() == null) ? 0 : getRunState().hashCode());		
		        result = prime * result + ((getCarSource() == null) ? 0 : getCarSource().hashCode());		
		        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());		
		        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());		
		        result = prime * result + ((getCurrentProvinceId() == null) ? 0 : getCurrentProvinceId().hashCode());		
		        result = prime * result + ((getCurrentProvinceName() == null) ? 0 : getCurrentProvinceName().hashCode());		
		        result = prime * result + ((getCurrentCityId() == null) ? 0 : getCurrentCityId().hashCode());		
		        result = prime * result + ((getCurrentCityName() == null) ? 0 : getCurrentCityName().hashCode());		
		        result = prime * result + ((getCurrentXianquId() == null) ? 0 : getCurrentXianquId().hashCode());		
		        result = prime * result + ((getCurrentXianquName() == null) ? 0 : getCurrentXianquName().hashCode());		
		        result = prime * result + ((getLocaltionInfo() == null) ? 0 : getLocaltionInfo().hashCode());		
		        result = prime * result + ((getDataState() == null) ? 0 : getDataState().hashCode());		
		        result = prime * result + ((getSortNum() == null) ? 0 : getSortNum().hashCode());		
		        result = prime * result + ((getOnlineState() == null) ? 0 : getOnlineState().hashCode());		
		        result = prime * result + ((getOperatFlag() == null) ? 0 : getOperatFlag().hashCode());		
		        result = prime * result + ((getCarPlateColorText() == null) ? 0 : getCarPlateColorText().hashCode());		
		        result = prime * result + ((getTotalTakeMass() == null) ? 0 : getTotalTakeMass().hashCode());		
		        result = prime * result + ((getTotalPullMass() == null) ? 0 : getTotalPullMass().hashCode());		
		        result = prime * result + ((getSitPeopleNum() == null) ? 0 : getSitPeopleNum().hashCode());		
		        result = prime * result + ((getIsSynCar() == null) ? 0 : getIsSynCar().hashCode());		
		        result = prime * result + ((getTodayTimeTotal() == null) ? 0 : getTodayTimeTotal().hashCode());		
		        result = prime * result + ((getTodayMileageTotal() == null) ? 0 : getTodayMileageTotal().hashCode());		
		        result = prime * result + ((getMorningMinuteNum() == null) ? 0 : getMorningMinuteNum().hashCode());		
		        result = prime * result + ((getNoonMinuteNum() == null) ? 0 : getNoonMinuteNum().hashCode());		
		        result = prime * result + ((getDuskMinuteNum() == null) ? 0 : getDuskMinuteNum().hashCode());		
		        result = prime * result + ((getLingchenMinuteNum() == null) ? 0 : getLingchenMinuteNum().hashCode());		
		        result = prime * result + ((getMidnightMinuteNum() == null) ? 0 : getMidnightMinuteNum().hashCode());		
		        result = prime * result + ((getMorningMileage() == null) ? 0 : getMorningMileage().hashCode());		
		        result = prime * result + ((getNoonMileage() == null) ? 0 : getNoonMileage().hashCode());		
		        result = prime * result + ((getDuskMileage() == null) ? 0 : getDuskMileage().hashCode());		
		        result = prime * result + ((getMidnightMileage() == null) ? 0 : getMidnightMileage().hashCode());		
		        result = prime * result + ((getLingchenMileage() == null) ? 0 : getLingchenMileage().hashCode());		
		        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());		
		        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());		
		        result = prime * result + ((getEmpCode() == null) ? 0 : getEmpCode().hashCode());		
		        result = prime * result + ((getEmpPhone() == null) ? 0 : getEmpPhone().hashCode());		
		        result = prime * result + ((getAreaUpTime() == null) ? 0 : getAreaUpTime().hashCode());		
		        result = prime * result + ((getLastPositionTime() == null) ? 0 : getLastPositionTime().hashCode());		
		        result = prime * result + ((getComId() == null) ? 0 : getComId().hashCode());		
		        result = prime * result + ((getComName() == null) ? 0 : getComName().hashCode());		
		;
        return result;
    }

}
