package com.edgedo.sys.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

@TableName("bigdata_alarm_record")
public class BigdataAlarmRecord implements Serializable{
	
		
	/**
	 * 属性描述:主键
	 */
	@TableField(value="ID",exist=true)
	java.lang.String id;
	
	/**
	 * 属性描述:业务主键
	 */
	@TableField(value="B_ID",exist=true)
	java.lang.String bid;
	
	/**
	 * 属性描述:运营商id
	 */
	@TableField(value="COMP_ID",exist=true)
	java.lang.String compId;
	
	/**
	 * 属性描述:运营商名称
	 */
	@TableField(value="COMP_NAME",exist=true)
	java.lang.String compName;
	
	/**
	 * 属性描述:创建时间
	 */
	@TableField(value="CREATE_TIME",exist=true)
	java.util.Date createTime;
	
	/**
	 * 属性描述:车牌号码
	 */
	@TableField(value="CAR_PLATE_NUM",exist=true)
	java.lang.String carPlateNum;
	
	/**
	 * 属性描述:车牌颜色
	 */
	@TableField(value="CAR_PLATE_COLOR",exist=true)
	java.lang.String carPlateColor;
	
	/**
	 * 属性描述:车辆类型
	 */
	@TableField(value="CAR_TYPE",exist=true)
	java.lang.String carType;
	
	/**
	 * 属性描述:SIM卡号
	 */
	@TableField(value="SIM_CODE",exist=true)
	java.lang.String simCode;
	
	/**
	 * 属性描述:报警类型（报警类型 1线路报警2超速报警3紧急报警4疲劳驾驶）
	 */
	@TableField(value="ALARM_TYPE",exist=true)
	java.lang.String alarmType;
	
	/**
	 * 属性描述:报警时间
	 */
	@TableField(value="ALARM_TIME",exist=true)
	java.util.Date alarmTime;
	
	/**
	 * 属性描述:司机
	 */
	@TableField(value="DRIVER",exist=true)
	java.lang.String driver;
	
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
	 * 属性描述:报警种类(1平台 2终端)
	 */
	@TableField(value="ALARM_CLS",exist=true)
	java.lang.String alarmCls;
	
	/**
	 * 属性描述:报警速度
	 */
	@TableField(value="ALARM_SPEED",exist=true)
	java.math.BigDecimal alarmSpeed;
	
	/**
	 * 属性描述:道路等级
	 */
	@TableField(value="ROAD_LEVEL",exist=true)
	java.lang.String roadLevel;
	
	/**
	 * 属性描述:道路限速值
	 */
	@TableField(value="ROAD_SPEED_LIMIT",exist=true)
	java.math.BigDecimal roadSpeedLimit;
	
	/**
	 * 属性描述:时长
	 */
	@TableField(value="ALARM_TIME_INFO",exist=true)
	java.lang.String alarmTimeInfo;
	
	/**
	 * 属性描述:时长秒
	 */
	@TableField(value="ALARM_TIME_SECOND",exist=true)
	java.math.BigDecimal alarmTimeSecond;
	
	/**
	 * 属性描述:是否严重
	 */
	@TableField(value="SERIOUS_FLAG",exist=true)
	java.lang.String seriousFlag;
	
	/**
	 * 属性描述:是否是危险时段
	 */
	@TableField(value="DANGER_TIME_FLAG",exist=true)
	java.lang.String dangerTimeFlag;
	
	/**
	 * 属性描述:报警状态(报警状态 0未处理1系统处理2人工处理)
	 */
	@TableField(value="ALARM_STATE",exist=true)
	java.lang.String alarmState;
	
	/**
	 * 属性描述:处理类型
	 */
	@TableField(value="DEAL_TYPE",exist=true)
	java.lang.String dealType;
	
	/**
	 * 属性描述:处理备注
	 */
	@TableField(value="DEAL_REMARK",exist=true)
	java.lang.String dealRemark;
	
	/**
	 * 属性描述:处理时间
	 */
	@TableField(value="DEAL_TIME",exist=true)
	java.util.Date dealTime;
	
	/**
	 * 属性描述:数据是否合格
	 */
	@TableField(value="DATA_QUALIFIED",exist=true)
	java.lang.String dataQualified;
	
	/**
	 * 属性描述:不合格原因
	 */
	@TableField(value="FAIL_REASON",exist=true)
	java.lang.String failReason;
	
	/**
	 * 属性描述:locationInfoDesc
	 */
	@TableField(value="LOCATION_INFO_DESC",exist=true)
	java.lang.String locationInfoDesc;
	
	/**
	 * 属性描述:locationInfoSimple
	 */
	@TableField(value="LOCATION_INFO_SIMPLE",exist=true)
	java.lang.String locationInfoSimple;
	
	/**
	 * 属性描述:countDate
	 */
	@TableField(value="COUNT_DATE",exist=true)
	java.lang.Integer countDate;
	
	/**
	 * 属性描述:countMonth
	 */
	@TableField(value="COUNT_MONTH",exist=true)
	java.lang.Integer countMonth;
	
	/**
	 * 属性描述:isReadLocation
	 */
	@TableField(value="IS_READ_LOCATION",exist=true)
	java.lang.String isReadLocation;
	
	/**
	 * 属性描述:isLocalplace
	 */
	@TableField(value="IS_LOCALPLACE",exist=true)
	java.lang.String isLocalplace;
	
	/**
	 * 属性描述:isHighWay
	 */
	@TableField(value="IS_HIGH_WAY",exist=true)
	java.lang.String isHighWay;
	
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
	
	
	
	
	
	
	public java.lang.String getId(){
		return this.id;
	}
	
	public void setId(java.lang.String id){
		this.id=id;
	}
	
	
	public java.lang.String getBid(){
		return this.bid;
	}
	
	public void setBid(java.lang.String bid){
		this.bid=bid;
	}
	
	
	public java.lang.String getCompId(){
		return this.compId;
	}
	
	public void setCompId(java.lang.String compId){
		this.compId=compId;
	}
	
	
	public java.lang.String getCompName(){
		return this.compName;
	}
	
	public void setCompName(java.lang.String compName){
		this.compName=compName;
	}
	
	
	public java.util.Date getCreateTime(){
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date createTime){
		this.createTime=createTime;
	}
	
	
	public java.lang.String getCarPlateNum(){
		return this.carPlateNum;
	}
	
	public void setCarPlateNum(java.lang.String carPlateNum){
		this.carPlateNum=carPlateNum;
	}
	
	
	public java.lang.String getCarPlateColor(){
		return this.carPlateColor;
	}
	
	public void setCarPlateColor(java.lang.String carPlateColor){
		this.carPlateColor=carPlateColor;
	}
	
	
	public java.lang.String getCarType(){
		return this.carType;
	}
	
	public void setCarType(java.lang.String carType){
		this.carType=carType;
	}
	
	
	public java.lang.String getSimCode(){
		return this.simCode;
	}
	
	public void setSimCode(java.lang.String simCode){
		this.simCode=simCode;
	}
	
	
	public java.lang.String getAlarmType(){
		return this.alarmType;
	}
	
	public void setAlarmType(java.lang.String alarmType){
		this.alarmType=alarmType;
	}
	
	
	public java.util.Date getAlarmTime(){
		return this.alarmTime;
	}
	
	public void setAlarmTime(java.util.Date alarmTime){
		this.alarmTime=alarmTime;
	}
	
	
	public java.lang.String getDriver(){
		return this.driver;
	}
	
	public void setDriver(java.lang.String driver){
		this.driver=driver;
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
	
	
	public java.lang.String getAlarmCls(){
		return this.alarmCls;
	}
	
	public void setAlarmCls(java.lang.String alarmCls){
		this.alarmCls=alarmCls;
	}
	
	
	public java.math.BigDecimal getAlarmSpeed(){
		return this.alarmSpeed;
	}
	
	public void setAlarmSpeed(java.math.BigDecimal alarmSpeed){
		this.alarmSpeed=alarmSpeed;
	}
	
	
	public java.lang.String getRoadLevel(){
		return this.roadLevel;
	}
	
	public void setRoadLevel(java.lang.String roadLevel){
		this.roadLevel=roadLevel;
	}
	
	
	public java.math.BigDecimal getRoadSpeedLimit(){
		return this.roadSpeedLimit;
	}
	
	public void setRoadSpeedLimit(java.math.BigDecimal roadSpeedLimit){
		this.roadSpeedLimit=roadSpeedLimit;
	}
	
	
	public java.lang.String getAlarmTimeInfo(){
		return this.alarmTimeInfo;
	}
	
	public void setAlarmTimeInfo(java.lang.String alarmTimeInfo){
		this.alarmTimeInfo=alarmTimeInfo;
	}
	
	
	public java.math.BigDecimal getAlarmTimeSecond(){
		return this.alarmTimeSecond;
	}
	
	public void setAlarmTimeSecond(java.math.BigDecimal alarmTimeSecond){
		this.alarmTimeSecond=alarmTimeSecond;
	}
	
	
	public java.lang.String getSeriousFlag(){
		return this.seriousFlag;
	}
	
	public void setSeriousFlag(java.lang.String seriousFlag){
		this.seriousFlag=seriousFlag;
	}
	
	
	public java.lang.String getDangerTimeFlag(){
		return this.dangerTimeFlag;
	}
	
	public void setDangerTimeFlag(java.lang.String dangerTimeFlag){
		this.dangerTimeFlag=dangerTimeFlag;
	}
	
	
	public java.lang.String getAlarmState(){
		return this.alarmState;
	}
	
	public void setAlarmState(java.lang.String alarmState){
		this.alarmState=alarmState;
	}
	
	
	public java.lang.String getDealType(){
		return this.dealType;
	}
	
	public void setDealType(java.lang.String dealType){
		this.dealType=dealType;
	}
	
	
	public java.lang.String getDealRemark(){
		return this.dealRemark;
	}
	
	public void setDealRemark(java.lang.String dealRemark){
		this.dealRemark=dealRemark;
	}
	
	
	public java.util.Date getDealTime(){
		return this.dealTime;
	}
	
	public void setDealTime(java.util.Date dealTime){
		this.dealTime=dealTime;
	}
	
	
	public java.lang.String getDataQualified(){
		return this.dataQualified;
	}
	
	public void setDataQualified(java.lang.String dataQualified){
		this.dataQualified=dataQualified;
	}
	
	
	public java.lang.String getFailReason(){
		return this.failReason;
	}
	
	public void setFailReason(java.lang.String failReason){
		this.failReason=failReason;
	}
	
	
	public java.lang.String getLocationInfoDesc(){
		return this.locationInfoDesc;
	}
	
	public void setLocationInfoDesc(java.lang.String locationInfoDesc){
		this.locationInfoDesc=locationInfoDesc;
	}
	
	
	public java.lang.String getLocationInfoSimple(){
		return this.locationInfoSimple;
	}
	
	public void setLocationInfoSimple(java.lang.String locationInfoSimple){
		this.locationInfoSimple=locationInfoSimple;
	}
	
	
	public java.lang.Integer getCountDate(){
		return this.countDate;
	}
	
	public void setCountDate(java.lang.Integer countDate){
		this.countDate=countDate;
	}
	
	
	public java.lang.Integer getCountMonth(){
		return this.countMonth;
	}
	
	public void setCountMonth(java.lang.Integer countMonth){
		this.countMonth=countMonth;
	}
	
	
	public java.lang.String getIsReadLocation(){
		return this.isReadLocation;
	}
	
	public void setIsReadLocation(java.lang.String isReadLocation){
		this.isReadLocation=isReadLocation;
	}
	
	
	public java.lang.String getIsLocalplace(){
		return this.isLocalplace;
	}
	
	public void setIsLocalplace(java.lang.String isLocalplace){
		this.isLocalplace=isLocalplace;
	}
	
	
	public java.lang.String getIsHighWay(){
		return this.isHighWay;
	}
	
	public void setIsHighWay(java.lang.String isHighWay){
		this.isHighWay=isHighWay;
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
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", bid=").append(bid);			
			sb.append(", compId=").append(compId);			
			sb.append(", compName=").append(compName);			
			sb.append(", createTime=").append(createTime);			
			sb.append(", carPlateNum=").append(carPlateNum);			
			sb.append(", carPlateColor=").append(carPlateColor);			
			sb.append(", carType=").append(carType);			
			sb.append(", simCode=").append(simCode);			
			sb.append(", alarmType=").append(alarmType);			
			sb.append(", alarmTime=").append(alarmTime);			
			sb.append(", driver=").append(driver);			
			sb.append(", longitude=").append(longitude);			
			sb.append(", latitude=").append(latitude);			
			sb.append(", alarmCls=").append(alarmCls);			
			sb.append(", alarmSpeed=").append(alarmSpeed);			
			sb.append(", roadLevel=").append(roadLevel);			
			sb.append(", roadSpeedLimit=").append(roadSpeedLimit);			
			sb.append(", alarmTimeInfo=").append(alarmTimeInfo);			
			sb.append(", alarmTimeSecond=").append(alarmTimeSecond);			
			sb.append(", seriousFlag=").append(seriousFlag);			
			sb.append(", dangerTimeFlag=").append(dangerTimeFlag);			
			sb.append(", alarmState=").append(alarmState);			
			sb.append(", dealType=").append(dealType);			
			sb.append(", dealRemark=").append(dealRemark);			
			sb.append(", dealTime=").append(dealTime);			
			sb.append(", dataQualified=").append(dataQualified);			
			sb.append(", failReason=").append(failReason);			
			sb.append(", locationInfoDesc=").append(locationInfoDesc);			
			sb.append(", locationInfoSimple=").append(locationInfoSimple);			
			sb.append(", countDate=").append(countDate);			
			sb.append(", countMonth=").append(countMonth);			
			sb.append(", isReadLocation=").append(isReadLocation);			
			sb.append(", isLocalplace=").append(isLocalplace);			
			sb.append(", isHighWay=").append(isHighWay);			
			sb.append(", empId=").append(empId);			
			sb.append(", empName=").append(empName);			
			sb.append(", empCode=").append(empCode);			
			sb.append(", empPhone=").append(empPhone);			
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
        BigdataAlarmRecord other = (BigdataAlarmRecord) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getBid() == null ? other.getId() == null : this.getBid().equals(other.getBid()))		
				        		&&(this.getCompId() == null ? other.getId() == null : this.getCompId().equals(other.getCompId()))		
				        		&&(this.getCompName() == null ? other.getId() == null : this.getCompName().equals(other.getCompName()))		
				        		&&(this.getCreateTime() == null ? other.getId() == null : this.getCreateTime().equals(other.getCreateTime()))		
				        		&&(this.getCarPlateNum() == null ? other.getId() == null : this.getCarPlateNum().equals(other.getCarPlateNum()))		
				        		&&(this.getCarPlateColor() == null ? other.getId() == null : this.getCarPlateColor().equals(other.getCarPlateColor()))		
				        		&&(this.getCarType() == null ? other.getId() == null : this.getCarType().equals(other.getCarType()))		
				        		&&(this.getSimCode() == null ? other.getId() == null : this.getSimCode().equals(other.getSimCode()))		
				        		&&(this.getAlarmType() == null ? other.getId() == null : this.getAlarmType().equals(other.getAlarmType()))		
				        		&&(this.getAlarmTime() == null ? other.getId() == null : this.getAlarmTime().equals(other.getAlarmTime()))		
				        		&&(this.getDriver() == null ? other.getId() == null : this.getDriver().equals(other.getDriver()))		
				        		&&(this.getLongitude() == null ? other.getId() == null : this.getLongitude().equals(other.getLongitude()))		
				        		&&(this.getLatitude() == null ? other.getId() == null : this.getLatitude().equals(other.getLatitude()))		
				        		&&(this.getAlarmCls() == null ? other.getId() == null : this.getAlarmCls().equals(other.getAlarmCls()))		
				        		&&(this.getAlarmSpeed() == null ? other.getId() == null : this.getAlarmSpeed().equals(other.getAlarmSpeed()))		
				        		&&(this.getRoadLevel() == null ? other.getId() == null : this.getRoadLevel().equals(other.getRoadLevel()))		
				        		&&(this.getRoadSpeedLimit() == null ? other.getId() == null : this.getRoadSpeedLimit().equals(other.getRoadSpeedLimit()))		
				        		&&(this.getAlarmTimeInfo() == null ? other.getId() == null : this.getAlarmTimeInfo().equals(other.getAlarmTimeInfo()))		
				        		&&(this.getAlarmTimeSecond() == null ? other.getId() == null : this.getAlarmTimeSecond().equals(other.getAlarmTimeSecond()))		
				        		&&(this.getSeriousFlag() == null ? other.getId() == null : this.getSeriousFlag().equals(other.getSeriousFlag()))		
				        		&&(this.getDangerTimeFlag() == null ? other.getId() == null : this.getDangerTimeFlag().equals(other.getDangerTimeFlag()))		
				        		&&(this.getAlarmState() == null ? other.getId() == null : this.getAlarmState().equals(other.getAlarmState()))		
				        		&&(this.getDealType() == null ? other.getId() == null : this.getDealType().equals(other.getDealType()))		
				        		&&(this.getDealRemark() == null ? other.getId() == null : this.getDealRemark().equals(other.getDealRemark()))		
				        		&&(this.getDealTime() == null ? other.getId() == null : this.getDealTime().equals(other.getDealTime()))		
				        		&&(this.getDataQualified() == null ? other.getId() == null : this.getDataQualified().equals(other.getDataQualified()))		
				        		&&(this.getFailReason() == null ? other.getId() == null : this.getFailReason().equals(other.getFailReason()))		
				        		&&(this.getLocationInfoDesc() == null ? other.getId() == null : this.getLocationInfoDesc().equals(other.getLocationInfoDesc()))		
				        		&&(this.getLocationInfoSimple() == null ? other.getId() == null : this.getLocationInfoSimple().equals(other.getLocationInfoSimple()))		
				        		&&(this.getCountDate() == null ? other.getId() == null : this.getCountDate().equals(other.getCountDate()))		
				        		&&(this.getCountMonth() == null ? other.getId() == null : this.getCountMonth().equals(other.getCountMonth()))		
				        		&&(this.getIsReadLocation() == null ? other.getId() == null : this.getIsReadLocation().equals(other.getIsReadLocation()))		
				        		&&(this.getIsLocalplace() == null ? other.getId() == null : this.getIsLocalplace().equals(other.getIsLocalplace()))		
				        		&&(this.getIsHighWay() == null ? other.getId() == null : this.getIsHighWay().equals(other.getIsHighWay()))		
				        		&&(this.getEmpId() == null ? other.getId() == null : this.getEmpId().equals(other.getEmpId()))		
				        		&&(this.getEmpName() == null ? other.getId() == null : this.getEmpName().equals(other.getEmpName()))		
				        		&&(this.getEmpCode() == null ? other.getId() == null : this.getEmpCode().equals(other.getEmpCode()))		
				        		&&(this.getEmpPhone() == null ? other.getId() == null : this.getEmpPhone().equals(other.getEmpPhone()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());		
		        result = prime * result + ((getCompId() == null) ? 0 : getCompId().hashCode());		
		        result = prime * result + ((getCompName() == null) ? 0 : getCompName().hashCode());		
		        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());		
		        result = prime * result + ((getCarPlateNum() == null) ? 0 : getCarPlateNum().hashCode());		
		        result = prime * result + ((getCarPlateColor() == null) ? 0 : getCarPlateColor().hashCode());		
		        result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());		
		        result = prime * result + ((getSimCode() == null) ? 0 : getSimCode().hashCode());		
		        result = prime * result + ((getAlarmType() == null) ? 0 : getAlarmType().hashCode());		
		        result = prime * result + ((getAlarmTime() == null) ? 0 : getAlarmTime().hashCode());		
		        result = prime * result + ((getDriver() == null) ? 0 : getDriver().hashCode());		
		        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());		
		        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());		
		        result = prime * result + ((getAlarmCls() == null) ? 0 : getAlarmCls().hashCode());		
		        result = prime * result + ((getAlarmSpeed() == null) ? 0 : getAlarmSpeed().hashCode());		
		        result = prime * result + ((getRoadLevel() == null) ? 0 : getRoadLevel().hashCode());		
		        result = prime * result + ((getRoadSpeedLimit() == null) ? 0 : getRoadSpeedLimit().hashCode());		
		        result = prime * result + ((getAlarmTimeInfo() == null) ? 0 : getAlarmTimeInfo().hashCode());		
		        result = prime * result + ((getAlarmTimeSecond() == null) ? 0 : getAlarmTimeSecond().hashCode());		
		        result = prime * result + ((getSeriousFlag() == null) ? 0 : getSeriousFlag().hashCode());		
		        result = prime * result + ((getDangerTimeFlag() == null) ? 0 : getDangerTimeFlag().hashCode());		
		        result = prime * result + ((getAlarmState() == null) ? 0 : getAlarmState().hashCode());		
		        result = prime * result + ((getDealType() == null) ? 0 : getDealType().hashCode());		
		        result = prime * result + ((getDealRemark() == null) ? 0 : getDealRemark().hashCode());		
		        result = prime * result + ((getDealTime() == null) ? 0 : getDealTime().hashCode());		
		        result = prime * result + ((getDataQualified() == null) ? 0 : getDataQualified().hashCode());		
		        result = prime * result + ((getFailReason() == null) ? 0 : getFailReason().hashCode());		
		        result = prime * result + ((getLocationInfoDesc() == null) ? 0 : getLocationInfoDesc().hashCode());		
		        result = prime * result + ((getLocationInfoSimple() == null) ? 0 : getLocationInfoSimple().hashCode());		
		        result = prime * result + ((getCountDate() == null) ? 0 : getCountDate().hashCode());		
		        result = prime * result + ((getCountMonth() == null) ? 0 : getCountMonth().hashCode());		
		        result = prime * result + ((getIsReadLocation() == null) ? 0 : getIsReadLocation().hashCode());		
		        result = prime * result + ((getIsLocalplace() == null) ? 0 : getIsLocalplace().hashCode());		
		        result = prime * result + ((getIsHighWay() == null) ? 0 : getIsHighWay().hashCode());		
		        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());		
		        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());		
		        result = prime * result + ((getEmpCode() == null) ? 0 : getEmpCode().hashCode());		
		        result = prime * result + ((getEmpPhone() == null) ? 0 : getEmpPhone().hashCode());		
		;
        return result;
    }

}
